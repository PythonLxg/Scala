package day03

//动态混入特质
object test08 {
  def main(args: Array[String]): Unit = {
    //在不修改类的定义的基础上，让他们可以使用trait方法
    val oracle = new Oracle with Operate
    oracle.insert(100)
    val mysql = new Mysql with Operate
    mysql.insert(200)
    //当抽象类有抽象方法时如何动态混入
    val mysql_1 = new Mysql_1 with Operate {
      override def say(): Unit = {
        println("say hi")
      }
    }
    mysql_1.insert(300)
    mysql_1.say()
  }
}
trait Operate{
  def insert(id: Int): Unit ={
    println("插入数据：" + id)
  }
}
class Oracle{

}
abstract class Mysql{

}
abstract class Mysql_1{
  def say()
}
//创建对象方式：1 new对象 2 apply创建 3 匿名子类方式 4 动态混入