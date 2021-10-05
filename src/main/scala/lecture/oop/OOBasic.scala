package lecture.oop

import org.w3c.dom.css.Counter

/**
 * @project scala_for_beginner
 * @created by aboubakar on 03/10/2021
 */
object OOBasic extends App {
  val person = new Person("KONE", 20)
  println(person.name + " => " + person.age)
  person.greet("Abk")
  person.greet()

  val author = new Writer("ABK", "KONE", 22)
  val imposter = new Writer("ABK", "KONE", 22)
  val novel = new Novel("CLY", 31, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))


  val counter = new Counter
  counter.inc
  counter.inc.inc.inc
  counter.inc(10)
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

/**
 * Navel and Writer
 *
 * Writer FirstName, surname, year
 *
 * -method fullname
 *
 * Novel: name, year of release, author
 * -authorAge
 * isWritetenBy(author)
 * copy (new year of release) = new instance of Novel
 */
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String =  firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)

}

/**
 * Counter class
 * -receive an int value
 * method to increment and decrement => new counter
 * overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }


  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }


  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  println(count)

}


