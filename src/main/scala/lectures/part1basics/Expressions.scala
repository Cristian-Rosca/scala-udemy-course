package lectures.part1basics

object Expressions extends App {

  val x = 1+ 2 // this is an expression

  // an instruction is something you tell the computer to do
  // an expression is something that has a value and/or a type -> in scala we think in terms of exprssions. Every bit of your code will compute a value

  // if expressions in scala give back a value

  val aCondition = true

  val aConditionalValue = if(aCondition) 5 else 10 // if () is true, set value to 5, else set it to 10

  // loops are discouraged in scala -> they are specific to imperative programming

  // side effects in scala are expressions returning Unit
  // a Unit type can only hold the value ()
  // while loops are side effects and these return Unit

  // Side-Effects -> println, whiles, re-assigning (they are like instructions but in scala they are expressions returning Unit)

  // Code Blocks -> are also expressions. Value of a block is the value of its last expression

  // instructions -> "do something"
  // expressions mean "give me the value of something"

  val aCodeBlock = {
    val y = 2
    val x = y + 1

    if (x > 2) "hello" else "goodbye"
  }


}
