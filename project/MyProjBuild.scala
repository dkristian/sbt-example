import sbt._
import Keys._
import java.util.TimeZone

object MyProjBuild extends Build {
  lazy val root =
    Project("root", file("."))
      .configs( IntegrationTest )
      .settings( Defaults.itSettings : _*)
      .settings( watchSources <++= (unmanagedSources in IntegrationTest).identity )
}
