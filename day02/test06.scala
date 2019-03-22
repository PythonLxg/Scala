package day02
//import scala.collection.mutable.{HashMap, HashSet=>HS}  选择要导入的包的部分内容,HashSet=>HS重命名

object test06 {
  def main(args: Array[String]): Unit = {
    val tiger1 = new day02.xh.Tiger
    val tiger2 = new day02.xm.Tiger
    println(tiger1)
    println(tiger2)
    //包的作用：1 区分名字相同的类 2 管理众多的类 3 控制访问范围 4 对类的功能进行扩展
    //打包的本质：创建不同的文件夹来保存类文件
    //类的源文件可以和包对应的文件路径不一致，但编译后的.class文件(字节码文件)必须和包对应的文件路径一致(编译器自动完成)
    //命名规范：com.公司名.项目名.业务模块名
    //在Scala中java.lang包,scala包,Predef包会自动导入
    //import可以在任意位置，但作用域在当前类中
  }
}
//在文件中创建包
//package day02{  //包可以包含包，类，对象，特质，不可以是函数/方法，变量等
//  class User{  //创建一个User类
//      import day02.lxg.Person  父包要访问子包内容必须import
//      def say():Unit={
//        val p = new Person
//      }
//  }
      //包对象会在底层生成两个类package和package$
//    package object lxg{  //创建包对象，是lxg包的包对象，一个包只能有一个包对象，包和包对象是同级的，名称须一致
//      val age = 0  //包对象中的属性和方法可以在对应包中使用
//      def hi(): Unit ={
//        println("hi")
//      }
//    }
//  package lxg{  //可以嵌套创建子包，共生成三个文件（Person.class, Test.class, Test$.class）
//    class Person{
//      private[day02] val name="lixiaogen"  包访问权限扩大private(protected)的访问范围至day02，这样就可以在main中访问name
//      def sayName(): Unit={
//        println("name:" + this.name)
//      }
//    }
//    object Test{
//      def main(args: Array[String]): Unit = {
//        val user = new User //子包可以直接访问父包的内容。当本包也有相同类时优先访问本包(就近原则)，否则就要加指定路径
//        println("ok")
//      }
//    }
//  }
//}
