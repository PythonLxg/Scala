package day04

import scala.collection.mutable

object test04 {
  def main(args: Array[String]): Unit = {
    //变长队列。队列在底层可以由数组或链表来实现
    val q1 = new mutable.Queue[Int]() //创建空队列（FIFO）
    q1 += 4
    q1 ++= List(1, 2) //依次将List中每一个元素加入到队列的末尾
    //q1 += List(3, 4) //将List整个加入到队列的末尾，队列类型必须为Any
    println(q1)
    val dequeueElem = q1.dequeue() //出队，从队列的头部取出一个元素
    println("dequeueElem=" + dequeueElem + "\t" + "q1=" + q1)
    q1.enqueue(100, 33, 100, 44) //入队
    println(q1)

    //返回队列的元素，不会改变队列
    println(q1.head) //返回队列的第一个元素
    println(q1.last) //返回队列的最后一个元素
    println(q1.tail) //返回队列的尾部元素（返回除第一个元素的剩余元素）
    println(q1.tail.tail) //可以级联使用
  }
}
