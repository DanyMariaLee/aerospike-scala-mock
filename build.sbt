import sbt.Keys._
import sbt._
import de.heikoseeberger.sbtheader.HeaderPattern


name := "aerospike-mock"
version := "1.0.2"
organization := "com.github.danymarialee"
scalaVersion := "2.11.8"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
crossScalaVersions := Seq("2.10.6", "2.11.8")
sonatypeProfileName := "com.github.danymarialee"

useGpg := true
pgpReadOnly := false

//enablePlugins(AutomateHeaderPlugin)

libraryDependencies ++= Seq("com.aerospike" % "aerospike-client" % "3.3.0",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test")

headers := Map(
  "scala" -> (
    HeaderPattern.cStyleBlockComment,
    """|/*
      | * Copyright (c) 2016 Dany Lee
      | *
      | * Licensed under the Apache License, Version 2.0 (the "License");
      | * you may not use this file except in compliance with the License.
      | * You may obtain a copy of the License at
      | *
      | *    http://www.apache.org/licenses/LICENSE-2.0
      | *
      | * Unless required by applicable law or agreed to in writing, software
      | * distributed under the License is distributed on an "AS IS" BASIS,
      | * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      | * See the License for the specific language governing permissions and
      | * limitations under the License.
      | */
      |
      | """.stripMargin
    )
)


licenses := Seq(("Apache License, Version 2.0", url("https://www.apache.org/licenses/LICENSE-2.0")))
homepage := Some(url("https://github.com/DanyMariaLee/AeroSpikeClientMock"))
publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
pomExtra in Global := {
  <developers>
    <developer>
      <id>DanyMariaLee</id>
      <name>Marina Sigaeva</name>
      <url>http://twitter.com/besseifunction</url>
    </developer>
  </developers>
}

scmInfo := Some(ScmInfo(
  url("http://github.com/DanyMariaLee"),
  "scm:git:github.com/DanyMariaLee/AeroSpikeClientMock",
  Some("scm:git:git@github.com:DanyMariaLee/AeroSpikeClientMock.git")
))

credentials += Credentials("Sonatype Nexus Repository Manager",
  "oss.sonatype.org",
  "",
  "")