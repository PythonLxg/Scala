package day01

object test07 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(3, 4)  //懒惰函数（延迟加载），也可以给变量分配lazy，但不能修饰var类型的变量
    println("-----------------")
    println("res:" + res)  //在要使用res前才执行，真正需要才执行
  }

  def sum(a: Int, b: Int): Int = {
    println("sum()执行了。。。。")
    a + b
  }
}
