package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 03/10/2021
 */
object OOBasic extends App {
  val person = new Person("KONE", 20)
  println(person.name + " => " + person.age)
  person.greet("Abk")
  person.greet()
}

// Constructor
class Person(val name: String, val age: Int) {

  //body
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi I am $name")


  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Abou KONE")
}

