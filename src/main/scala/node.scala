package beam.core.node

import akka.actor.Actor
import akka.actor.Props
import akka.event.Logging

import scala.concurrent.duration._

import com.typesafe.config._

 
class Node extends Actor {
  var electionTimeout = 0 seconds
  var clusterNodes: Seq[Node] = Seq()

  val log = Logging(context.system, this)

  override def preStart() {
    val conf = ConfigFactory.load()
    val node = conf.getString("nodes.list").split(",").head

    val nodeAddress = s"akka.tcp://BeamSystem@$node/user/remote"

    val remoteActor = context.actorSelection(nodeAddress)
    println("That 's remote:" + remoteActor)
    remoteActor ! "hi"
  }

  def follower = {}

  def candidate = {}

  def leader = {}

  def receive = {
    case "Hi" => log.info(s"received string")
    case _      => log.info("received unknown message")
  }

}

