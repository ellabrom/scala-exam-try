package com.epam.scala_exam.services

import com.epam.scala_exam.model.User
import com.epam.scala_exam.services.validators.ValidatorAggregator
import org.springframework.stereotype.Service

@Service
class ReportServiceImpl(validatorAggregator:ValidatorAggregator) extends ReportService {
  override def validateDataInFiles(listBaseInfo:List[User]): Unit = {

    listBaseInfo.filter(baseInfo=>validatorAggregator.validateAllData(baseInfo)).foreach(println(_))

  }
}
