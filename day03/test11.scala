package day03

//嵌套类（内部类）
object test11 {
  def main(args: Array[String]): Unit = {
    //创建外部类实例
    val outer1: OuterClass = new OuterClass()
    val outer2: OuterClass = new OuterClass()
    //创建成员内部类实例
    val inner1 = new outer1.InnerClass() //内部类实例与外部类对象相关联
    val inner2 = new outer2.InnerClass()
    inner1.info()

    inner1.test(inner1) //内部类实例与外部类对象相关联
    //inner1.test(inner2)  报错。解决办法def test(ic: OuterClass#InnerClass):Unit={}就是类型投影
    //类型投影作用就是屏蔽外部类对内部类对象的影响
    //创建静态内部类实例
    val staticInner = new OuterClass.StaticClass() //内部类实例与外部类对象相关联
  }
}

class OuterClass { //外部类
  val name = "lxg"
  private val sal = 30000.99

  class InnerClass { //成员内部类
    def info(): Unit = { //内部类可以访问外部类
      println("name:" + OuterClass.this.name + "  sal:" + OuterClass.this.sal)
    }

    def test(ic: InnerClass): Unit = {
      println(ic)
    }
  }

}

object OuterClass { //伴生对象
class StaticClass {} //静态内部类
}