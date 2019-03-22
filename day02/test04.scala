package day02

object test04 {
  def main(args: Array[String]): Unit = {
    val a = new AA("lxg")
    //对象创建的流程：
    //1 加载类的信息（属性和方法）
    //2 在内存中（堆）开辟空间
    //3 使用父构造器进行初始化
    //2 使用主构造器进行初始化
    //3 使用辅助构造器进行初始化
    //4 将开辟的地址空间赋给a这个引用
  }
}

//调用顺序：父类， 主构造器，辅助构造器
class BB{
  println("BB")
}

class AA extends BB{
  println("AA01")
  def this(name: String){
    this
    println("AA02")
  }
}