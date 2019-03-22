package day04

import scala.collection.mutable.ArrayBuffer

//scala集合分为可变集合和不可变集合，默认不可变集合。有三大类：序列Seq，集Set，映射Map，都扩展自Iterable特质
object test02 {
  def main(args: Array[String]): Unit = {
    //定长数组（声明泛型）
    val arr = new Array[Int](4) //创建
    //val arr1 = Array(1, 3, "hello") //泛型为Any,该数组可以存放任意类型元素
    println("arr的长度：" + arr.length)
    println("arr(0):" + arr(0)) //查询
    arr(1) = 10 //修改，数组本身是不可变的，但数组内容是可以修改的
    for (i <- arr) { //遍历
      print(i + "\t")
    }
    //arr.toBuffer 定长数组转变长数组。直接返回变长数组，arr本身没有改变
    println("\n" + "==============")

    //变长数组（声明类型）
    val arr1 = ArrayBuffer[Any](3, 2, 5) //创建
    //val arr1 = ArrayBuffer[Int]()
    println("arr1(1)=" + arr1(1)) //查询
    println(arr1.hashCode())
    arr1(1) = 4 //修改 （3，4，5）
    println(arr1.hashCode())
    arr1.append(6.32, 7.5) //添加（3，4，5，6.32，7.5）接收可变参数
    println(arr1.hashCode())
    for (i <- arr1) {
      print(i + "\t")
    }
    println()
    arr1.remove(0) //删除（2，5，6.32，7.5）
    for (i <- arr1) {
      print(i + "\t")
    }
    //arr1.toArray 变长数组转定长数组。直接返回定长数组，arr1本身没有改变
    println("\n" + "============")

    //多维数组
    val arr2 = Array.ofDim[Double](3, 4) //创建
    arr2(0)(0) = 4 //添加
    arr2(2)(2) = 4.6 //添加
    println("arr2(2)(2) = " + arr2(2)(2)) //查询
    for (i <- arr2) {
      for(j <- i){
        print(j + "\t")
      }
      println()
    }
  }
}
