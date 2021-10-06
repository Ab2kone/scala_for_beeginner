package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 06/10/2021
 */


import scala.language.postfixOps

object Methodotation extends App {


  class Person(val name: String, favoriteMovie: String){
    def likes(movies: String): Boolean = movies == favoriteMovie

    def HangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the check?"

    def islive : Boolean = true

    def apply(): String = s"Hi my name is $name and i like $favoriteMovie"

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")  //equivalent
  // infix notation = operation notation (syntactic sugar)


  //Operator in scala
  val tom = new Person("Tom", "Figth club")
  println(mary HangOutWith tom)


  println(1 + 2)
  println(1.+(2))


  //Prefix notation
  val x = -1    // equivalent 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~


  println(!mary)
  println(mary.unary_!)


  //post fix notation
  println(mary.islive)
  println(mary islive)


  // apply
  println(mary.apply())
  println(mary())
}
