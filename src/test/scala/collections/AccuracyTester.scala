package collections

import collections.concrete.{ConcreteProduct_Double, ConcreteProduct_Int}
import collections.generic.{GenericProduct_FoldLeft, GenericProduct_For, GenericProduct_ForEach}

object AccuracyTester
{

  def main(args:Array[String]):Unit=
  {
    // test all combinations
    for (concrete <- Implementations.concretes) {

      // store all the results so we can check that they match
      var results = Vector()
      for (generic <- Implementations.generics) {
        println("Testing " + generic._1 + " algorithm with " + concrete._1 + " type")

        // calculate the inner product
        var list1 = concrete._2.getTestList(10)
        var list2 = concrete._2.getTestList(10)
        val result = concrete._2.innerProduct(list1, list2, generic._2)

        // check that this result matches the other results
        if (results.isEmpty) {
          println("First result: " + result)
        }
        else if (results.contains(result)) {
          println("Matching result: " + result)
        }
        else {
          println("Non-matching result: " + result)
        }
        results += concrete._2.innerProduct(list1, list2, generic._2)
      }
    }
  }

}
