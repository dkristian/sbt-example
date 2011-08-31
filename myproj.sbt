version := "1.0.0-SNAPSHOT"

organization := "com.example"

scalaVersion := "2.9.0-1"

scalacOptions ++= Seq("-unchecked", "-Ywarn-dead-code", "-deprecation")

javacOptions ++= Seq("-Xlint:unchecked")

scalaSource in IntegrationTest <<= baseDirectory(_ / "src" / "itest")

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.9.0" % "1.4.1" % "test;it"
)

publishArtifact in (Compile, packageDoc) := false

publishArtifact in (Compile, packageSrc) := false
