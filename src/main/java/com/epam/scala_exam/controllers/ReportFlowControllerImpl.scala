package com.epam.scala_exam.controllers

import com.epam.scala_exam.model._
import com.epam.scala_exam.repo.FileReaderRepo
import com.epam.scala_exam.repository.{FilesReaderRepository, ReadedFiles}
import com.epam.scala_exam.services.ReportService
import com.epam.scala_exam.utils.FilesExtentionsGetter
import org.springframework.stereotype.Component

import scala.jdk.CollectionConverters._
import com.epam.scala_exam.services.files_format_converters.FilesConverterAdapter.{convertExcelToConverter, stringToConverter}
import org.apache.poi.ss.usermodel.Sheet

@Component
class ReportFlowControllerImpl(reportService: ReportService, filesReaderRepository:FilesReaderRepository) extends ReportFlowController {



  override def controlFlow(): Unit = {

     //fileReaderRepos.asScala.toList.foreach(_.readFilesToMemory())
    filesReaderRepository.readFiles()
    println(ReadedFiles.getReadedFilesList.length)
    //ReadedFiles.getReadedFilesList.foreach(_.convert)
    import com.epam.scala_exam.services.files_format_converters.FilesConverterAdapter.convertExcelToConverter
  //  "fff".ppp
//    val sheet:Sheet = new Sheet
//    org.apache.poi.ss.usermodel.Sheet.convert()
//    val list = AggregatedUsers.getUsersList
//    reportService.validateDataInFiles(list)


    //    readFiles()
    //    convertFilesToObjects()
    //    validateDataInFiles()
    //    findRelevantDataAccordingToRequest()
    //    writeRelevantDataToFile()
  }

}
