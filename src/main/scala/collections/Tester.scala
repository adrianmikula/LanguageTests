package collections

import collections.concrete.{ConcreteProduct_Double, ConcreteProduct_Int}
import collections.generic.{GenericProduct, GenericProduct_FoldLeft, GenericProduct_For}

import scala.util.Random



object Tester
{

  val generics = Map(
    "foldLeft" -> new GenericProduct_FoldLeft(),
    "for" -> new GenericProduct_For()
  )

  val concretes = Map(
    "double" -> new ConcreteProduct_Double(),
    "int" -> new ConcreteProduct_Int()
  )

  def main(args:Array[String]):Unit=
  {
    // first argument is the max list size to test
    val maxListSize = args(0).toInt

    // second argument is the size increment between each test
    val amountToIncrement = args(1).toInt

    // calculate a new list size for this round
    var listSize = amountToIncrement

    // check if we have reached the end of the test
    while (listSize <= maxListSize) {

      // test all combinations with this list size
      for (concrete <- concretes) {
        for (generic <- generics) {

          println("Testing " + generic._1 + " algorithm with " + concrete._1 + " type and list size of " + listSize)
          var list1 = concrete._2.getTestList(listSize)
          var list2 = concrete._2.getTestList(listSize)

          // shuffle the lists
          //list1 = scala.util.Random.shuffle(list1)
          //list2 = scala.util.Random.shuffle(list2)

          timeTaken {concrete._2.innerProduct(list1, list2, generic._2)}
        }
      }

      // now increment the size of the lists for the next run
      listSize += amountToIncrement
    }

  }

  //See http://biercoff.com/easily-measuring-code-execution-time-in-scala/
  def timeTaken[R](block: => R):R=
  {
    val startTime = System.nanoTime()
    val result = block
    val endTime = System.nanoTime()

    println("Time taken was " + (endTime - startTime) + "nanoseconds")
    result
  }

}