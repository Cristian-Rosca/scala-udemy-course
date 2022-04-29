package lectures.part1basics

object CBVvsCBN extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = { // => tells compiler that the value will be called by name
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime()) // the values printed here are identical
  calledByName(System.nanoTime()) // the values printed are different

  // in call by value -> the exact value of the expression is computed first before the function evaluates. Then that value is used throughout the entire function definition
  // in call by name -> the expression is passed literally as is and is evaluated each time. In the above case, it is evaluated 2 times
  // CBN is evaluated at every use within the function definition

  // CBN is extremely useful in Lazy Streams and in things that might fail

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite()) // CBV would try to evaluate both arguments first and would result in stackOverFlow error
  // CBN allows the method to run with the infinite argument

}
