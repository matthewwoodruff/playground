val test = new Complex(1.0, 2.0)

test.im()

test + "asd"

def myIntegerFunc():Int = 4 * 2
test myFunct(x => x * x)
test myFunctionality((x: Int) => x * x, 5, 6)

test myOtherFunc myIntegerFunc
test myFunct((x: Int) => x + x)
test myOtherFuncExplicit(() => 4)

def funky(x: Int): Int = x*x

var x = test.sum(x => x * x * x)(3, 6)

test.currying(x => x.toInt)(2.99,3.01)

test.moreCurrying(x => x.toCharArray)("sdf")

test.product(x => x)(1, 3)

test.factorial(4)

test.sum(x => x)(1, 4)

def plus(a: Int, b: Int): Int =
 a + b

def multiply(a: Int, b: Int): Int =
 a*b

test.mapReduce(x => x, multiply, 1)(1, 3)

s"${test}"

var i = 1

while (i < 10) {
 println(i)
 i+=1
}
val a: List[Int] = List(1,2)
a.foreach(x => println(x))
a.foreach(println)
for(arg <- a)
 println(arg)
for(a <- 0 to 2)
 println(a)
val b = List(3,4)
val c = a ::: b
a :: b
println(a)
val myMap = Map(2 -> "sfs", (4, "sdf"))
4 -> "sdf"
"dfg" -> 5 -> 5
Complex.process(1)
val hexy = 0x5
// octals removed from later versions of scala
// val octy = 077
val bitShiftyLeft = (1 << 2) == 4
val bitShiftyRight = (4 >> 2) == 1
val multiLineString =
  """hahah
    |another line
    |one more
    |and the last
    |use bars and strip margin
    |intellij inserts this automatically
  """.stripMargin
// Object Comparison
// content comparison by default - not reference comparison
List(1,2,3) == List(1,2,3)
"mystring" == 1 -> "myString"
1.until(2)
//1 ne 2
List(2,3) ::: List(3,4)
val newClass = new NewClass()
val ratio = new Rational(1, 2)
new Rational(1,2) + new Rational(1,2)
new Rational(1,2) + new Rational(2,3)
new Rational(66,42)

Rational.build(1,2)

'hello == "hello"
val output = if (true) "true" else "false"
// nested
val outer = List(List(4,5,6),List(7,8,9),List(10,11,12))
for(i <- outer; a = i; j <- i)
  print(j)
for{i <- outer
    a = i
    j <- i}
  print(j)
// filtering odds numbers greater than 4
val filteredNumbers =
  for{a <- 1 to 10 if a % 2 != 0 if a > 4} yield a
ratio.exceptional(3)

try {
  ratio.exceptional(-1)
} catch {
  case ex: RuntimeException => {
    println("firstly")
  }
} finally {
  println("lastly")
}

test.testMatch("ha")
test.testMatch("ho")
test.testMatch("wut?")
// Scope
val scope = 2
val y = {
  val scope = 3
}

test.yieldTest(List(1,2,3))

val funky = (x: Int) => x
def funky2(x: Int, y: Int => Int): Int = y(x)

val funcLit = (x: Int) => {
  println("here")
  x + 1
}: Int
funcLit(9)

List(1,2,3).filter(x => x > 0)