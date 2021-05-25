package com.epam.scala_exam.services.validators

import com.epam.scala_exam.model._
import org.springframework.stereotype.Component

@Component
class PhoneNumberValidator extends Validator{
  override def validate(baseInfo: User): Boolean = baseInfo.phoneNumber.matches(".*\\d+.*")
}
