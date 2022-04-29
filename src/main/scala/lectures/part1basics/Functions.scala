package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1) // this is a recursive function because it calls itself
    // 'n' reduces every time the function is called until it reaches the condition of n==1
  }

  // you would use recursive functions instead of loops in Scala
  // WHEN YOU NEED LOOPS, USE RECURSION
  // The worst thing you can do is write imperative code with scala syntax

    // Recursive methods need you to specify its return type

  // Simple function
  def simpleGreet(name: String, age: Int) = {
    println("Hello my name is " + name + " and I am " + age + " years old")
  }

  // Factorial Function -> recursive -> multiplying each number is a sequence up until the input number
  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else {
      n * factorial(n-1)
    }
  }

  // Fibonacci Function-> Recursive
  def fibonacci (n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
}

// Test if a number is prime -> revise prime number and the method implmentation 

def isPrime(n: Int): Boolean = {
  def isPrimeUntil(t: Int): Boolean =
    if (t<= 1) true
    else n % t != 0 && isPrimeUntil(t-1)

  isPrimeUntil(n / 2)
}