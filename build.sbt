lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.praise",
      scalaVersion := "3.3.1"
    )
  ),
  name := "scala"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
