package week1

import scala.annotation.tailrec

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

  /**
    * 
    *
    * @param x
    * @return
    */
  def factorial(x: Int): Int =
    if(x == 0) then 1 else x*factorial(x-1)

  /**
    * 
    *
    * @param x
    * @return
    */
  def factorialTailRec(x: Int): Int =

    @tailrec
    def loop(n: Int, acct: Int): Int = 
      if(x == 0) then 1
      else if(n == x) then acct
      else loop(n+1, acct*(n+1))

    loop(1,1)

  /**
    * 
    *
    * @param c
    * @param r
    * @return
    */
  def pascal(c: Int, r: Int): Int =
    if(c == 0 || c == r) then 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
    * 
    *
    * @param c
    * @param r
    * @return
    */
  def pascalTailRec(c: Int, r: Int): Int =

    if (c > r) then -1
    else

      @tailrec
      def loop(column: Int, row: Int, acct: List[Int]): List[Int] =
        if(column == c && row == r) then 
          if(column == row) then acct.::(1)
          else if(column == 0) then acct.::(1)
          else acct.::(pascalSum(row, acct))
        else
          if(column == row) then loop(0, row+1, acct.::(1))
          else if(column == 0) then loop(column+1, row, acct.::(1))
          else loop(column+1, row, acct.::(pascalSum(row, acct)))

      def pascalSum(row: Int, pascal: List[Int]) = pascal.apply(row-1) + pascal.apply(row)

      loop(0,0,List()).head
}