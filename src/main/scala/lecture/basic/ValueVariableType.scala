package lecture.basic

/**
 * @project scala_for_beginner
 * created by aboubakar on 02/10/2021
 */
object ValueVariableType extends App {
  /**
   * VAL affecté à une variable rend la variable IMMUTABLE
   * c_d_a on peut plus affecté une nouveelle valeur à la variable
   */
  val x: Int = 42
  println(x)

  val aString: String = "Hello am a string"

  /**
   * pas besoin de définir le type d'une variable
   * le compilateur scala peut reconnaitre et affecter
   * le type à une variable selon la valeur
   */
  val anotherStrin = "boodbaye"


  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val  anInt: Int = 5
  val aShort: Short = 4564
  val aLong: Long = 1459782L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.54

  var aVariable: Int = 4
  aVariable = 5















}
