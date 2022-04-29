package lectures.part1basics

object StringOps extends App {

  val str: String = "hello i am learning scala"

  println(str.charAt(2))

  println(str.substring(0,10))

  println(str.split(" ").toList)

  println(str.startsWith("hello"))

  println(str.replace(" ", "–"))

  // all of these the same as Java

  // some scala specific ones below

  val aNumberString = "45"

  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z') // pre-pending and appending

  println(str.reverse)




}
