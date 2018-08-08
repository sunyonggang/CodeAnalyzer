name := "mydemo"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
    "org.pegdown" % "pegdown" % "1.6.0" % "test", //used in html report
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)