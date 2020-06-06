package com.rallyhealth.weepickle.v1.core

object StringVisitor extends SimpleVisitor[Nothing, Any] {
  def expectedMsg = "expected string"
  override def visitString(cs: CharSequence): CharSequence = cs.toString
}

object BooleanStringVisitor extends SimpleVisitor[Nothing, Any] {
  def expectedMsg = "expected string"
  override def visitString(cs: CharSequence): Boolean = cs.toString.toBoolean
}
