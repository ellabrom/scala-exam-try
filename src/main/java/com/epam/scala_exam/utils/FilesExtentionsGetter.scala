package com.epam.scala_exam.utils

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


object FilesExtentionsGetter {
  var avroFileExtention: String = ""
  var parquetFileExtention: String = ""

  @Component
  class FilesExtentionsGetterClass(@Value("${avro_file_ext}")
                                   val avroFileExt: String,
                                   @Value("${parquet_file_ext}")
                                   val parquetFileExt: String) {

    avroFileExtention = avroFileExt
    parquetFileExtention = parquetFileExt

  }

}
