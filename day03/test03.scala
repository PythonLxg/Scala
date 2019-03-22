package day03

object test03 {
  def main(args: Array[String]): Unit = {
    val obj1: A = new A
    val obj2: A = new B //动态绑定机制
    val obj3: B = new B
    println("obj1.age:" + obj1.age + "\t" + "obj2: " + obj2.age + "\t" + "obj3.age:" + obj3.age)
  }
}

class A {
  val age: Int = 10 //会生成publice age()
}

class B extends A {
  //重写字段
  override val age: Int = 20 //会生成publice age()覆盖父类的age属性
}

//方法只能重写方法，val只能重写val或不带参数的方法
//var只能重写抽象的var
//抽象字段（属性）就是声明了但没有初始化的字段（属性）
//抽象字段（抽象方法）必须在抽象类中
//抽象字段并不会在底层生成字段声明，而是生成两个抽象方法（bb(),bb_$eq()）所以类必须声明为抽象类
abstract class AA {
  var name: String
  var age: Int = 10
}

class AA1 extends AA{
  //如果在子类重写了父类的抽象字段，本质就是实现了抽象方法
  //可以写override也可以不写
  var name: String = ""
  //override var age = 20 var只能重写抽象的var
}
