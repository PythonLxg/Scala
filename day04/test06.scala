package day04

import scala.collection.mutable

object test06 {
  def main(args: Array[String]): Unit = {
    //集Set是不重复元素的集合，没有顺序，默认以哈希集（数组+链表）实现
    val set1 = Set(1, 2, 3, 2) //默认不可变Set
    //set1 += 4 会报错，除非声明set1为var，产生一个新的Set，原来的Set没有改变
    println(set1)
    val set2 = mutable.Set(1, 2, "hello", 2) //可变Set
    println(set2)

    set2 += 3 //添加
    println(set2)
    set2 -= 3 //删除，删除对象不存在时也不会报错
    set2.remove("hello")
    println(set2)
    for(s <- set2) println(s) //遍历
  }
}
