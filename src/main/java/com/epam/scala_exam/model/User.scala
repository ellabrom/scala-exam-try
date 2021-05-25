package com.epam.scala_exam.model

import com.epam.scala_exam.model.GenderEnum.GenderEnum


trait User{
  val name:String
  val gender:GenderEnum
  val age:Int
  val email:String
  val phoneNumber:String

}

