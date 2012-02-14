organization := "com.example"

name := "nettify"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq("org.jboss.netty" % "netty" % "3.2.7.Final")

resolvers ++= Seq("jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/")

