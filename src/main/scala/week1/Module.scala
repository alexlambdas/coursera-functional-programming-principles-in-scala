package week1

object Module {

  /**
    * 
    *
    * @param x
    * @return
    */
  def square(x: Double): Double = x * x

  /**
    * 
    *
    * @param x
    * @param y
    * @return
    */
  def sumOfSquares(x: Double, y: Double): Double = square(x) + square(y)

  /**
    * 
    *
    * @param x
    * @return
    */
  def abs(x: Double): Double = if(x < 0) then -x else x

  /**
    * 
    *
    * @param guess
    * @param x
    * @return
    */
  def isGoodEnough(guess: Double, x: Double): Boolean = 
    abs(guess * guess - x) < 0.001

    /**
      * 
      *
      * @param guess
      * @param x
      * @return
      */
  def improve(guess: Double, x: Double): Double = (guess + x / guess) / 2

  /**
    * 
    *
    * @param guess
    * @param x
    * @return
    */
  def sqrIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) then guess
    else sqrIter(improve(guess, x), x)

  /**
    * 
    *
    * @param x
    * @return
    */
  def sqrt(x: Double): Double = sqrIter(1.0, x)

}