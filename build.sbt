import sbt._

organization := "io.otrl.library"

name := "otrl-lib-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val otrlLibUtils = project.in(file("."))

libraryDependencies ++= Seq(
  // scala
  "org.scala-lang" % "scala-library" % "2.11.7",
  // test
  "org.specs2" % "specs2-core_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-junit_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-mock_2.11" % "3.6.6" % "test"
)

publishTo := Some("OTRL" at "https://mvn.otrl.io")

ivyScala := ivyScala.value map {
  _.copy(overrideScalaVersion = true)
}

publishTo := Some("OTRL" at "https://mvn.otrl.io")

scalacOptions ++= Seq("-deprecation", "-feature")
