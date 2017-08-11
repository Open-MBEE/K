#!/usr/bin/env bash

# Call Java
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/bin/java

# Set Java Agent
"-javaagent:/Users/dank/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/172.3317.76/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=51598:/Users/dank/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/172.3317.76/IntelliJ IDEA.app/Contents/bin"

# Set Encoding
-Dfile.encoding=UTF-8

# Set Classpath
-classpath
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/charsets.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/deploy.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/cldrdata.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/dnsns.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/jaccess.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/jfxrt.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/localedata.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/nashorn.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/sunec.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/ext/zipfs.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/javaws.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/jce.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/jfr.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/jfxswt.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/jsse.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/management-agent.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/plugin.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/resources.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/jre/lib/rt.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/ant-javafx.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/dt.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/javafx-mx.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/jconsole.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/packager.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/sa-jdi.jar
/Library/Java/JavaVirtualMachines/jdk1.8.0_101.jdk/Contents/Home/lib/tools.jar
/Users/dank/git/KLang/target/classes
/Users/dank/.m2/repository/org/scala-lang/scala-actors/2.11.8/scala-actors-2.11.8.jar
/Users/dank/.m2/repository/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8.jar
/Users/dank/.m2/repository/org/scala-lang/scala-reflect/2.11.8/scala-reflect-2.11.8.jar
/Users/dank/.m2/repository/org/scala-lang/scala-actors/2.11.8/scala-actors-2.11.8-sources.jar
/Users/dank/.m2/repository/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8-sources.jar
/Users/dank/git/util/target/classes
/Users/dank/.m2/repository/junit/junit/4.8.1/junit-4.8.1.jar
/Users/dank/.m2/repository/org/json/json/20140107/json-20140107.jar
/Users/dank/.m2/repository/org/apache/commons/commons-lang3/3.0/commons-lang3-3.0.jar
/Users/dank/.m2/repository/org/apache/commons/commons-math3/3.6.1/commons-math3-3.6.1.jar
/Users/dank/.m2/repository/org/reflections/reflections/0.9.11/reflections-0.9.11.jar
/Users/dank/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar
/Users/dank/.m2/repository/com/google/guava/guava/23.0/guava-23.0.jar
/Users/dank/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar
/Users/dank/.m2/repository/com/google/errorprone/error_prone_annotations/2.0.18/error_prone_annotations-2.0.18.jar
/Users/dank/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar
/Users/dank/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar
/Users/dank/.m2/repository/org/antlr/antlr4/4.5/antlr4-4.5.jar
/Users/dank/.m2/repository/org/antlr/antlr4-runtime/4.5/antlr4-runtime-4.5.jar
/Users/dank/.m2/repository/org/abego/treelayout/org.abego.treelayout.core/1.0.1/org.abego.treelayout.core-1.0.1.jar
/Users/dank/.m2/repository/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar
/Users/dank/.m2/repository/org/antlr/ST4/4.0.8/ST4-4.0.8.jar
/Users/dank/.m2/repository/log4j/log4j/1.2.16/log4j-1.2.16.jar
/Users/dank/git/KLang/lib/com.microsoft.z3.jar
/Users/dank/.m2/repository/org/scala-lang/modules/scala-xml_2.11/1.0.3/scala-xml_2.11-1.0.3.jar
/Users/dank/.m2/repository/org/scala-lang/modules/scala-parser-combinators_2.11/1.0.3/scala-parser-combinators_2.11-1.0.3.jar
/Users/dank/.m2/repository/org/scala-lang/modules/scala-swing_2.11/1.0.1/scala-swing_2.11-1.0.1.jar


# Call Main
k.frontend.Main -f /Users/dank/git/KLang/src/tests/global1.k
