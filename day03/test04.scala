package day03

object test04 {
  def main(args: Array[String]): Unit = {
    //匿名子类 =>必须动态实现抽象类的所有抽象方法和属性
    val animal = new Animal {
      override def cry(): Unit = {
        println("Hello Animal")
      }

      override var gender: String = _
    }
    animal.cry()
  }
}

//scala中抽象类就是不能被实例化的类
//（1）定义一个抽象类，需要使用关键字abstract。
//（2）定义一个抽象类的抽象方法，也不需要关键字abstract，只要把方法体空着，不写方法体就可以。
//（3）抽象类中定义的字段，只要没有给出初始化值，就表示是一个抽象字段，但是，抽象字段必须要声明类型。
//抽象类的价值在于设计。让子类继承并实现抽象类（实现抽象类的抽象方法），所以不可以用private，final修饰。
abstract class Animal {
  var name: String = "" //普通字段
  var gender: String //抽象字段
  def cry() //抽象方法，不可以加abstract
}

//子类继承父类必须实现父类的所有抽象方法和属性
class Dog extends Animal {
  override var gender: String = "male"

  override def cry(): Unit = {
    println("汪汪叫。。。")
  }
}
