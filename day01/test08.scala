package day01

object test08 {
  def main(args: Array[String]): Unit = {
    try {
      myerro()
    } catch { //只有一个catch，但有多个case
      //处理异常，异常范围应从小到大开始
      case ex: ArithmeticException => println("ex1捕获了异常：" + ex.getMessage)
      case ex: Exception =>
        println("ex2捕获了异常：" + ex.getMessage)
    } finally {
      println("我不管，我就要执行。。。。") //可以用来释放资源
    }
    println("ok.....")

    //自定义异常
    def myerro(): Nothing = {  //异常的返回类型是Nothing
      throw new Exception("第一个异常") //抛出异常，不做处理
    }
  }
}
