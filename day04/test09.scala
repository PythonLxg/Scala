package day04

object test09 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4).iterator //得到迭代器
    while(iterator.hasNext){
      println(iterator.next())
    }
//    for(item <- iterator){
//      println(item)
//    }
    //流可以存放无穷多个元素，当需要用到时才取出，末尾元素遵循lazy规则（懒加载）
    def numFrom(num: BigInt): Stream[BigInt] = num #:: numFrom(num + 1)
    val stream1 = numFrom(1)
    println(stream1)
    println("head:" + stream1.head)
    println("tail:" + stream1.tail) //不能使用stream1.last
    println(stream1)

    def multi(n: BigInt): BigInt ={
      n * n
    }

    println(numFrom(5).map(multi))

    def eq(i: Int): Boolean ={
      i.toString.equals(i.toString.reverse)
    }
    //没加view
    val noView = (1 to 100).filter(eq)
    println("noView:" + noView)

    //对集合进行map，reduce，filter，fold操作时并不希望立即执行，而是在用到时在使用结果就用view作优化
    val view = (1 to 100).view.filter(eq)
    println("view:" + view)

    for(item <- view){
      println(item)  //相当于懒加载，用到时才执行，不会缓存数据，每次都要重新计算
    }
  }
}
