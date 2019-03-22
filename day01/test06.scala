package day01

object test06 {
  def main(args: Array[String]): Unit = {
    println(add_sum(n1 = 1, args = 4, 6, 8, 9, 3, 4))
  }

  def add_sum(n1: Int, args: Int*): Int = {  //可变参数args是一个序列类型
    println("args.length:" + args.length)
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }
}
