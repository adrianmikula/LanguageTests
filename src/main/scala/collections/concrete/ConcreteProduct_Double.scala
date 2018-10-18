package collections.concrete

import collections.generic.GenericProduct

import scala.util.Random

class ConcreteProduct_Double[Double] extends ConcreteProduct[Double] {

  //type Type = Double

  def innerProduct(list1:Seq[Double], list2:Seq[Double], implementation:GenericProduct): Double =
  {
    val map:(Double,Double) => Double = (v1, v2) => (v1 * v2)
    val fold:(Double,Double) => Double = (v1,v2) => (v1 + v2)

    implementation.innerProduct[Double](list1, list2, map, fold, 0.0)
  }

  def getTestValue(): Double =
  {
    (Random.nextDouble())
  }

  def getTestList(size:Double): Seq[Double] =
  {
    Seq.range(1.0, size)
  }

}
