name := baseDirectory.value.getName + "andy"

version := "1.0"

scalaVersion := "2.10.3"

lazy val allo = taskKey[Unit]("The 'Allo' task!")

allo := { println("Aye Ayw!")}

libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
