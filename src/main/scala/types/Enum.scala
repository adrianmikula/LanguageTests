package types

object Enum {


  object Side extends Enumeration{
    type Side = Value
    val LEFT, RIGHT, TOP, BOTTOM = Value
  }

  import Enum.Side._

  def main (args:Array[String]): Unit =
  {
    var playerSide :Side = LEFT
    if (playerSide == LEFT)
      {
        println("player is on the left")
      }
  }

}
