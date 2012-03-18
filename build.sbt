// give the user a nice default project!
name := "SimpleTikaExtractor"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.6.1",
  "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test",
  "org.apache.tika" % "tika-parsers" % "1.0"
)



