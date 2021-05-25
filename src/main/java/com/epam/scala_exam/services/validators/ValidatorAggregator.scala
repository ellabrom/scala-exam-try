package com.epam.scala_exam.services.validators

import com.epam.scala_exam.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import java.util
import scala.jdk.CollectionConverters._
import scala.language.implicitConversions
@Component
class ValidatorAggregator {

  @Autowired
  var validators: util.List[Validator] = null

  def validateAllData(baseInfo: User): Boolean = {
    val scalaValidators = validators.asScala.toList
    scalaValidators.count(_.validate(baseInfo))==scalaValidators.length
  }
}



