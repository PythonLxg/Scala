package day01

object test05 {
  def main(args: Array[String]): Unit = {
    test(4) //结合栈的原理理解
    //println(test(4))  会多输出一个()
  }

  def test(n: Int): Unit= {  //递归不能使用类型推断，要有明确的返回类型
    if (n > 2) {
      test(n - 1) //如果有return则就不可以类型推断，要明确写：返回类型 =，没有return则会类型推断，可以直接=
    } //返回类型什么都没写(:Unit=)代表函数没有返回值，即使加上return在println语句中也只返回()
    println("n=" + n)
  }
}
