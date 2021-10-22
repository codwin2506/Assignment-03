import org.scalatest.funsuite.AnyFunSuite

class LogTest extends AnyFunSuite {

    val testLog: Log = new Log()
    test("Testing the Factorials using recursion of the given numbers ") {
      assert(testLog.log("Initial", "Level-01") == "Level-01: Initial")
      assert(testLog.log("Warning", "Level-02") == "Level-02: Warning")
      assert(testLog. log("Critical", "Level-03") == "Level-03: Critical")
      assert(testLog.log("Error", "Level-04") == "Level-04: Error")
      assert(testLog.log("System is starting") == "INFO: System is starting")
      assert(testLog.log("Shutting down...") == "INFO: Shutting down...")
    }
}
