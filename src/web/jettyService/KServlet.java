
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import java.util.Random;
 
public class KServlet extends AbstractHandler
{
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) 
        throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

        baseRequest.setHandled(true);

	String model = getPostData(request);
        response.getWriter().println(processModel(model));
    }

    public static String processModel(String model) {
	try{
	    Random rand = new Random();
	    int  n = rand.nextInt(50) + 1;

	    File file = new File("/tmp/file" + n);
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(model);
	    bw.close();
	    StringBuilder sb = new StringBuilder();
	    String line;
	    String[] cmd = new String[]{"bash", "-c", "/home/rahulku/k/krun " + file.getAbsolutePath()};
	    Process p = Runtime.getRuntime().exec(cmd);
	    BufferedReader bri = new BufferedReader
		(new InputStreamReader(p.getInputStream()));
	    BufferedReader bre = new BufferedReader
		(new InputStreamReader(p.getErrorStream()));
	    while ((line = bri.readLine()) != null) {
		sb.append(line).append("\n");
	    }
	    bri.close();
	    while ((line = bre.readLine()) != null) {
		sb.append(line).append("\n");
	    }
	    bre.close();
	    p.waitFor();
	    return sb.toString();
	}
	catch(Exception e){
	    return e.toString();
	}
    }
    
    public static String getPostData(HttpServletRequest req) {
	StringBuilder sb = new StringBuilder();
	try {
	    BufferedReader reader = req.getReader();
	    reader.mark(100000);
	    String line=reader.readLine();
	    while(line != null) {
		sb.append(line).append("\n");
		line = reader.readLine();
	    } 
	    reader.reset();
	} catch(IOException e) {
	    sb.append("Error...");
	}
	return sb.toString();
    }
 
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(9000);
        server.setHandler(new KServlet());
 
        server.start();
        server.join();
    }
}
