package lecture.basic

/**
 * @project scala_for_beginner
 * @created by aboubakar on 02/10/2021
 */
object Functions extends App {

  /**
   * concatenate 2 variables
   * @param x
   * @param n
   * @return
   */
  def aFunction(x: String, n: Int): String = {
      x + " " + n
  }

  println(aFunction("Hello ", 3))


  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)


  /**
   * Recursive function
   *
   * @param aString
   * @param n
   * @return
   */
  def aRepeatedFunction(aString: String, n: Int): String ={
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hi ", 4))


  def aFunctionWithSiedEffect(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
  def aSmallerFunction(a: Int, b:Int): Int = a + b

  aSmallerFunction(n, n - 1)
  }
  println(aBigFunction(5))


  def greetingForKids(name: String, age: Int): String = {
    "Hi, my name is " + name + " and Iam " + age + " years old"
  }
  println(greetingForKids("Abk", 15))


  /**
   * Factorial function
   * calculate a number factorial
   * @param n
   * @return
   */
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }
  println("result of Factorial: " + factorial(5))


  /**
   * fibonacci function
   * @param n
   * @return
   */
  def fibonacci(n: Int): Int = {
    if (n <= 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println("result of Fibonacci of 8 is: " + fibonacci(8))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0  && isPrime(t - 1)
  isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
