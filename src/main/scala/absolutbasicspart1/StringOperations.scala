package absolutbasicspart1

object StringOperations extends App {

  val aString: String = "Hello, this is Jitendra"

  println(aString.charAt(2))
  println(aString.substring(3, 8))
  println(aString.split(" ").toList)
  println(aString.replace(" ", "-"))
  println(aString.trim)


}
