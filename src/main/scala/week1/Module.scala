package week1

object Module {

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
  def sqrt(x: Double): Double =

    /**
      * 
      *
      * @param guess
      * @param x
      * @return
      */
    def sqrIter(guess: Double): Double =
      if (isGoodEnough(guess)) then guess
      else sqrIter(improve(guess))

    /**
      * 
      *
      * @param guess
      * @param x
      * @return
      */
    def isGoodEnough(guess: Double): Boolean = 
      abs(guess * guess - x) < 0.00001

    /**
      * 
      *
      * @param guess
      * @param x
      * @return
      */
    def improve(guess: Double): Double = (guess + x / guess) / 2

    sqrIter(1.0)

}