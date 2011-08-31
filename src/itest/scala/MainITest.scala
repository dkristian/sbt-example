class MainTest extends org.scalatest.FunSuite {
  test("main-integration") {
    println("Running integration test")
    assert(Main.f("1234") === 4)
  }
}
