package com.epam.scala_exam.services.validators

import com.epam.scala_exam.model.User
import org.springframework.stereotype.Component

@Component
class EmailValidator extends Validator {
  override def validate(baseInfo: User): Boolean = baseInfo.email.contains("@")&& baseInfo.email.endsWith(".com")
}
