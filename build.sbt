name := """forward-me-this"""
organization := "com.forwardmethis"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.2"

libraryDependencies += guice

//Validate emails
libraryDependencies += "commons-validator" %  "commons-validator" % "1.9.0"

//Database Support
libraryDependencies ++= Seq(
  javaJdbc,
  evolutions,
  "mysql" % "mysql-connector-java" % "8.0.33",
  "org.avaje.ebean" % "ebean" % "14.6.1"
)

// Force scala-xml version to 2.3.0
dependencyOverrides += "org.scala-lang.modules" %% "scala-xml" % "2.3.0"

libraryDependencies += "com.typesafe.play" %% "play-mailer" % "8.0.0"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "8.0.0"

evictionWarningOptions in update := EvictionWarningOptions.empty