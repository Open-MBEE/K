# Klang
K is a textual language intended to be used by modelers, programmers, system designers, and specification writers. The motivation for K is based on the need for a language that provides the right set of constructs and tools to model, verify, and implement. It draws its inspiration from a variety of sources:
  - Graphical languages such as UML, SysML
  - Formal specification languages such as Z, Alloy
  - Programming languages such as Java, Scala, C#, C
  - Dynamic modeling languages such as Mathematica

Our goal is to be able to allow individuals at NASA to easily model as well as program and analyze/verify. We believe that the paradigms of programming and modeling have exactly the same goals and are working on the same basic principles. K is intended to facilitate the merger of the two paradigms.  

Along with the formal textual language, we have created a suite of tools and capabilities that allow K to be used in a setting such as one experiences at NASA. Some of these include:
  - Formal analysis such as type checking
  - Class consistency checking
  - Satisfiability checking and correctness checking using SMT
  - Translation to Latex for purposes of documentation and readability

In the future we plan on creating integration with other tools and solvers such as Mathematica, MiniZinc etc., and furthering our existing analyses and infrastructure. 

K is implemented using open source tools such as ANTLR, Java, Scala, and Z3. 
