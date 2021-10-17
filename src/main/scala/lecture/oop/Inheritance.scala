package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 17/10/2021
 */
object Inheritance  extends App {
  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat = println ("nomnom")

    }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCat: String) extends Person(name)


  //Overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch", "crunch")
    }
  }

//  class Dog(dogType: String) extends Animal {
//    override val creatureType: String = dogType
//  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)


  // Type substitution
  val unknownAnimal : Animal = new Dog("K9")
  unknownAnimal.eat

  // OVERRIDING vs overLOADING

  // super

  //preventing ovverrides
  //1 - use final on member
  //2 - use final on the entire class
  //3 - seal the class = extends in THIS FILE, prevent extension in other files

}
