package com.demo

import org.apache.spark.sql.SparkSession

object DemoSparkSession {
  def spark: SparkSession = {
    val session = SparkSession.builder().appName("DemoWordCount").master("local").getOrCreate()
    session
  }
}