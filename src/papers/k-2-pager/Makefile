LATEX	= pdflatex
BIBTEX	= bibtex
MAKEINDEX = makeindex
DVIPS	= dvips
DVIPDF  = dvipdft

RERUN = "(There were undefined references|Rerun to get (cross-references|the bars) right)"
RERUNBIB = "No file.*\.bbl|Citation.*undefined"
MAKEIDX = "^[^%]*\\makeindex"
MPRINT = "^[^%]*print"
USETHUMBS = "^[^%]*thumbpdf"

COPY = if test -r $(<:%.tex=%.toc); then cp $(<:%.tex=%.toc) $(<:%.tex=%.toc.bak); fi 
RM = rm -f

# These are OK

SRC	:= main.tex
TRG	= $(SRC:%.tex=%.dvi)
PSF	= $(SRC:%.tex=%.ps)
PDF	= $(SRC:%.tex=%.pdf)

define run-latex
	$(COPY);$(LATEX) $<
	egrep $(MAKEIDX) $< && ($(MAKEINDEX) $(<:%.tex=%);$(COPY);$(LATEX) $<) >/dev/null; true
	egrep -c $(RERUNBIB) $(<:%.tex=%.log) && ($(BIBTEX) $(<:%.tex=%);$(COPY);$(LATEX) $<) ; true
	egrep $(RERUN) $(<:%.tex=%.log) && ($(COPY);$(LATEX) $<) >/dev/null; true
	egrep $(RERUN) $(<:%.tex=%.log) && ($(COPY);$(LATEX) $<) >/dev/null; true
	if cmp -s $(<:%.tex=%.toc) $(<:%.tex=%.toc.bak); then true ;else $(LATEX) $< ; fi
	$(RM) $(<:%.tex=%.toc.bak)
	# Display relevant warnings
	egrep -i "(Reference|Citation).*undefined" $(<:%.tex=%.log) ; true
endef

define run-pdflatex
	LATEX=pdflatex
	@$(run-latex)
endef

define get_dependencies
	deps=`perl -ne '($$_)=/^[^%]*\\\(?:include|input)\{(.*?)\}/;@_=split /,/;foreach $$t (@_) {print "$$t.tex "}' $<`
endef

define getbibs
	bibs=`perl -ne '($$_)=/^[^%]*\\\bibliography\{(.*?)\}/;@_=split /,/;foreach $$b (@_) {print "$$b.bib "}' $< $$deps`
endef

define geteps
	epses=`perl -ne '@foo=/^[^%]*\\\(includegraphics|psfig)(\[.*?\])?\{(.*?)\}/g;if (defined($$foo[2])) { if ($$foo[2] =~ /.eps$$/) { print "$$foo[2] "; } else { print "$$foo[2].eps "; }}' $< $$deps`
endef

define manconf
	mandeps=`if test -r $(basename $@).cnf ; then cat $(basename $@).cnf |tr -d '\n\r' ; fi`
endef

all 	: $(TRG)

.PHONY	: all show clean ps pdf showps veryclean

clean	:
	  -rm -f $(TRG) $(PSF) $(PDF) $(TRG:%.dvi=%.aux) $(TRG:%.dvi=%.bbl) $(TRG:%.dvi=%.blg) $(TRG:%.dvi=%.log) $(TRG:%.dvi=%.out) $(TRG:%.dvi=%.idx) $(TRG:%.dvi=%.ilg) $(TRG:%.dvi=%.ind) $(TRG:%.dvi=%.toc) $(TRG:%.dvi=%.d)

veryclean	: clean
	  -rm -f *.log *.aux *.dvi *.bbl *.blg *.ilg *.toc *.lof *.lot *.idx *.ind *.ps  *~

# This is a rule to generate a file of prerequisites for a given .tex file
%.d	: %.tex
	$(get_dependencies) ; echo $$deps ; \
	$(getbibs) ; echo $$bibs ; \
	$(geteps) ; echo $$epses ; \
	$(manconf) ; echo  $$mandeps  ;\
	echo "$*.dvi $@ : $< $$deps $$bibs $$epses $$mandeps" > $@ 

include $(SRC:.tex=.d)

# $(DEP) $(EPSPICS) $(BIBFILE)
$(TRG)	: %.dvi : %.tex
	  @$(run-latex)

$(PSF)	: %.ps : %.dvi
	  @$(DVIPS) $< -o $@

#$(PDF)  : %.pdf : %.dvi
#	  @$(DVIPDF) -o $@ $<
# To use pdflatex, comment the two lines above and uncomment the lines below
$(PDF) : %.pdf : %.tex
	@$(run-pdflatex)


show	: $(TRG)
	  @for i in $(TRG) ; do $(XDVI) $$i & done

showps	: $(PSF)
	  @for i in $(PSF) ; do $(GH) $$i & done

ps	: $(PSF) 

pdf	: $(PDF) 

# TODO: This probably needs fixing
#html	: @$(DEP) $(EPSPICS)
#	  @$(L2H) $(SRC)



