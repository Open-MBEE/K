function loadExample(e,name){
    results.setValue('');
    $.ajax({
	url: "http://niks.jpl.nasa.gov/K/k/" + name,
	success: function(data, status, xhr) {
	    $("#resultsPanel").removeClass("panel-success");
	    $("#resultsPanel").removeClass("panel-warning");
	    $("#resultsPanel").removeClass("panel-danger");
	    $("#resultsPanel").addClass("panel-success");
	    
	    e.setValue(data);
	},
	error: function(data, status, xhr) {
	    alert("Error when loading example.");
	}
    });
    return false;
}

$('canvas').hide();

var working = 0;
function doWork() {
    if(working == 1) return;
    working = 1;
    $('canvas').show();
    results.setValue('');
    $.ajax({
	type: "post",
	data: editor.getValue(),
	url: "http://niks.jpl.nasa.gov/k-service",
	success: function(data, status, xhr) {
	    if(data.indexOf("UNSAT due") > -1){
		$("#resultsPanel").removeClass("panel-success");
		$("#resultsPanel").removeClass("panel-warning");
		$("#resultsPanel").removeClass("panel-danger");
		$("#resultsPanel").addClass("panel-danger");
	    }
	    else if(data.indexOf("Timeout") > -1){
		$("#resultsPanel").removeClass("panel-success");
		$("#resultsPanel").removeClass("panel-warning");
		$("#resultsPanel").removeClass("panel-danger");
		$("#resultsPanel").addClass("panel-warning");
	    }      
	    else{
		$("#resultsPanel").removeClass("panel-success");
		$("#resultsPanel").removeClass("panel-warning");
		$("#resultsPanel").removeClass("panel-danger");
		$("#resultsPanel").addClass("panel-success");
	    }
	    results.setValue(data);
	    $('canvas').hide();
	    working = 0;
	},
	error: function(data, status, xhr) {
	    $('canvas').hide();
	    alert("Error while executing. Please try again.");
	    working = 0;
	}
    });
    return false;
}

var cog = new Image();
function init() {
    cog.src = 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABsAAAAbCAYAAACN1PRVAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAABK1JREFUeNqMVt1ZGzkUvVfS4IW1l8GO82w6IBXE7mCpAFMB+Pt4Z6iApALcAe4AU0HoAJfg7BPYHinnXmmciX+y0YdmJHnQ0bk/R5cvh5cUyFPwRD4EChgEvGWMB36R3+JaiTkmD5gOs8yNb25uLlerFf1pM2yIGA82TEY7xow1oj4GBU6S6yywPNG4JwDH+XGv0Whs7ndN8n97mmPsLCSYgy7ImPQE/pFDyAF+7L0fgTNFUDBcLal90taD1doQ/T6NT9DnW8zkT+jJuQVYukG3hifCVk/L3JOxMBa8VVlSp9MhHKLaB+zpNo1fdgEpmByuMqUAV5viOQLwXNax9KBAFNEEpN1pUwnQmvl6aTza6zNjrCKaymeyOdYAMgfg18iG4T/qw+AC94zvpzDjcwqOXo3VGH26H0xMZ7jPxgT0R2zUi4BYt6bAfEbJvJFZKA4ODgZ5nhcJLE9mk35X21vWC/TXKmiwr2xszoQd/PQv3t/QCzY2twpqBpb5FKOp+hCgzWaTWq0W1Xx0ij5An9WC5VtiLMwvNBrVaSGMvQk5jHQVPN7sb0HzAtE+QJrNgrcUNEARieWCut0ugR0tl8sKcJ5Ahc3jRviPK8ZGTaaBwGKyT+gTiwM4a3Jrba6MbeVXo5F4kp9shn29ndUYC9vLirGDXzRhrYhD8DME5Hkg22df5rDYS/RXmVIsaP/Q/SXs600YnifTjbeSWliEdTYb3QyTqYfdDKTL4B1KS6tVqf6SgGq3P9BvZGpvNIrPCgVKZlGlCDQDxJiCjVppCab05DJHzb+b1Gm36X80cVjLuzozexs0f6IgRkA5XRhzIixRL1+IzhwdHVHrn1Y9oXe1i10aKT6bGGhg1CKK+cT0zCGCs0oXTIogybJMw/779//o48duMvnO9rzLn+Kz8wgS5Shqo4njpCoOQA5Ajb8adHh4SMvVghaLhYb/HsBip88krNVISSEigOlhjmi0LziNhr6wOsgO9C1339vbGznnNAU2AM9Svk235cqKieKGkldAf7DGvTrjnjJnzyQoMu0ZTuZgUqvmlYR+f39XIE4uqCX1E/rDZpCYmKwOOmivAfYK9KF1AM7EdG4uAMLAOjmQideQXOJQkyUisqYiFRhtSFbxCxj8do0T30dmTvLhC+an0MZZVBHX09tBTG4qFigZEJEChjTIEwtRik81Qa7uOQU0IrYAe7FRjqYw6SlYjgAyN1GmHsFIGPfVnxzFuFITKEkfYK+oWZ5qKlIkcZ7UE92oXBmeIgIxtAO5UtSHqo9uiLW+sme5ejSIRASeAFR4LYy8MMzL1aq3EYWzJF28BgMEzGYpBkrMKelgl+P6uTcVY8NjLYyYPwMTCcufSaouH6al9xNJcjC82vDb9uVZKbrWIumNO+waVsu1TCC+Wxcg6xaSpsZSYM2wLO9/U8qZWH+wztQnsfAxV/E3MIKZVf1FsmJVV8mamhEmxZ0X7sSsABsGv1tZJGejmptU7FBUDYzPAXQBwFEEl+9+stFEroJEci2ELwIMmZuWoSTE9DYYcWVCjlJrZWMpeBhlAEqBiulPE84S3ixU5gSTwGGOdyEVNJXxA8nPevshwABHktBS1YoQ+QAAAABJRU5ErkJggg=='; // Set source path
    setInterval(draw,10);
}
var rotation = 0;
function draw(){
    var ctx = document.getElementById('myCanvas').getContext('2d');
    ctx.globalCompositeOperation = 'destination-over';
    ctx.save();
    ctx.clearRect(0,0,27,27);
    ctx.translate(13.5,13.5); // to get it in the origin
    rotation +=1;
    ctx.rotate(rotation*Math.PI/64); //rotate in origin
    ctx.translate(-13.5,-13.5); //put it back
    ctx.drawImage(cog,0,0);
    ctx.restore();
}
init();
