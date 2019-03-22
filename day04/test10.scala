package day04

object test10 {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(println)
    println("---------------")
    (1 to 5).par.foreach(println(_)) //par(parallel)并行计算。也可以用于map，filter，reduce，fold

    val res1 = (1 to 100).map{_ => Thread.currentThread.getName}.distinct
    val res2 = (1 to 100).par.map{_ => Thread.currentThread.getName}.distinct
    println(res1)
    println(res2)

    //模式匹配
    println("====================")
    val  oper = "#"
    val n1 = 23
    val n2 = 11
    var res = 0

    oper match{
      case "+" => res = n1 + n2
      case "-" => res = n1 - n2
      case "*" => res = n1 * n2
      case "/" => res = n1 / n2
      case _ => println("oper error")  //没有这句话就会匹配不到，会报错。默认匹配
    }
    println("res:" + res)

    for(i <- "+-3!"){
      var sign = 0
      var digit =0

      i match{
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if i.toString.equals("3") => digit = 3 //条件守卫
        case _ if i > 110 => println("i > 110")
        case _ => sign = 2
      }
      println(i, sign, digit)
    }
  }
}
