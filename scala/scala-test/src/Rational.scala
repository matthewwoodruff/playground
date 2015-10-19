/**
 * Created by mwoodruf on 29/04/15.
 */
class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0)
  private val g = gcd(numerator.abs, denominator.abs)
  private val numer = numerator / g
  private val denom = denominator / g
  override def toString() = s"${numer}/${denom}"

  def this(numerator: Int) = this(numerator, 1)

  def +(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  private def gcd(a: Int, b: Int): Int =
    if (b==0) a else gcd(b, a % b)

  def exceptional(arg: Int): Int = {
    if (arg > 0) arg else throw new RuntimeException("arrgg")
  }

}

object Rational {

  def build(numerator: Int, denominator: Int): Rational = new Rational(numerator, denominator)

}
