package day03

object test02 {
  def main(args: Array[String]): Unit = {
    val student01 = new Student01("smith")
    println(student01)
  }
}

class Person01(inName: String) {
  var myName: String = inName
  println("Person01")

  def this() {
    this("Person01")
    println("Person01辅助构造器")

  }
}

class Student01() extends Person01() { //只有主构造器可以调用父类构造器
  //suprer(name)  辅助构造器不可以调用父类构造器
  println("Student01")

  def this(name: String) {
    this
    this.myName = name
    println("Student01辅助构造器")
  }
}