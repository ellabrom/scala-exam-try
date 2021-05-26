package com.epam.scala_exam.services.files_format_converters

import com.epam.scala_exam.model.Test
import com.epam.scala_exam.services.converters.ExcelRowToObjectDataConverterImpl
import org.apache.poi.ss.usermodel.Sheet




object FilesConverterAdapter {
  implicit def convertExcelToConverter(excelSheet: Sheet): ExcelRowToObjectFilesFormatConverterImpl = {
    new ExcelRowToObjectFilesFormatConverterImpl(excelSheet)
  }
  implicit def stringToConverter(string:String): Test = {
     Test(string)
  }

//  implicit def convertStringToConverter(int: Int): Dog = {
//    Dog(int)
//  }

//  implicit class FileExt(file: File) {
//
//    def readFileToMemory(): Unit = {
//
//      val avroFileType: Boolean = file.getName.endsWith(FilesExtentionsGetter.avroFileExtention)
//      val parquetFileType: Boolean = file.getName.endsWith(FilesExtentionsGetter.parquetFileExtention)
//
//      if (avroFileType) {
//        val testTxtSource = Source.fromFile(file)
//        ReadedFiles.addReadedFiles(testTxtSource.getLines.mkString)
//        testTxtSource.close()
//      }
//      if (parquetFileType) {
//        ReadedFiles.addReadedFiles(WorkbookFactory.create(file).getSheetAt(0))
//      }
//
//    }
//
//  }


}
