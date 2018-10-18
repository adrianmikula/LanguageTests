package functions


object Map {

  def mapInteger(int:Int) : Int =
  {
    int + 1
  }

  def main (args: Array[String])
  {
    printf("Scala map test")
    val input  = List.range(1,15)

    // map a List using an already defined function
    printf("\n" + input.map(mapInteger).toString())

    // filter a List using an inline anonymous function
    printf("\n" + input.filter((i:Int) => i % 2 == 0).toString())

    // filter a List using an shorthand inline function
    printf("\n" + input.filter(_ % 2 == 0).toString())
  }

}