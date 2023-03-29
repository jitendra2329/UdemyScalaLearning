package absolutbasicspart1

object TailRecursion extends App {

  def fibonacci(number: Int): Int = {
    def fibonacciHelper(num: Int, accumulator1: Int, accumulator2: Int): Int = {
      if (num <= 0) accumulator1
      else fibonacciHelper(num - 1, accumulator2, accumulator1 + accumulator2)
    }

    fibonacciHelper(number, 0, 1)
  }

  println(fibonacci(8))

  def factorial(number: Int): Int = {
    def factorialHelper(num: Int, accumulator: Int): Int = {
      if (num <= 0) accumulator
      else factorialHelper(num - 1, num * accumulator)
    }

    factorialHelper(number, 1)
  }

  println(factorial(5))
}
