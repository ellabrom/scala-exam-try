package com.epam.scala_exam.services.files_format_converters

import com.epam.scala_exam.model.{Client, GenderEnum, MaritalStatusEnum, User}
import org.apache.poi.ss.usermodel.Row
import org.springframework.stereotype.Service

@Service
class ExcelRowToObjectFilesFormatConverterImpl (excelSheet: org.apache.poi.ss.usermodel.Sheet) extends FilesFormatConverter {
  val titlesMap = collection.mutable.Map.empty[String,Int]

  override def convert(): Unit ={
//    val titleRowIterator = titleRow.cellIterator()
//    val titlesMap = collection.mutable.Map.empty[String,Int]
//    var i=0
//    while (titleRowIterator.hasNext) {
//      titlesMap += titleRowIterator.next().toString -> i
//      i += 1
//    }
//    Client(firstName = row.getCell(titlesMap("First Name")).toString, lastName=row.getCell(titlesMap("Last Name")).toString, gender=GenderEnum.withName(row.getCell(titlesMap("Gender")).toString.toLowerCase), age=row.getCell(titlesMap("Age")).toString.toDouble.toInt,
//      email=row.getCell(titlesMap("Email")).toString, phoneNumber=row.getCell(titlesMap("Phone")).toString, education=row.getCell(titlesMap("Education")).toString, occupation=row.getCell(titlesMap("Occupation")).toString, salary=row.getCell(titlesMap("Salary")).toString.toDouble.toInt,
//      maritalStatus=MaritalStatusEnum.withName(row.getCell(titlesMap("Marital Status")).toString.toLowerCase),numOfChildren= row.getCell(titlesMap("Number of Children")).toString.toDouble.toInt)
//
//  }


}

