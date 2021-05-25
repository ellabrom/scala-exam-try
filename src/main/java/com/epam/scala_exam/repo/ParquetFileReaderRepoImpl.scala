package com.epam.scala_exam.repo

import com.epam.scala_exam.model._
import com.epam.scala_exam.services.converters.DataConverter
import org.apache.poi.ss.usermodel.{Row, WorkbookFactory}
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.stereotype.Component

import java.io.File
import scala.collection.mutable.ListBuffer


@Component
class ParquetFileReaderRepoImpl(@Value("${input_files_path}") val input_files_path: String,
                                @Value("${parquet_file_ext}") implicit val fileExt: String,
                                @Autowired val converter: DataConverter) extends FileReaderRepo {
  override def readFilesToMemory(): List[User] = {

    val parquetFiles: List[File] = findFilesInInputPath
    val listOfObjectsInAllFilesToReturn = new ListBuffer[ListBuffer[User]]()
    val itr = parquetFiles.iterator
    while (itr.hasNext) {
      listOfObjectsInAllFilesToReturn += readExcelFileToMemory(itr.next())
    }
    listOfObjectsInAllFilesToReturn.toList.flatMap(list => list.toList)

  }

  private def readExcelFileToMemory(file: File): ListBuffer[User] = {

    val listToReturn = new ListBuffer[User]()
    val itr = WorkbookFactory.create(file).getSheetAt(0).iterator()
    var titleRow:Row = null
    if (itr.hasNext) {
      titleRow= itr.next()
    }
    while (itr.hasNext) {
      listToReturn += converter.convert(itr.next(), titleRow)
    }
    listToReturn
  }
}
