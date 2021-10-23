package lecture.oop

/**
 * @project scala_for_beginner
 * @created by aboubakar on 23/10/2021
 */
object CaseClass extends App {
  /*
  equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. Sensible toSting
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim.toString)

  // 3. equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)


  // 4. CCs have  handy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extractor paterns = CCs can be usedd in PATTER MATCHING
  case object Unitedkingdom {
    def name: String = "The UK of CB and NI"

    /*
    Expland MyList = use case classes and case objects
     */

  }




}
