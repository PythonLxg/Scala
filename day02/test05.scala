package day02

object test05 {
  def main(args: Array[String]): Unit = {
    val work = new worker("Tom")
    println(work.name) //不能访问inName
    val work2 = new worker2("jack")
    println(work2.inName)
    val work3 = new worker3("lxg")
    work3.inName = "lixiaogen"
    println(work3.inName)
  }
}

class worker(inName: String) { //inName没有修饰默认是局部变量,不可读写
  var name: String = inName
}

class worker2(val inName: String) { //val修饰参数，inName就是一个private的只读属性
  var name: String = inName
}

class worker3(var inName: String) { //var修饰参数，inName就是一个private的可读写属性
  var name: String = inName
}