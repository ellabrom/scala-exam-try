package com.epam.scala_exam.services

import com.epam.scala_exam.model.User

trait ReportService {
  def validateDataInFiles(listBaseInfo:List[User]): Unit
}
