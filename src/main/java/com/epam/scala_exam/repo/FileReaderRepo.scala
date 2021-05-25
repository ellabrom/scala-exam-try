package com.epam.scala_exam.repo

import com.epam.scala_exam.model.User

import java.io.File


trait FileReaderRepo {
  val input_files_path:String
  def findFilesInInputPath(implicit fileExtention:String):List[File] = {
    val d = new File(input_files_path)
       if (d.exists && d.isDirectory) {
               d.listFiles.filter(_.isFile).filter(_.getName.endsWith(fileExtention)).toList
        }
       else
         Nil
  }
  def readFilesToMemory():List[User]

}
