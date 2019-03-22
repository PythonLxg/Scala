package day03


object test10 {
  def main(args: Array[String]): Unit = {

  }
}

//特质可以继承类，用来扩展该类的一些功能
trait LoggedException extends Exception {
  def log(): Unit = {
    println(getMessage())
  }
}

class ErrorException extends LoggedException { //ErrorException是Exception的子类
  override def getMessage = "错误！"
}

//如果混入该特质的类已经继承了另一个类（A类），那么必须要求该类（A类）是特质超类的子类
class ErrorException2 extends IndexOutOfBoundsException with LoggedException {
  override def getMessage = "错误！"
}

//Logger就是自身类型特质。作用就是解决特质的循环依赖问题
//相当于trait Logger extends Exception，要求混入该自身类型特质的类也是Exception子类
trait Logger {
  this: Exception =>  //明确告诉编译器我就是Exception
  def log(): Unit = {
    println(getMessage())
  }
}
//class Console extends Logger{}  错误
class Console extends Exception with Logger{}  // 正确