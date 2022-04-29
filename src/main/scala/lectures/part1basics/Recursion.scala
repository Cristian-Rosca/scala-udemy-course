package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n-1) // the last expression here is n multiplied by the factorial of n-1

    // each call of a recursive function uses what we call a 'stack frame'

    //stackOverflow errors happen when the recursive depth is too big (e.g: if we try to get the factorial of 5000)

    // the program stack frame will first go all the way down in n until it reaches the base case, it will then start calculating the outputs from the base case upwards
    // e.g: to calculate the factorial of 3, it first needs the factorial of 2, to calculate the factorial of 2, it first needs the factorial of 1 (base case),
    // -> program gets factorial of 1, then computes factorial of 2, then computes factorial of 3

  def anotherFactorial(n:Int): Int = {
    @tailrec // tells the program that this function is supposed to be tail recursive - you can use this to check if your funciton is tailrec
    def factorialHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator) // tail recursion (can see in symbol at the side also) -> Use recursive call as the LAST expression

    factorialHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
  = factorialHelper(9, 10 * 1)
  = factorialHelper(8, 9 * 10 * 1)
  = factorialHelper(7, 8* 9 * 10 * 1)
  = ...
  = factorialHelper(2, 3 * 4 * 5 * 6 * 7 * 8* 9 * 10 * 1)
  = factorialHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8* 9 * 10 * 1)
  Then because n finally is = 1, the value of the expression is the accumulator

  We wrote factorialHelper as the last expression of its code path
  -> This allows scala to preserve the same stack frame and not use additional stack frames for recursive calls
  -> Scala doesn't need to save intermediate results here to be used later like the initial factorial function
  -> This is known as TAILS RECURSION
  */

  // when you need LOOPS, use TAIL RECURSION

  // 1. Rewrite the string concatiantor function from previous using tail recursion. (Concatenate string n times)

  // 2. IsPrime function in tail recursive manner

  // 3. Fibonacci Function that is tail recusrive

  // -> The key to making functions recursive is to use the 'accumulator' to store intermediate results rather than call the function recursively
  // -> You will need as many accumulators as you have recursive calls on your code paths

  // Concatenate a string n times

  @tailrec
  def stringConcatenator (string: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else stringConcatenator(string, n, string + accumulator)
    
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
      
    isPrimeTailRec(n / 2, true)
      
  }
}
