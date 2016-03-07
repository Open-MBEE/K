# Klang 3/7/2016

K is a textual language intended to be used by modelers, programmers,
system designers, and specification writers. The motivation for K is
based on the need for a language that provides the right set of
constructs and tools to model, verify, and implement. It draws its
inspiration from a variety of sources:

  - Graphical languages such as UML, SysML
  - Formal specification languages such as Z, Alloy
  - Programming languages such as Java, Scala, C#, C
  - Dynamic modeling languages such as Mathematica

Our goal is to be able to allow individuals at NASA to easily model as
well as program and analyze/verify. We believe that the paradigms of
programming and modeling have exactly the same goals and are working
on the same basic principles. K is intended to facilitate the merger
of the two paradigms.

Along with the formal textual language, we have created a suite of
tools and capabilities that allow K to be used in a setting such as
one experiences at NASA. Some of these include:

  - Formal analysis such as type checking
  - Class consistency checking
  - Satisfiability checking and correctness checking using SMT
  - Translation to Latex for purposes of documentation and readability

In the future we plan on creating integration with other tools and
solvers such as Mathematica, MiniZinc etc., and furthering our
existing analyses and infrastructure.

K is implemented using open source tools such as ANTLR, Java, Scala,
and Z3.

# Build Instructions

You will need to have access to JDK 1.8+, Scala 2.11+, and any editor of your choice. 

1. After loading the project in your IDE, you will need to ensure that you have the correct Z3 jar file to build the project. Based on your operating system (win32 or osx or linux), ensure that the classpath and build uses the corresponding com.microsoft.z3.<YOUR_OS>.jar file. For example, on Windows, use com.microsoft.z3.win32.jar and on linux use com.microsoft.z3.osx.jar.
2. You should now be able to build the project without any errors. 
3. To execute within your IDE, make sure that the lib folder is in the PATH of your execution environment. Additionally, on OSX you have to set DYLD_LIBRARY_PATH to include the lib folder, and on Windows, the java.library.path has to include the lib folder. In Eclipse, you can set the DYLD_LIBRARY_PATH in the run configuration environment tab (and same for path). 
4. Once the paths are set, you can use the following arguments
    -f <path to file> to execute toolchain on a specific file
    -test to bring up the test prompt, which will automatically look for the provided file name in the tests folder
    -tests to execute all tests in test folder
    -tests -save to exeucte on all tests and update the stored baseline
5. The k.jar file needed for exporting can be done by exporting a runnable jar on the k.frontend package.
