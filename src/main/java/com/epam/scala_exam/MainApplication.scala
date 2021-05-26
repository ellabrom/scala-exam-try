package com.epam.scala_exam

import com.epam.scala_exam.controllers.ReportFlowControllerImpl
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean

import java.io.File


@SpringBootApplication
class MainApplication


  object MainApp extends App {



    private val context: ConfigurableApplicationContext = SpringApplication.run(classOf[MainApplication])
     context.getBean(classOf[ReportFlowControllerImpl]).controlFlow()
}

