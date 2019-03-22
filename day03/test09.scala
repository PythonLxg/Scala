package day03

//特质叠加：构建对象的同时混入多个特质
//那么特质声明顺序从左到右，方法执行顺序从右到左
object test09 {
  def main(args: Array[String]): Unit = {
    //构建对象时动态混入特质
    val mysql = new Mysql4 with DB4 with File4
    //特质声明顺序从左到右
    println(mysql)
    //执行混入对象方法时顺序：1 从右到左 2 当执行到super时，是指左边的trait 3 如果左边没有trait，super就是父特质
    mysql.insert(888)
//    val op = new Mysql4 with Operate{
//      override var salary = _  //特质中未被初始化的字段和方法在具体的子类中必须被重写
//    }
  }
}
trait Operate4{
  //var salary: Int
  var name: String = "insert"  //混入该特质的类就具有该特质。具体字段不是继承， 而直接加入类，成为自己的字段
  println("Operate4")
  def insert(id:Int)
}
trait Data4 extends Operate4{
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入数据："+id)
  }
//  abstract override def insert(id: Int): Unit = {  //明确重写了抽象方法
//    println("插入数据："+id)
//    super.insert(id)  //子类特质调用super（和动态混入顺序有关），要声明abstract override
//  }
}
trait DB4 extends Data4{
  println("DB4")

  override def insert(id: Int): Unit = {
    println("向数据库：")
    super.insert(id)
  }
}
trait File4 extends Data4{
  println("File4")

  override def insert(id: Int): Unit = {
    println("向文件：")
    super.insert(id)
  }
}
class Mysql4{

}