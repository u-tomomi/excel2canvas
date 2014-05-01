name := "excel2canvas"

version := "1.0-SNAPSHOT"

resolvers += "FLECT" at "http://flect.github.io/maven-repo/"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "jp.co.flect" % "excel2canvas" % "1.0.1"
)     

play.Project.playScalaSettings
