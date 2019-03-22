package day04

object test07 {
  def main(args: Array[String]): Unit = {
    //    val list1 = List(1, 2, 3)
    //    var list2 = List[Int]()
    //    for (item <- list1) {
    //      list2 = list2 :+ item * 2
    //    }
    //    println("list2:" + list2)
    val list1 = List(1, 2, 3)
    val list2 = list1.map(sum1)
    println("list2:" + list2)

    val name1 = List("Jack", "Bob", "lxg")
    val name2 = name1.flatMap(upper) //扁平化
    println("name2:" + name2)

    val name3 = name1.filter(startJ)
    println("name3:" + name3)

    val list3 = list1.reduceLeft(sum)
    println("list3:" + list3)

    val list4 = list1.reduceLeft(min)
    println("list4:" + list4)

    val list5 = list1.foldRight(5)(sum)  //函数的柯里化
    //等价于foldLeft (5.0 /: list1)(sum) 或 foldRight (list1 :\ 5.0)(sum)
    println("list5:" + list5)

    val list6 = (1 to 5).scanLeft(5)(sum)  //扫描，集合中的元素作fold操作，保存中间结果
    println("list6:" + list6)


    val sss = test(sum1, 2)
    println("sum1=" + sss)

    val h = hello _ //将函数赋给变量，但不运行。是func类型，不加_是Unit类型
    h()
  }

  def hello(): Unit = {
    println("hello")
  }

  def test(f: Int => Int, n1: Int): Int = { //高阶函数
    f(n1)
  }

  def sum1(n: Int): Int = {
    n * 2
  }

  def upper(s: String): String = {
    s.toUpperCase

  }

  def startJ(str: String): Boolean = {
    str.startsWith("J")
  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  def min(n1: Int, n2: Int): Int = {
    if (n1 > n2) n2 else n1
  }
}
