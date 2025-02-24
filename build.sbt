name := """forward-me-this"""
organization := "com.forwardmethis"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.16"

libraryDependencies += guice

//Validate emails
libraryDependencies += "commons-validator" %  "commons-validator" % "1.9.0"

//Database Support
libraryDependencies ++= Seq(
  javaJdbc,
  "mysql" % "mysql-connector-java" % "8.0.14"
)