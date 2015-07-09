package k.frontend

import java.nio._
import java.io._

object K2Latex {

  def convert(name: String, model: Model) {
    val file = new FileWriter(name + ".tex", false)
    file.append("\\documentclass[12pt]{article}\\usepackage{amsmath}\\begin{document}\n")
    //file.append("")
    file.append(s"\\title{$name} \\maketitle\n")

    file.append(s"\\section{Introduction}This document is automatically generated from $name.")

    // Imports
    if (model.imports.length > 0) {
      file.append("\\section{Imports}\n")
      file.append("\\begin{enumerate}\n")
      model.imports.foreach { i => file.append(s"\\item ${i.name}${if (i.star) "*" else ""}\n") }
      file.append("\\end{enumerate}\n")
    }

    // Annotations
    file.append("\\section{Defined Annotations}\n")
    file.append("\\begin{enumerate}\n")
    model.annotations.foreach { a => file.append(s"\\item \\underline{${a.name}} of type \\textbf{${a.ty}}\n") }
    file.append("\\end{enumerate}\n")

    // Decls
    file.append("\\section{Entities}\n")

    for (d @ EntityDecl(_, _, _, _, _, _, _) <- model.decls) {
      file.append(s"\\subsection{${d.entityToken} ${d.ident}}\n")
      d.annotations.foreach { a =>
        if (a.name.equals("doc")) {
          file.append(s"\\begin{paragraph} ${a.exp} \\end{paragraph}\n")
        }
      }
      file.append(s"\\subsubsection{Properties}\n")

      // properties
      if (d.members.filter(_.isInstanceOf[PropertyDecl]).length > 0) {
        file.append("\\begin{itemize}\n")
        for (p @ PropertyDecl(_, _, _, _, _, _) <- d.members) {
          file.append(s"\\item ${p.name.replace("_", "\\_")} of type ${p.ty}\n")
        }
        file.append("\\end{itemize}\n")
      }

      file.append(s"\\subsubsection{Functions}\n")
      if (d.members.filter(_.isInstanceOf[FunDecl]).length > 0) {
        file.append("\\begin{itemize}\n")
        for (f @ FunDecl(_, _, _, _, _, _) <- d.members) {
          f.ty match {
            case Some(t) => file.append(s"\\item ${f.ident} returning a ${t}\n")
            case _       => file.append(s"\\item ${f.ident}\n")
          }

          if (f.params.length > 0) {
            file.append("\\begin{itemize}\n")
            for (p <- f.params) {
              file.append(s"\\item Argument ${p.name.replace("_", "\\_")} of type ${p.ty.toString.replace("[", "[[").replace("]", "]]")}\n")
            }
            file.append("\\end{itemize}\n")
          }
        }
        file.append("\\end{itemize}\n")
      }

      // constraints
      if (d.members.filter(_.isInstanceOf[ConstraintDecl]).length > 0) {
        for (c @ ConstraintDecl(_, _) <- d.members) {
          file.append(s"\\subsubsection{Constraint: ${c.name.getOrElse("Unnamed").replace("_", "\\_")}}\n")
          if (c.annotations.length > 0) file.append("\\begin{description}\n")
          for (a <- c.annotations)
            if (a.name == "units") file.append(s"\\item [${a.name.toUpperCase}:] $$ ${a.exp.toString.replace("\"", "").replace("_", "\\_")}$$\n")
            else file.append(s"\\item [${a.name.toUpperCase}:] ${a.exp.toString.replace("\"", "").replace("_", "\\_")}\n")
          if (c.annotations.length > 0) file.append("\\end{description}\n")

          file.append("\\begin{equation}\n")
          file.append(s"\\boxed{\\begin{gathered} ${
            c.exp.toString.replace("&&", " \\\\ \\wedge \\\\")
              .replace("_", "\\_")
              .replace("<=", "\\le")
              .replace(">=", "\\ge")
              .replace("*", "\\times")
          }\\end{gathered}}\n")
          file.append("\\end{equation}\n")
        }
      }

      // expressions
      file.append(s"\\subsubsection{Expressions}\n")
      if (d.members.filter(_.isInstanceOf[ExpressionDecl]).length > 0) {
        file.append("\\begin{itemize}\n")
        for (e @ ExpressionDecl(exp) <- d.members) {
          file.append(s"\\item $exp\n")
        }
        file.append("\\end{itemize}\n")
      }
    }
    file.append("\\end{document}\n")

    file.close()
    println(s"Latex file written to $name.tex.")

  }

}