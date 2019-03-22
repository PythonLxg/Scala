package day02

object test07 {
  //封装：1 隐藏实现细节 2 保证数据安全合理 3 同时加入业务逻辑
  //继承：主要可以解决代码的复用问题，提高代码的扩展性和维护性
  //scala与java的继承不同点
  //（1）重写一个非抽象方法必须使用override修饰符。
  //（2）只有主构造器可以调用超类的主构造器。
  //（3）在子类中重写超类的抽象方法时，不需要使用override关键字。
  //（4）可以重写超类中的字段
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "jack"  //子类不能直接访问私有属性，而是调用了student.name_$eq()方法（任意地方都可以访问）
    // student.age 子类不能访问加了private的私有属性和方法(在本类中可以)。
    //子类可以访问protected属性和方法，但在同包中不可以访问其方法
    student.info()
    student.sayHello()
  }
}

class Person10{
  var name: String = _
  var age: Int = _
  def info(): Unit = {
    println("信息如下：")
    println("name：" + this.name )
  }
}

class Student extends Person10{
  def sayHello(): Unit = {
    println("Hello")
  }
}