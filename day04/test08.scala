package day04

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object test08 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAABBBBCCCDDDDD"
    val arrayBuffer = new ArrayBuffer[Char]()

    val newArray = sentence.foldLeft(arrayBuffer)(putArray)
    println("newArray:" + newArray)

    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
    println("map2:" + map2)

    val map3 = mutable.Map[Char, Int]()
    sentence.foldLeft(map3)(charCount2)
    println("map3:" + map3) //可变Map是无序的

    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)

    val list3 = list1.zip(list2)  //当两个集合的数据个数不对应时，会造成数据丢失
    println("list3:" + list3)

    for(item <- list3){
      println(item._1 + ":" + item._2)
    }
  }

  def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

  //使用不可变Map
  def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
    map + (char -> (map.getOrElse(char, 0) + 1))
  }

  //使用可变Map
  def charCount2(map: mutable.Map[Char, Int], char: Char): mutable.Map[Char, Int] = {
    map += (char -> (map.getOrElse(char, 0) + 1))
  }
}
