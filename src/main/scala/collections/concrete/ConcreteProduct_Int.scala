package collections.concrete

import collections.generic.GenericProduct

import scala.util.Random

class ConcreteProduct_Int[Int] extends ConcreteProduct[Int] {

  def innerProduct(list1:Seq[Int], list2:Seq[Int], implementation:GenericProduct): Int =
  {
    val map = (v1:Int,v2:Int) => {v1 * v2}
    val fold = (v1:Int,v2:Int) => (v1 + v2)

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
