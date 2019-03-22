package day03


object test07 {
  //实现单例模式
  def main(args: Array[String]): Unit = {
    val dog1 = Dog
    val dog2 = Dog
    println(dog1)
    println(dog2)
  }
}

class Dog private(){

}

object Dog{ //伴生类和伴生对象可以互相访问私有成员
  var singleDog: Dog = _  //不能为null

  def apply: Dog = {
    if(singleDog == null){
      singleDog = new Dog
    }
    singleDog
  }
}