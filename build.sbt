name := "box-java-sdk"
organization := "com.box"
version := "2.3.2"
scalaVersion := "2.11.8"

resolvers in ThisBuild ++= Seq("BoxJavaSdk" at "s3://docurated-build/boxjavasdk")

publishTo := Some("BoxJavaSdk" at "s3://docurated-build/boxjavasdk")

libraryDependencies += "com.eclipsesource.minimal-json" % "minimal-json" % "0.9.1"
libraryDependencies += "org.bitbucket.b_c" % "jose4j" % "0.4.4"
libraryDependencies += "org.bouncycastle" % "bcprov-jdk15on" % "1.52"
libraryDependencies += "org.bouncycastle" % "bcpkix-jdk15on" % "1.52"
libraryDependencies += "junit" % "junit" % "4.11" % "test"
libraryDependencies += "org.hamcrest" % "hamcrest-library" % "1.3" % "test"
libraryDependencies += "com.github.tomakehurst" % "wiremock" % "1.52" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.7" % "test"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.7" % "test"
