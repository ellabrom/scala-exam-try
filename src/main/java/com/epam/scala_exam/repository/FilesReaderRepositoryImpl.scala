package com.epam.scala_exam.repository

import com.epam.scala_exam.repository.Extentions.FileExt
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository

import java.io.File

@Repository
class FilesReaderRepositoryImpl (@Value("${input_files_path}")
                                 val input_files_path:String)extends FilesReaderRepository {


  override def readFiles():Unit = {
    val list: List[File] = findFilesInInputPath()
    list.foreach(_.readFileToMemory())
  }
  private def findFilesInInputPath(): List[File] = {
    val d = new File(input_files_path)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    }
    else  Nil
  }



}
