import java.net.{MalformedURLException, URL}

/**
 * Created by mwoodruf on 24/04/15.
 */
class Complex(real: Double, imaginary: Double) {

  // block
  { var a: String = "a"}

  def re():Double = real
  def im() = imaginary

  def currying(f: Double => Int)(a: Double, b: Double): Int = {
    return f(a) + f(b)
  }


  def myFunct(func: Int => Int): Int = func(4);
  def myFunctionality(func: Int => Int, x: Int, y: Int): Int = func(x);

  def myFunct2args(func: (Int, Int) => Int): Int = 4
  def myOtherFunc(abc: => Int): Int = 4
  def myOtherFuncExplicit(abc: () => Int): Int = 4

  // Second argument is pass by name
  // value isn't evaluated before calling the function
  def evaluatorTest(one: Int, two: => Int): Int = one

  def sumLong(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if(a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }

  def greet():Unit = {
  }

  def +(arg: String): String = arg + "-rawr"

  def factorial(n: Int): Int = product(x => x)(1, n)

  def productOld(f: Int => Int)(a: Int, b: Int): Int = {
    if(a > b) 1 else f(a) * product(f)(a + 1, b)
  }

  def product(f: Int => Int)(a: Int, b: Int): Int =
    mapReduce(f, ((x, y) => x * y), 1)(a, b)


  def sumOld(f: Int => Int)(a: Int, b: Int): Int = {
    if(a > b) 0 else f(a) + sum(f)(a + 1, b)
  }

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    mapReduce(f, ((x, y) => x + y), 0)(a, b)
  }

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if(a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a +1, b))


  def iterator(f: (Int, Int) => Int)(a: Int, b: Int): Int = {
    f(a, b)
  }

  var haha:String = "sss"

  def moreCurrying(f: String => Array[Char])(a: String): String = {
    "hello"
  }


  override def toString():String = {
    return "Real: " + real + ", Imaginary: " + imaginary
  }

  def > (other: Complex): Boolean = {
    true
  }

  def myFunction(name: String):String = {
    "dd"
  }

  def urlFor(path: String): URL = {
    try {
      new URL(path)
    } catch {
      case ex: MalformedURLException =>
        new URL("http://www.scala-lang.net")
    }
  }

  def yieldTest(intList: List[Int]): List[String] = {
    for(i <- intList) yield (i + 1).toString
  }

  def testMatch(tested: String) = {
    def embeddedFunc(x: Int): Int = x

    val a = embeddedFunc(3)

    tested match {
      case "ha" => println("laugh")
      case "ho" => println("ho ho")
      case _ => println("default")
    }
  }

}

object Complex {

  def process(a: Int): Int = {
    1
  }

  def main(args: Array[String]) {
    println("i'm running")
  }

}

class NewClass {
  println("executed on construction")
}

class NewOtherClass {
}