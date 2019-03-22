package day01

import scala.io.StdIn

object test01 {
  def main(args: Array[String]): Unit = {
    println("hello,scala")
    println("姓名：")
    val name = StdIn.readLine()
    println("年龄：")
    val age = StdIn.readInt()
    println("薪水：")
    val salary = StdIn.readDouble()
    printf("姓名：%s,年龄：%d,薪水：%.2f", name, age, salary)

    if (age > 18) {
      if (age > 40) {
        println("年龄太大了")
      }
      printf("\n%s已成年", name)
    } else {
      printf("\n%s未成年", name)
    }

    //    val x = 6
    //    val a = if(x>0) 1 else -1

    //    if(){
    //
    //    }else if(){
    //
    //    }else if(){
    //
    //    }else{
    //
    //    }

    //    for (item <- 1 to 10) {
    //      println("hello:" + item)
    //    }

    //    for(i <- 1 to 5; j <- 1 to 3){
    //      println(i*j)
    //    }
    //
    //    for (item <- 1 until 10) {
    //      println("hello:" + item)
    //    }

    //    for (item <- 1 to 10 if item != 5){
    //      println("hello:" + item)
    //    }

    //    for (item <- 1 to 10 by 2){
    //      println("hello:" + item)
    //    }

    //    for (item <- 1 to 10; items = 4-item){
    //      println(items)
    //    }

    //    val res = for (item <- 1 to 10) yield { //for推导式
    //      if (item % 2 == 0) { //将得到的item放入集合vector中并返回给res
    //        item
    //      } else {
    //        "不是偶数"
    //      }
    //    }
    //    println(res)

    //    for(item <- Range(2,10,2)){ //不包括10
    //      println("item:" + item)
    //    }
    //    for(item <- 1 to 10 if item % 2 == 1){
    //      println("item:" + item)
    //    }
  }
}
