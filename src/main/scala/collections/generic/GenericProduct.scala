package collections.generic

trait GenericProduct {

  def innerProduct[T](list1:Seq[T], list2:Seq[T], map:(T,T) => T, fold:(T,T) => T, zero: T):T

}
