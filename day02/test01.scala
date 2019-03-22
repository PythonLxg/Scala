package day02

object test01 {
  def main(args: Array[String]): Unit = {
    val cat = new Cat //创建对象
    cat.name = "小白" //cat.name不是直接访问属性的而是cat.name_$eq("小白")
    cat.age = 10
    cat.color = "白色"
    //print(cat.address)  打印null
    println(cat.say())
    println(s"小猫信息如下：\nname:${cat.name}, age:${cat.age}, color:${cat.color}") //底层调用cat.name(),cat.age()
  }
}

// 一个scala源文件可以有多个类，所有类默认为public
class Cat {
  //声明一个属性必须显示初始化，没有类型时会类型推导
  var name = "小猫" //底层对应private name
  var age: Int = _ //_在Int类型中默认为0， Float，Double默认0.0
  var color: String = _ //_在String和引用类型中默认为null，Boolean默认false
  var fish = new Dog //属性也可以是引用类型
  //var address = null //Null类型
  val addr: String = null // String类型
  def say(): String = {
    this.name + "喵喵喵~~~"
  }
}

class Dog {

}
