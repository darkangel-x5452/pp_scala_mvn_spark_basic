package org.example

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]): String = x.foldLeft("")((a, b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

  val spark: SparkSession = SparkSession.builder()
    .master("local[*]")
    .appName("SparkApp")
    .getOrCreate()

  import spark.implicits._

  val columns: Seq[String] = Seq("language", "users_count")
  val data: Seq[(String, String)] = Seq(("Java", "20000"), ("Python", "100000"), ("Scala", "3000"))
  val rdd: RDD[(String, String)] = spark.sparkContext.parallelize(data)
  val dfFromRDD1: DataFrame = rdd.toDF(columns:_*)
  dfFromRDD1.printSchema()

  spark.close()
}
