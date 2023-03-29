package absolutBasicsPart1

object Variables extends App {
  val number: Int = 20
  println(number)

  // val IS IMMUTABLE TYPE

  val aString: String = "Jitendra"
  val aChar: Char = 'a'
  val aFloatValue: Float = 3.43f
  val aDoubleValue: Double = 343.3
  val aShortValue: Short = 4234
  val aLongValue: Long = 323423424

  //var is MUTABLE

  var name: String = "Jitendra"
  println(name)
  name = "Ajit"
  println(name)
}
