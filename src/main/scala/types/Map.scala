package types

class Map () {

  val states = Map("WA" -> "Western Australia", "ACT" -> "Australian Capital Territory")

  //val precise : Map[Char, Int]

  var mutable = collection.mutable.Map("NT" -> "Northern Territory")
  mutable += ("VIC" -> "Victoria")
  mutable("VIC") = "Queen Victoria"


}
