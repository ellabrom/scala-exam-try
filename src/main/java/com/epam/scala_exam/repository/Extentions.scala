package com.epam.scala_exam.repository

import com.epam.scala_exam.utils.FilesExtentionsGetter
import org.apache.poi.ss.usermodel.WorkbookFactory

import java.io.File
import scala.io.Source

object Extentions {

  implicit class FileExt(file: File) {

    def readFileToMemory(): Unit = {

      val avroFileType: Boolean = file.getName.endsWith(FilesExtentionsGetter.avroFileExtention)
      val parquetFileType: Boolean = file.getName.endsWith(FilesExtentionsGetter.parquetFileExtention)
      if (avroFileType) {
        val testTxtSource = Source.fromFile(file)
        ReadedFiles.addReadedFiles(testTxtSource.getLines.mkString)
        testTxtSource.close()
      }
      if (parquetFileType) {
        ReadedFiles.addReadedFiles(WorkbookFactory.create(file).getSheetAt(0))
      }

    }

  }

}
