package lecture.basic

/**
 * @project scala_for_beginner
 * @created by aboubakar on 03/10/2021
 */
object CBNvsCBV extends App {
  def calledByValue(x: Long):Unit = {
    println("By value: "+ x)
    println("By value: "+ x)
  }

  def calledByName(x: => Long): Unit = {
    println("By name: "+ x)
    println("By name: "+ x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite())
}
