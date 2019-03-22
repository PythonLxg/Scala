package day03


object test05 {
  def main(args: Array[String]): Unit = {
    val child1 = new Child("小明")
    val child2 = new Child("小红")
    val child3 = new Child("小亮")
    Child.join(child1) //可以直接用伴生对象的属性和方法
    Child.join(child2)
    Child.join(child3)
    Child.showNum()
    println("---------------")
    val pig = new Pig("小花")
    //用apply方法创建对象
    val pig1 = Pig("小黑猪")
    val pig2 = Pig()
    println("pig.name:" + pig.name)
    println("pig1.name:" + pig1.name)
    println("pig2.name:" + pig2.name)

  }
}

//class ScalaPerson称为伴生类，将非静态内容写入到该类中。编译后生成ScalaPerson类，ScalaPerson.class
//object ScalaPerson称为伴生对象，将静态内容写入到该对象中。编译后生成ScalaPerson$类，ScalaPerson$.class
//伴生类和伴生对象必须要有相同的名称，而且必须在同一个源码文件中
class Child(inName: String) {
  var name: String = inName
}

object Child {
  var total: Int = 0

  def join(child: Child): Unit = {
    println(s"${child.name}小孩加入了游戏")
    total += 1
  }

  def showNum(): Unit = {
    println(s"当前有${total}个小孩")
  }
}

class Pig(inName: String) {
  var name: String = inName
}

object Pig {
  def apply(inName: String): Pig = new Pig(inName)

  def apply(): Pig = new Pig("匿名")

}