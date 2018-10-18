package types

object Tuples {

  def main(args:Array[String]): Unit =
  {
    val pair = ("String", 24)
    val (label, value) = pair
    printf("pair item 1 " + pair._1)
    printf("\npair item 2 " + pair._2)

    //val pairs = List[(Char, Int)] = ('a', 1) :: ('b', 2) :: Nil

  }
}
