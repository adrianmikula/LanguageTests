package control

object If {
  def main (args:Array[String])
  {
    if (args.length > 0 && (args(0) == "true" || args(0) == "TRUE")) {
      println("you gave me what I wanted")
    }
    else
    {
      println("you didn't give me what I wanted")
    }

    println ("inline if " + (if (args.length > 0 && args(0) == "yes") 0 else 1))
  }
}
