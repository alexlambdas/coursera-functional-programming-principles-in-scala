package week1

import week1.Module.square
import week1.Module.sumOfSquares

class TestSuite extends munit.FunSuite:

  test("fn :: square") {
    assertEquals(square(5), 25.0)
  }

  test("fn :: sumOfSquares"){
    assertEquals(sumOfSquares(5, 5), 50.0)
  }
