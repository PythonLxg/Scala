package day04

import scala.collection.mutable.ArrayBuffer

object test11 {
  def main(args: Array[String]): Unit = {
    //类型匹配
    //匹配数组
    val arrs = Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))
    for (arr <- arrs) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => ArrayBuffer(y, x)
        case Array(0, _*) => "以0开头的数组"
        case _ => "什么都不是"
      }
      println("result:" + result)
    }

    //匹配列表
    val lists = Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))
    for (list <- lists) {
      val result2 = list match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + ":" + y
        case 0 :: _ => "0...."
        case _ => "someyhing else"
      }
      println("result2:" + result2)
    }

    //匹配元组
    val tuples = Array((0, 1), (1, 0), (12, 1), (1, 0, 2))
    for (tuple <- tuples) {
      val result3 = tuple match {
        case (0, _) => "0..."
        case (y, 0) => y
        case (x, y) => (y, x)
        case _ => "other"
      }
      println("result3:" + result3)
    }
  }
}
