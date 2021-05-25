package com.epam.scala_exam.repo

import com.epam.scala_exam.model.{Person, User}
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import java.io.File
import scala.collection.mutable.ListBuffer
import scala.io.Source


@Component
class AvroFileReaderRepoImpl(@Value("${input_files_path}")  val input_files_path: String,
                              @Value("${auro_file_ext}") implicit val fileExt: String
                             ) extends FileReaderRepo {
  override def readFilesToMemory(): List[User] = {
    val auroFiles: List[File] = findFilesInInputPath
    val listOfObjectsInAllFilesToReturn = new ListBuffer[List[User]]()
    val itr = auroFiles.iterator
    while (itr.hasNext) {
      listOfObjectsInAllFilesToReturn += readAuroFileToMemory(itr.next())
    }
    listOfObjectsInAllFilesToReturn.toList.flatMap(list => list.toList)
  }

  private def readAuroFileToMemory(file: File): List[User] = {

    val testTxtSource =  Source.fromFile(file)
    val objectMapper = new ObjectMapper
    objectMapper.registerModule(DefaultScalaModule)
    val persons = objectMapper.readValue(testTxtSource.getLines.mkString, classOf[Array[Person]])
    persons.toList
    testTxtSource.close()
    persons.toList

  }
}
