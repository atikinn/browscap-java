scalaVersion := "2.10.5"

libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies += "com.opencsv" % "opencsv" % "3.10"

/* TODO
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
*/
