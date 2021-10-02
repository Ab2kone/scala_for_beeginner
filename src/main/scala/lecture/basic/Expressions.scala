package lecture.basic

/**
 * @project scala_for_beginner
 * @created by aboubakar on 02/10/2021
 */
object Expressions extends App {

  val x = 1 + 2   // expression
  println(x)


  println(2 + 3 * 4)
  // == !=  >  <=  <  <=

  println(1 == x)
  // + - * / & | ^ << >> >>> décalage à droite sans extension

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 6
  println(aVariable)


  // IF expression
  val aCondition = true
  val aConitionnedValue = if (aCondition) 5 else 3
  println(aConitionnedValue)


  // while expression
  var i = 0
//  while (i < 10) {
//    println(i)
//    i += 1
//  }

  val aWeirdValue  = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), while, reassigning


  val aWihle = while (i < 10) {
    println(i)
    i += 1
  }


  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "goodbye"
  }








}
