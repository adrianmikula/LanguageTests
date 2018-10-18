package functions

class Constructors(var message:String) {
  println("instance under construction")

  def sayHi() = println(message)
}

object Constructors {


  def main (args: Array[String]): Unit =
  {
    val obj = new Constructors("hello world!")
    obj.sayHi()
  }
}


