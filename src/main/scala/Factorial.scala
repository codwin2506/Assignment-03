import scala.annotation.tailrec

class Factorial {

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  @tailrec
  final def tailFactorial(n: BigInt, accumulator: BigInt = 1): BigInt = {
      if (n <= 1) accumulator
      else tailFactorial(n - 1, n * accumulator)

  }
}
