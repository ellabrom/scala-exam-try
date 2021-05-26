package com.epam.scala_exam.repository

import com.epam.scala_exam.model.User

import scala.collection.mutable.ListBuffer

object ReadedFiles {
  private val listOfReadedFiles = new ListBuffer[Any]()

  def addReadedFiles(readedFile: Any): Unit = {
    listOfReadedFiles+=readedFile
  }

  def getReadedFilesList: List[Any] = {
    listOfReadedFiles.toList
  }

}
