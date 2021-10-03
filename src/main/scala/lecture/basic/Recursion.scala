package lecture.basic

import scala.annotation.tailrec

/**
 * @project scala_for_beginner
 * @created by aboubakar on 02/10/2021
 */
object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing Factorial of " + n + " - I first need Factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computing Factorial of " + n)
      result
    }
  }
  println(factorial(5))


  def anotherFactorial(n: Int):  Int = {
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    factHelper(n, 1)

  }


  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)
  }

  println(concatenateTailrec("Hello ", 3, ""))



  def isPrime(n: Int): Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t -1, n % t !=0 && isStillPrime)
    }
    isPrimeTailrec(n / 2, true)

  }
  println(isPrime(2003))
  println(isPrime(629))



  def fibunacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextLast: Int): Int = {
      if (i >= n ) last
      else fiboTailrec(i + 1, last + nextLast, last)
    }
    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibunacci(8))  // ==> 1 1 2 3 5 8 13 21

}
