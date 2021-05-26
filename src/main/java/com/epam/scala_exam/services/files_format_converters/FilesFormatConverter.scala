package com.epam.scala_exam.services.files_format_converters

import com.epam.scala_exam.model.User
import org.apache.poi.ss.usermodel.Row

trait FilesFormatConverter {
  def convert(): Unit


}
