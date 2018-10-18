package collections.concrete

import collections.generic.GenericProduct

trait ConcreteProduct[T] {

  //type Type <: T

  def innerProduct(list1:Seq[T], list2:Seq[T], implementation:GenericProduct): T

  def getTestValue(): T

  def getTestList(size:Int): Seq[T]
}
