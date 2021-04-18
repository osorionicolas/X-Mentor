package repositories.graph

sealed trait GraphEntityTag {
  def tag: String
}

case object TopicTag extends GraphEntityTag {
  override def tag: String = "topic"
}

case object CourseTag extends GraphEntityTag {
  override def tag: String = "course"
}
