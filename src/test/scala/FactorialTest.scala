import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.flatspec.AnyFlatSpec

class FactorialTest extends AnyFunSuite {

  val testfact1: Factorial = new Factorial()
  test("Testing the Factorials using recursion of the given numbers ") {
    assert(testfact1.factorial(5) == 120)
    assert(testfact1.factorial(10) == 3628800)
  }

  test("Testing the Factorials using tail recursion of the given numbers ") {
    assert(testfact1.tailFactorial(5) == 120)
    assert(testfact1.tailFactorial(10) == 3628800)
    assert(testfact1.tailFactorial(15) == 1307674368000L)
  }

  class FactorialTest2 extends AnyFlatSpec {
    "Factorial" should "handle StackOverflowError" in {
      val fact = new Factorial()
      assert(fact.factorial(6) == 720)
      assert(fact.tailFactorial(10) == 3628800)
      assert(fact.tailFactorial(20) == BigInt("2432902008176640000"))
    }
  }
}
