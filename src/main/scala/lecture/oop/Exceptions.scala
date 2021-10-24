package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 24/10/2021
 */
object Exceptions extends App {

  val x: String = null
  //  println(x.length)
  //  this ^^ will crash with a NPE

   //throwing and catching exception

  //1. throwing and cathing exceptions

//  val aWeirdValue: String =  throw new NullPointerException

  //throwable classes extend the Throwable class.
  //Exception and Error are the major Throwable subtypes

  //2. how to crash exceptions
  def getInt(withException: Boolean): Int =
    if (withException) throw new RuntimeException("No int for you!")
    else 42
  val potentialFail = try {
    // code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => 43
  } finally {
    // code that will get executed NO MATTER WHAT

    // does not influence the return type of the this expression
    // use finally only for side effects
    println("finally")
  }

  println(potentialFail)

  // 3. how to define your own exceptions
  class MyException extends Exception
  val exceptions = new MyException

  throw exceptions

  /*
  1. Crach your program with a OutOfMemoryError
  2. Crach with SOError
  3. PocketCalculator
     - add(x, y)
     - subtract(x,y)
     - multiply(x, y)
     - divide(x, y)

     throw
        - OverflowException if add(x,y) exceeds Int.MAX_VLUE
        - UnderflowException if subtract(x,y)  excceds Int.MIN_VALUE
        - MathCalculationException for division by 0
   */

  // OOM
//  val array = Array.ofDim(Int.MaxValue)

  // SO
//  def infinite: Int = 1 + infinite
//  val noLimit = infinite

//  object PocketCalculator {
//    def add(x: Int, y: Int) = {
//      val result = x + y
//      if (result > Int.MaxValue)
//    }
//  }

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int) = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int) = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new Exception
      else if (x < 0 && y < 0 && result < 0) throw new Exception
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if (x > 0 && y > 0 && result < 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y:Int) = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }


  }

//  println(PocketCalculator.add(Int.MaxValue, 10))
  println(PocketCalculator.divide(2, 0))





}
