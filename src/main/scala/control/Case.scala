package control

object Case {
  def main (args:Array[String]): Unit = {

    val input = List(1,2,3,5,6,7)

    input match {
      //case 1 :: 2 => println("starts with 1 and ends with 7")
      case _ => println("none of the above")
    }



  }
}
