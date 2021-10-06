package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 06/10/2021
 */


import scala.language.postfixOps

object Methodotation extends App {


  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movies: String): Boolean = movies == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

//    def HangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the check?"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def islive : Boolean = true

    def apply(): String = s"Hi my name is $name and i like $favoriteMovie"

    def apply(n: Int): String = s"$name wathed $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")  //equivalent
  // infix notation = operation notation (syntactic sugar)


  //Operator in scala
  val tom = new Person("Tom", "Figth club")
//  println(mary HangOutWith tom)


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

  /**
   * Exerccice
   *
   * 1. Overload the + operator
   *  mary + "the rockstar" => new person "Mary (the rockstart)"
   *
   *  2. Add an age to the person class
   *  Add a unary + operator => new person with the age + 1
   *  +mary => mary with the age incrementer
   *
   *  3. Add a "learns" method in the Person class => "Mary learns Scala"
   *  Add a learnsScala method, calls  learns method with scala"
   *  Use it in postfix notation
   *
   *  4. Overload the apply method
   *  mary.apply(2) "mary watched Inception 2 times
   */

  println((mary + "the rockstar ").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))




}
