package com.epam.scala_exam.controllers

import com.epam.scala_exam.model._
import com.epam.scala_exam.repo.FileReaderRepo
import com.epam.scala_exam.services.ReportService
import org.springframework.stereotype.Component

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters._

@Component
class ReportFlowControllerImpl(reportService: ReportService, fileReaderRepos: java.util.List[FileReaderRepo]) extends ReportFlowController {



  override def controlFlow(): Unit = {
    val listToReturn = new ListBuffer[List[User]]()
     fileReaderRepos.asScala.toList.foreach(listToReturn+=_.readFilesToMemory())
    val list = listToReturn.toList.flatten


    reportService.validateDataInFiles(list)


    //    readFiles()
    //    convertFilesToObjects()
    //    validateDataInFiles()
    //    findRelevantDataAccordingToRequest()
    //    writeRelevantDataToFile()
  }

}
