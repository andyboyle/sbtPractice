name := "hello"

version := "1.0"

scalaVersion := "2.10.3"

lazy val allo = taskKey[Unit]("The 'Allo' task!")

allo := { println("Aye Ayw!")}
