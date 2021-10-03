package lecture.basic

/**
 * @project scala_for_beginner
 * @created by aboubakar on 03/10/2021
 */
object StringOps extends App {
  val str: String = "Hello i am learning scala!"

  println(str.charAt(2))

  println(str.substring(7, 11))

  println(str.split(" ").toList)

  println(str.startsWith("Hello"))

  println(str.replace(" ", "-"))

  println(str.toLowerCase())

  println(str.length)


  val aNumberString = "45"
  val aNulber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))


  // Scala-specific string interpolator


  // s-interpolators
  val name = "Abk"
  val age = 20
  val greeting = s"Hello, my namee is $name and I am $age years old"
  val anotherGreeting = s"Hello, my namee is $name and I am ${age + 1} years old"
  println(anotherGreeting)


  // F-interpolators
  val seed = 1.2f
  val myth = f"$name%s can eat $seed%2.2f burgers per minutes"
  println(myth)


  //raw-interpolators
  println(raw"This is a \n newline")
  val escaped = "This is a \\n newline"
  println(raw"$escaped")


}
