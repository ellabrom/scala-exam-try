package com.epam.scala_exam.model

import com.fasterxml.jackson.annotation.{JsonCreator, JsonProperty}
import com.fasterxml.jackson.module.scala.JsonScalaEnumeration


@JsonCreator
case class ReportRequest (@JsonProperty("min_age")minAge:Int,@JsonProperty("max_age")maxAge:Int,
                          @JsonScalaEnumeration(classOf[GenderEnumType]) gender: GenderEnum.GenderEnum,
                          @JsonProperty("prefix_name")prefixName: String,
                          @JsonScalaEnumeration(classOf[MaritalStatusEnumType]) maritalStatus: MaritalStatusEnum.MaritalStatusEnum,
                          @JsonProperty("Number of Children")numOfChildren:Int) extends Serializable

