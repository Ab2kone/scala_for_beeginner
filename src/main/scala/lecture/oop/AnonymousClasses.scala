package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 18/10/2021
 */
object AnonymousClasses extends App {

      abstract class Animal {
        def eat: Unit
  }


  // Anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahahahahaha")
  }

  /*

  equivalent with

  //  class AnonymousClasses$$anon$1 extends Animal {
  //    override def eat: Unit = println("ahahahahahahahaha")
  //  }
  val funnyAnimal: Animal = new AnonymousClass$$anon$1
   */

  println(funnyAnimal.getClass())

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }


  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }

}
