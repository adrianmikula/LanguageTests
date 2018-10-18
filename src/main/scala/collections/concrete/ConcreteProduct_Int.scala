package collections.concrete

import collections.generic.GenericProduct

import scala.util.Random

class ConcreteProduct_Int[Int] extends ConcreteProduct[Int] {

  //type Type = Int

  def innerProduct(list1:Seq[Int], list2:Seq[Int], implementation:GenericProduct): Int =
  {
    val map:(Int,Int) => Int = (v1, v2) => (v1 * v2)
    val fold:(Int,Int) => Int = (v1, v2) => (v1 + v2)

    implementation.innerProduct[Int](list1, list2, map, fold, 0)
  }

  def getTestValue(): Int =
  {
    (Random.nextInt())
  }

  def getTestList(size:Int):Seq[Int]=
  {
    Seq.range(1, size)
  }
}
