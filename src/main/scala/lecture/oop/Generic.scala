package lecture.oop

import lecture.oop.AbstractDataType.Animal

/**
 * @project scala_for_beginner
 * @created by aboubakar on 17/10/2021
 */
object Generic extends App {

  class MyList[+A] {
    //use the type A
    def add[B >: A] (element: B): MyList[B] = ???

    /**
     * A = Cat
     * B = Animal
     */
  }

  class MyMap[key, Value]


  val listOfInteger = new MyList[Int]
  val listOfString = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]


  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // animalList.add(new Dog) ??? HARD QUESTION => we return a list of Animal

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]


 //3. Hell, no!  CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car

  // generic type needs proper bounded type
//  val newCage = new Cage(new Car)


  // expand MyList to be generic




}
