package control

object For {
  def main (args:Array[String])
  {
    val min = 1
    val max = 5

    for (x <- min to max)
      {
        println("looping to " + x)

      }

    for (x <- min until max)
    {
      println("looping until " + x)
    }

    // iterating over a collection
    val ints = List(1,4,7,8,9)
    var sum = 0
    ints.foreach (sum += _)
    println(sum)

    for (int <- ints) println(int)

  }
}
