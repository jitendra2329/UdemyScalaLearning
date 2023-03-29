package absolutbasicspart1

object DefaultArguments extends App {

  def factorial(number: Int, accumulator: Int = 1): Int = {
    if (number <= 1) accumulator
    else factorial(number - 1, accumulator * number)
  }

  println(factorial(10))

  def profilePicture(formate:String="jpeg",height:Int,width:Int):Unit= println("Picture saved")

  profilePicture(height = 600,width = 500)
}
