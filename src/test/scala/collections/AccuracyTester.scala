package collections

import collections.concrete.{ConcreteProduct_Double, ConcreteProduct_Int}
import collections.generic.{GenericProduct_FoldLeft, GenericProduct_For, GenericProduct_ForEach}

object AccuracyTester
{

  // use map to generate test data generically
  // we are assuming that the test list data is deterministic
  val expectedResultMap = Map(
    (1,1) -> 99,
    (5,5) -> 99,
    (10,10) -> 99,
    (1,2) -> 99,
    (0,0) -> 99,
  )

  def main(args:Array[String]):Unit=
  {

    // test all input values
    for (expectedResult <- expectedResultMap) {

      val size1 = expectedResult._1(1)
      val size2 = expectedResult._1(2)

      // test all data types
      for (concrete <- Implementations.concretes) {

        // test all algorithms
        for (generic <- Implementations.generics) {
          println("Testing " + generic._1 + " algorithm with " + concrete._1 + " type")

          // calculate the inner product
          var list1 = concrete._2.getTestList(size1)
          var list2 = concrete._2.getTestList(size2)
          val result = concrete._2.innerProduct(list1, list2, generic._2)

          // check that this result matches the other results
          if (result == expectedResult._2) {
            println("Matching result: " + result)
          }
          else {
            println("Non-matching result: " + result)
          }
        }
      }
    }
  }

}
