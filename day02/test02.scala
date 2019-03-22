package day02

object test02 {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "lxg"
    p.age = 12
    val p1 = p  //p,p1同时指向同一块堆内存

    println(p1 == p)
    p.name = "Tom"
    println("p1.name:" +  p1.name)

  }
}

class Person{
  //没加private的属性在本类中从底层看是私有的(但自动生成setter/getter方法可读写)，加了private只读的。
  var name = "lxg"
  var age: Int = _  //使用_必须要指定类型
}
