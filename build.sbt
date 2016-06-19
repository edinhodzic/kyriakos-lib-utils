import bintray.Keys._
import sbt._

organization := "io.kyriakos.library"

name := "kyriakos-lib-utils"

version := "1.0.0"

scalaVersion := "2.11.7"

lazy val kyriakosLibUtils = project.in(file(".")).
  settings(bintrayPublishSettings: _*).
    settings(
      sbtPlugin := false,
      name := "kyriakos-lib-utils",
      licenses += ("MIT", url("https://opensource.org/licenses/MIT")),
      publishMavenStyle := false,
      repository in bintray := "kyriakos",
      bintrayOrganization in bintray := None
    )

libraryDependencies ++= Seq(
  // scala
  "org.scala-lang" % "scala-library" % "2.11.7",
  // test
  "org.specs2" % "specs2-core_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-junit_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-mock_2.11" % "3.6.6" % "test"
)

ivyScala := ivyScala.value map {
  _.copy(overrideScalaVersion = true)
}

scalacOptions ++= Seq("-deprecation", "-feature")
