import sbt._

class MeetupApp(info: ProjectInfo) extends DefaultProject(info) {
  val dispatch_version = "$dispatch_version$"
  val dnio = "net.databinder" %% "dispatch-nio" % dispatch_version
  val dmeetup = "net.databinder" %% "dispatch-meetup" % dispatch_version
}
