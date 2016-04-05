name := """beam"""

version := "0.0.1"

scalaVersion := "2.11.7"

lazy val akka           = "com.typesafe.akka" %% "akka-actor" % "2.4.2"

lazy val akkaRemoting   = "com.typesafe.akka" %% "akka-remote" % "2.4.2"

libraryDependencies ++= Seq(
  akka,
  akkaRemoting
)
