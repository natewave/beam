package beam.core.utils

import beam.core.models.Node

object Parsing {
  def parseNodes(nodesString: String): Seq[Node] = {
    val splitted = nodesString
      .split(",")
      .map(_.split(":"))

    val nodes = splitted.map { node =>
      val ip = Node.IP(node(0))
      val port = Node.Port(node(1).toInt)

      Node(ip, port)
    }

    nodes
  }
}
