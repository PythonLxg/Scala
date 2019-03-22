package day04

import scala.collection.mutable.ListBuffer

object test03 {
  def main(args: Array[String]): Unit = {
    //元组可以存放不同类型的元素，元组中最多有22个元素
    val tuple = (2, 3, 4, "sdf", (1, 2)) //创建类型是Tuple5
    println(tuple)
    println(tuple._1) //访问元组的第一个元素
    for (i <- tuple.productIterator) { //Tuple是一个整体，遍历需要调用迭代器
      println(i)
    }

    //定长List
    val list01 = List(1, 2, 3, "hello") //List本身是不可变的集合，List可以放任何数据类型，类型为List[Any]
    println(list01)
    println(list01(1)) //查询
    val list = list01 :+ 4 //添加 在最后面加4，直接返回给list，list01没有改变
    //val list = 4 +: list01 在最前面加4
    println(list)
    println(list01)

    val list2 = 3.0 :: 4.5 :: list01 //从右向左依次执行,集合对象一定要放在最右边
    val list3 = 3.0 :: 4.5 :: list01 :: Nil
    println(list2)
    println(list3)
    val list4 = 3 :: 4 :: list01 ::: Nil //:::两边必须是集合对象，将左边集合中的每一个元素依次加入到右边的集合对象中
    println(list4)

    val list02 = Nil //Nil代表空集合List()
    println(list02)

    //变长List
    val ls0 = ListBuffer[Int](1, 2, 3)
    println(ls0(1))
    val ls1 = new ListBuffer[Int]() //空List
    ls1 += 4
    ls1.append(5, 6)
    println(ls1) //（4，5，6）变长List会改变
    ls1 ++= ls0
    println(ls1) //(4,5,6,1,2,3)

    val ls2 = ls1 ++ ls0 //等同于ls1 ++= ls0，将ls0中的每一个元素添加到ls1中
    println(ls2)
    val ls3 = ls1 :+ 6 //ls1不会改变，ls3会改变
    println(ls3) //(4,5,6,1,2,3,6)
    ls3.remove(1) //删除下标是1的元素

    for(i <- ls3){ //遍历
      print(i + "\t")
    }
  }
}
