package lecture.oop

import playgroung.{PrinceCharging, Cinderella => Princess}

import java.util.Date
import java.sql.{Date => SqlDate}

/**
 * @project scala_for_beginner
 * @created by aboubakar on 24/10/2021
 */
object PackagingAndImpots extends App {

  // package members are accessible by thier simple name
  val writer = new Writer("Daniel", "RocktheJVM", 2018)

  // impot the package
  val pricesse = new Princess // playground.Cinderella = fully qualified name

  // package are in hierarchy
  //matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  //imports
  val prince = new PrinceCharging

  //1. use FQ names
  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 4)

  //2. Use aliasing

  // default imports
  // java.lang - String, Object, Exception
  // Scala - Int, Nothing, Function
  //scala.Predef - println, ???

}
