package absolutbasicspart1

object Functions extends App {
  def aParameterLessFunction(): Int = 34

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aFunctionWithParameter(aString: String, number: Int): String = {
    aString + " " + number
  }

  println(aFunctionWithParameter("Jitendra ", 23))

  def aRepeatedFunction(name: String, number: Int): String = {
    if (number == 1) name
    else name + aRepeatedFunction(name, number - 1)
  }

  println(aRepeatedFunction("Jitenda ", 5))

  def aGeetingFunction(name: String, age: Int): String = s"Hello, my name is $name and i am $age years old"

  println(aGeetingFunction("Jitendra", 24))

  def factorial(number: Int): Int = {
    if (number <= 0) 1
    else number * factorial(number - 1)
  }

  println(factorial(5))

  def fibonacciSeries(number: Int): Int = {
    if (number == 0) 0
    else if (number == 1) 1
    else fibonacciSeries(number - 1) + fibonacciSeries(number - 2)
  }

  println(fibonacciSeries(8))

  // my solution
  def isPrime(number: Int): Boolean = {
    def isPrimeHelper(num: Int, divisor: Int): Boolean = {
      if (divisor == 1) true
      else if (num % (divisor) == 0 && divisor >= 2) false
      else isPrimeHelper(num, divisor - 1)
    }

    isPrimeHelper(number, number / 2)
  }

  println(isPrime(131))

  //rock the jvm solution

  def isPrimeNumber(number: Int): Boolean = {
    def isPrimeHelper(num: Int): Boolean = {
      if (num <= 1) true
      else number % num != 0 && isPrimeHelper(num - 1)
    }

    isPrimeHelper(number / 2)
  }

  println(isPrimeNumber(121))
}
