package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def factorialHelper(x: Int, accumulator: Int = 1 ): Int = // can set default value using = value. If second arg is not passed, default val will be used
    if (x <= 1) accumulator
    else factorialHelper(x-1, x * accumulator)

  // leading parameters cannot be called without a value as the compiler will be confused 
  
  // Solutions: 1) pass in every leading args 2) name the arguments -> this also lets you pass them in different orders
  
}
