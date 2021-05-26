package com.epam.scala_exam.model


import scala.collection.mutable.ListBuffer

object AggregatedUsers {
  private val listOfUsers = new ListBuffer[User]()

  def addUser(user: User): Unit = {
    listOfUsers+=user
  }

  def getUsersList: List[User] = {
    listOfUsers.toList
  }

}
