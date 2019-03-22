package day01

object test04 {
  def main(args: Array[String]): Unit = {

    val dog = new Dog //或者val dog = new Dog()
    println("dog=" + dog.sum(1, 2))

    val f1 = dog.sum _ //方法转换成函数
    println("f1:" + f1)
    println("f1=" + f1(1, 2))

    val f2 = (a: Int, b: Int) => {
      a + b
    }
    println("f2:" + f2)
    println("f2=" + f2(2, 3))

    def f3(a: Int, b: Int): Int = a + b

    println("f3=" + f3(1, 3))
  }
}

class Dog {
  //方法与函数书写和运行机制是一致的，但函数更灵活
  def sum(a: Int, b: Int): Int = {
    a + b
  }
}
