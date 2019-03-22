package day04

object test01 {
  //隐式函数可以有多个，但必须保证隐式函数的匹配是唯一的。
  //隐式转换与函数名无关，只与函数签名（函数参数类型和返回值类型）有关
  def main(args: Array[String]): Unit = {
    implicit def f1(num: Double): Int = { //隐式函数实现数据类型转换
      num.toInt
      //val num1: Int = 3.5 隐式操作不能嵌套使用,形成了递归
    }

    val num1: Int = 3.5
    println("num1=" + num1)

    //隐式函数丰富类库功能
    implicit def addDelete(mysql: Mysql): DB = {
      new DB
    }

    val mysql = new Mysql
    mysql.add()
    mysql.delete() //addDelete(mysql).delete()

    //隐式值
    implicit val n1 = "Jack"
    //implicit val n2 = "lxg" 会报错，唯一性
    //implicit val n = 12  匹配不到隐式值就会使用默认值

    //name就是隐式参数，优先级：传值 > 隐式值 > 默认值
    def hello(implicit name: String): Unit = { //hello$1
      println("hello " + name)

      def hello(): Unit = { //hello$2
        println("*****")
      }
    }

    hello //不要加(),调用的是hello$1
  }

  def hello(): Unit = { //hello
    println("*****")
  }

  //隐式类
  implicit class DB1(val m: Mysql) { //隐式类不能是顶级的
    def addShuffle(): Unit = {
      println(m + "scala")
    }
  }

  val mysql1 = new Mysql
  mysql1.add()
  mysql1.addShuffle()
}

class Mysql {
  def add(): Unit = {
    println("add...")
  }
}

class DB {
  def delete(): Unit = {
    println("delete...")
  }
}
