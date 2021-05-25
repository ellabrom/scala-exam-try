package com.epam.scala_exam.services.validators

import com.epam.scala_exam.model._
import org.springframework.stereotype.Component

@Component
class AgeValidator extends Validator {
  override def validate(user:User): Boolean = user.age>=0
}
