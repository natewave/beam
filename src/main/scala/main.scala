package beam.core.launcher

import akka.actor.{ ActorSystem, Props }

import beam.core.node.Node

object Main {
  def main(args: Array[String]): Unit = {
    println("[+] Starting beam node...")

    // create actor system
    val system = ActorSystem("BeamSystem")

    // become available remotely
    val remote = system.actorOf(Props[Node], name="beam-node")

    // send message to a remote actor
    
  }
}
