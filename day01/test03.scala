package day01

import util.control.Breaks._

object test03 {
  def main(args: Array[String]): Unit = {
    var n = 0
    breakable(  //breakable对break()抛出的异常做了处理
      while (n <= 10){
        n += 1
        print(n + " ")
        if(n == 8){
          break()
        }
      }
    )
    println("\nok~~~~")

    // 实现continue
    for(i <- 0 to 10){
      if(i != 3 && i!= 5) print(i + " " )
    }
    println()

    var flag = true
    var sum = 0
    for(i <- 0 to 10 if flag){
      sum += i
      if(sum >= 20){
        println("第一次和大于20的数：" + i)
        flag = false
      }
      println("i=" + i)
    }

  }
}
