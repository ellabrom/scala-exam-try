package com.epam.scala_exam.repo

import com.epam.scala_exam.services.converters.DataConverter
import org.apache.poi.ss.usermodel.{Row, WorkbookFactory}
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.stereotype.Component

import java.io.File


@Component
class ParquetFileReaderRepoImpl(@Value("${input_files_path}") val input_files_path: String,
                                @Value("${parquet_file_ext}") implicit val fileExt: String,
                                @Autowired val converter: DataConverter) extends FileReaderRepo {
  override def readFilesToMemory(): Unit = {

    val parquetFiles: List[File] = findFilesInInputPath

    val itr = parquetFiles.iterator
    while (itr.hasNext) {
      readExcelFileToMemory(itr.next())
    }


  }

  private def readExcelFileToMemory(file: File): Unit = {


    val itr = WorkbookFactory.create(file).getSheetAt(0).iterator()
    var titleRow:Row = null
    if (itr.hasNext) {
      titleRow= itr.next()
    }
    while (itr.hasNext) {
       converter.convert(itr.next(), titleRow)
    }


  }
}
