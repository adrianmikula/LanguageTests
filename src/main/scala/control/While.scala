package control

object While {

  def main (args:Array[String]): Unit =
  {
    var continue = true

    while (continue)
      {
        println("looping")

        continue=false
      }
    println("stopped")
  }

}
