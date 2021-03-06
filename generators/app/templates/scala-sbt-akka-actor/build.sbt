name := "<%= projectDirectory %>"

lazy val akkaVersion = "2.5.14"
lazy val scalacticVersion = "3.0.5"
lazy val scalatestVersion = "3.0.5"

lazy val commonSettings = Seq(
  version := "0.0.1",
  organization := "com.github.daggerok",
  scalaVersion := "2.12.6",
  test in assembly := {}
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    mainClass in assembly := Some("daggerok.Application"),
    // more settings here ...
  )

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "org.scalactic" %% "scalactic" % scalacticVersion % "test",
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",
)
