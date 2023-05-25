package week1

object Module {

  def square(x: Double): Double = x * x

  def sumOfSquares(x: Double, y: Double): Double = square(x) + square(y)

  def abs(x: Double): Double = if(x < 0) then -x else x

  def isGoodEnough(guess: Double, x: Double): Boolean = 
    abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double): Double = (guess + x / guess) / 2

  def sqrIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) then guess
    else sqrIter(improve(guess, x), x)

  def sqrt(x: Double): Double = sqrIter(1.0, x)

}