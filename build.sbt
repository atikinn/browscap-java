scalaVersion := "2.12.3"

projectDependencies += "junit" % "junit" % "4.12" % "test"
projectDependencies += "com.opencsv" % "opencsv" % "3.10"

/*
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
*/
