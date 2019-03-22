package day02

// 构造器(主构造器和辅助构造器)，支持重载,没有返回值。创建对象时需要引入参数就有了构造器。
object test03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person01("lxg", 22)
    println(p1)
    //可以用多个辅助构造器，根据参数决定调用哪个辅助构造器。构造器不能重名（根据参数判断）
    val p2 = new Person01("tom")  //调用辅助构造器
    println(p2)

    val a = new A  //当构造器没有参数时可以省略()
    println(a)
  }
}
//创建对象的同时初始化属性，可以将构造器当作函数，会执行类定义的所有语句
class Person01(inName:String, inAge: Int) {  //可以在()前加private将主构造器私有化
  //主构造器
  var name: String = inName
  var age: Int = inAge
  age += 10
  println("hello....")

  override def toString: String = {
    "name:" + this.name + "\tage:" + this.age
  }

  println("hi------")
  println("age:" + age)

  def this(name: String) { //辅助构造器，可以在def前加private将辅助构造器私有化
    this("jack", 10) //必须在第一行显式调用主构造器（或直接调用或间接（可以相当于继承）调用主构造器）
    this.name = name
  }
}

class A{  //当构造器没有参数时可以省略()
  println("hello world")
}
