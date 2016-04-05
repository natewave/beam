package beam.core.models

case class Node(ip: Node.IP, port: Node.Port) {

  // RFI: Room For Improvement
  val id = ip.value + port.value
}

object Node {
  case class Id(value: Long) extends AnyVal
  case class Term(value: Long) extends AnyVal
  case class IP(value: String) extends AnyVal
  case class Port(value: Int) extends AnyVal
}

case class Log(
  index: Log.Index,
  term: Node.Term,
  command: Log.Command
)

object Log {
  case class Index(value: Long) extends AnyVal
  case class Command(value: String) extends AnyVal
}
