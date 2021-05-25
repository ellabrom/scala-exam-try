package com.epam.scala_exam.services.converters

import com.epam.scala_exam.model.{Client, GenderEnum, MaritalStatusEnum, User}
import org.apache.poi.ss.usermodel.Row

trait DataConverter {
  def convert(row: Row, titleRow: Row): User


}
