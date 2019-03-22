package day04

object test12 {
  def fib(n: Int): Int = {
    def loop(n: Int, a: Int): Int = { //尾递归
      if (n <= 0) a else loop(n-1, n*a)
    }
    loop(n, 1)
  }
  //多态函数
  def findFirst[A](as: Array[A], p:A => Boolean):Int = {
    def loop(n: Int):Int = {
      if (n > as.length) -1
      else if (p(as(n))) n
      else loop(n+1)
    }
    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println(fib(5))
    println(findFirst(Array(11,22,33), (x: Int) => x == 22))
    val res = for(i <- Range(2, 10)) yield{
      if(i % 2 == 0){
        i
      }else{
        "不是偶数"
      }
    }
    println(res)
  }
}

