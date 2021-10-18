package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 17/10/2021
 */
object AbstractDataType extends App {
  //abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "wild"
    override def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat (animal: Animal): Unit
    val preferredMeal: String = "fresh meal"
  }
  trait colBlooded

  class Crocodile extends Animal with Carnivore with colBlooded {
    val creatureType: String = "croc"

    def eat: Unit = println("nomnomnom")

    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // trait vs abstract class

  //1 - traits do not have constructor parameter
  //2- multiple traits may be inherited by the same class
  //3- traits = behavior, abstract class = "thing"


}
