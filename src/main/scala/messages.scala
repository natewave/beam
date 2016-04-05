package beam.core.message

import beam.core.models.{ Node, Log }

// trait AppendEntries

// case class HeartBeat(nodeId: Node.Id) extends AppendEntries

sealed trait Message

case class AppendEntries(
  term: Node.Term,
  leaderId: Node.Id,
  prevLogIndex: Log.Index,
  prevLogTerm: Node.Term,
  entries: Seq[Entry]
) extends Message

case class RequestVote(
  candidateId: Node.Id,
  term: Node.Term,
  lastLogIndex: Log.Index,
  lastLogTerm: Node.Term
) extends Message

case class AppendEntriesResut(
  term: Node.Term,
  success: Boolean
) extends Message

case class RequestVoteResult(
  term: Node.Term,
  voteGranted: Boolean
) extends Message

class Entry(value: String)
