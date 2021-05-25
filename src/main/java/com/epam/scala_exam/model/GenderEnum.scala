package com.epam.scala_exam.model

import com.fasterxml.jackson.core.`type`.TypeReference

class GenderEnumType extends TypeReference[GenderEnum.type]
object GenderEnum extends Enumeration {
  type GenderEnum = Value
  val male: Value = Value("male")
  val female: Value = Value("female")
}
