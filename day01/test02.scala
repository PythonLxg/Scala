package day01

object test02 {
  def main(args: Array[String]): Unit = {
    val str1: String = "hello"  //变量声明时必须要初始化
    val str2: String = "scala"
    println(str1 + str2)
    println("hello" + str2)
    val name: String = "lxg"
    val age: Int = 22
    val height: Double = 178.563466445f  //低精度可以赋给高精度
    printf("name:%s age:%d, height:%.1f", name, age, height)
    println(s"\nname:$name, age:${age + 1}, height:${height.formatted("%.2f")}")
    println("height:" + height.formatted("%.2f"))

    //scala类型推导
    val num = 5  //类型一旦确定就不能修改类型，只能修改值
    println(num.isInstanceOf[Int])

    //var和val
    var num1 = 10  //var修饰的变量可以改变
    num1 = 20  //默认Int，加l或L表示Long类型
    val num2 = 20  //val修饰的变量不可以改变，推荐使用，因为没有线程安全问题，因此效率高
    println(num2)

    //scala中数据类型分为值类型和引用类型，但都是对象，一切皆对象
    val num3 = 10.3  //不加f默认Double类型
    println(num3.toDouble+"\t"+num3.toString)  //对象的方法没有形参可以省略()

    //数据类型：Byte,Char,String,Int,Float,Short,Long,Double,Boolean,Null,Unit,Nothing,Any,AnyRef
    //科学记数法  e表示乘以， E表示除以。  Boolean只有true和false，没有1和非1
    //Unit类型没有返回值，只有一个实例值(),Null类型只有一个实例值null，可以赋给任意AnyRef，但不可以赋给AnyVal
    //Nothing是任何类型的子类，Any是任何类型的父类

    val chr: Char='a'
    //val chr:Char=97  可以，由unicode码得到chr=‘a’
    //val chr1: Char= 'a' + 10 报错,因为'a' + 10是Int类型，Int精度比Char高
    val num4: Int=chr + 10
    println("num4:"+num4)

    var a: Short = 5  //可以
    val b: Byte = 2
    //a = a - 2  //不可以，a-2是Int类型，Int-> Short不可以
    a = (a-2).toShort  //可以，强制类型转换
    val c = a + b  //类型推导
    println("c type is Int:" + c.isInstanceOf[Int])

    var num5:  Double= 2.5
    num5 = num5.toInt
    val num6: String="2.5"
    //println(num6.toInt)  //会报错
    println(num6.toDouble)
    println(num5)
    println(num5.isInstanceOf[Double])

    //标识符：首字符为操作符（+-*/）时，后面必须紧跟至少一个操作符
    //关键字也可以作标识符，但是要加反引号   ` True`, Int，Float可以作标识符，因为Int是预定义标识符而不用加反引号，_不可以

    // a%b相当于 a-a/b*b
    //逻辑运算符（&&，||， ！）和关系运算符（>,<,==,!=）的结果都是Boolean

    val res = {
      if (num > 1) "hello" else 100
    }
    println("res:" + res)

    var x = 3
    var y = 4

    val t = x  //交换
    x = y
    y = t

    x = x + y  //交换
    y = x - y
    x = x - y
  }
}
