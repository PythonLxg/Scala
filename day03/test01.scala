package day03

object test01 {
  def main(args: Array[String]): Unit = {
    var person = new Person
    val emp = new Emp
    emp.printName()
    println("------------")
    val s = "string"
    println(s.getClass.getName) //给出对象的类名，反射机制
    println(classOf[String]) //给出对象的类名
    println(emp.isInstanceOf[Emp]) //判断对象是不是类的实例

    person = emp //将子类引用给父类
    val emp1 = person.asInstanceOf[Emp] //将父类引用重新转成子类引用（多态），即向下转型
    emp1.printName()
  }
}

class Person {
  var name: String = "Tom"

  def printName(): Unit = {
    println("name:" + name)
  }

  def sayHi(): Unit = {
    println("Hi....")
  }
}

class Emp extends Person {
  override def printName(): Unit = { //重写父类方法要用override
    println("emp name:" + name)
    super.printName() //重写父类方法时,调用父类方法要用super
    sayHi() //直接调用父类方法
  }
}