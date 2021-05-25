package com.epam.scala_exam.model

object Adapters {
  implicit def convert(firsName:String, lastName:String):String = firsName+lastName
}
