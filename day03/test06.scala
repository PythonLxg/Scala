package day03

object test06 {
  def main(args: Array[String]): Unit = {
    type MyInt = Int  //给类型去别名

    val c = new C
    val f = new F
    c.getConnect()
    c.sayHello()
    f.getConnect()
  }
}
//特质的使用  特质 = 接口 + 抽象类。特质是用来解决单继承问题
//1 没有父类：   class 类名 extends 特质1 with 特质2 with 特质3。。。
//2 有父类：     class 类名 extends 父类名 with 特质1 with 特质2。。。。

trait Trait01{  //富接口：既有抽象方法又有具体方法
  def getConnect()  //抽象方法
  def sayHello(): Unit ={  //具体方法
    println("say hello")
  }
}

class A{

  object age

}
class B extends A{}
class C extends A with Trait01 {
  override def getConnect(): Unit = {
    println("连接数据库mysql")
  }
}
class D{}
class E extends D{}
class F extends D with Trait01{
  override def getConnect(): Unit = {
    println("连接数据库redis")
  }
}

//java的接口都可以当作trait来使用
object T1 extends Serializable{

}