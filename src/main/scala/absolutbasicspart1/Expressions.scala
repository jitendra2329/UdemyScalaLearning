package absolutbasicspart1

object Expressions extends App {

  // if expression

  val ifResult = if (true) true else false

  // code blocks

  val aCodeBlock = {
    val number = 5
    val number2 = 10
    if (number < number2) "Yes" else "No"
  }

  // while loop

  var i = 0

  // side effect
  while (i < 11) {
    println(i)
    i += 1
  }

  //Exercises

  //  what is the value of the following codes ?
  val aValue = {
    2 < 3
  }

  val anOtherValue = {
    if (aValue) 2323 else 434
    343
  }
}
