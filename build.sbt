name := "box-java-sdk"
organization := "com.box"
version := "3.4.0"
scalaVersion := "2.11.8"

resolvers in ThisBuild ++= Seq("BoxJavaSdk" at "s3://docurated-build/boxjavasdk")

publishTo := Some("BoxJavaSdk" at "s3://docurated-build/boxjavasdk")

libraryDependencies += "com.eclipsesource.minimal-json" % "minimal-json" % "0.9.5"
libraryDependencies += "org.bitbucket.b_c" % "jose4j" % "0.7.9"
libraryDependencies += "org.bouncycastle" % "bcprov-jdk15on" % "1.57"
libraryDependencies += "org.bouncycastle" % "bcpkix-jdk15on" % "1.57"
