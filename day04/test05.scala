package day04

import scala.collection.mutable

object test05 {
  def main(args: Array[String]): Unit = {
    //Map是一个散列表（数组+链表），它存储的内容是键值对映射，可变Map是无序的，不可变Map是有序的，通过键（唯一的）索引
    //Map默认是不可变的。key-value支持Any类型，key-value在底层是Tuple2类型
    val map1 = Map("jack" -> 10, "lxg" -> 20, "scala" -> "java")
    //val map1 = Map(("jack",10),("lxg",20),("scala","java")) //对偶元组形式创建Map
    println(map1)

    //构建可变Map
    val map2 = mutable.Map("jack" -> 10, "lxg" -> 20, "scala" -> "java")
    println(map2)

    //创建空Map
    val map3 = new mutable.HashMap[String, Int]()
    println(map3)

    //Map取值
    println(map2("jack"))
    //println(map2("jacka")) key不存在报错
    if (map2.contains("jacka")) println("key存在 值=" + map2("jacka")) else println("key不存在")

    println(map2.getOrElse("jacks", "默认值是0"))
    //Map必须是可变的
    map2("rose") = 20 //key存在就更行，不存在就添加
    println(map2)

    map2 += ("A" -> 2) //增加单个元素
    println(map2)
    val map02 = map2 + ("A" -> 1, "B" -> 2) //增加多个元素
    //  map2 = map2 + ("A" -> 1, "B" -> 2) 会报错，因为map2是val
    println(map02)

    map2 -= ("A", "B") //key存在就删除，不存在也不会报错
    println(map2)

    //遍历
    val map4 = mutable.Map(("A", 1), ("B", 2), ("C", 3))
    for (k <- map4.keys) println(k)
    for (v <- map4.values) println(v)
    for (t <- map4) println(t + "\t" + "key=" + t._1 + "\t" + "value=" + t._2) //t是Tuple2类型
    for ((k, v) <- map4) println(k + "->" + v)
  }
}
