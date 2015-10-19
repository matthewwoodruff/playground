/**
 * Created by mwoodruf on 21/04/15.
 */
class HelloWorld {

  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  // functions are objects
  def timeFlies() {
    println("time flies like an arrow...")
  }

  def greeting(message: String): String = {
    return message
  }

  var mine: String = ""

  def myMethod(): Unit = {

  }

  def main(args: Array[String]) {
    println("hello")
    val world = new HelloWorld
    println(world greeting "ddd")
    println(1.toString)

    println(1 equals 2)

    //    oncePerSecond(timeFlies)
    oncePerSecond(() =>
      println("hello"))
  }



}



object sss {

  type Environment = String => Int
  var asd = () => (Int, Int)

  def main(args: Array[String]) {

//    asd = () => { return (4,4)x}

    println("hello")

    val com = new Complex(1.0, 3.0)
//    var com = new Complex(2.0)

    com.haha = "dd"

    println(com.re)

    val number: Double = com.im

    println(com toString)
    com.>(com)

    val myVar = Var
    val myVar2 = Var

    println(myVar == myVar2)

    val myClass = MyCaseClass(1.0)

    println(myClass > MyCaseClass(2.0))

    com myFunction {
      "fff"
    }

    var yahar: String = {
      val other: String = "dd"
      other + "ddff"
    }

    {
      val other: String = "dd"
      other + "ddff"
    }
  }

  def functionality(mine: () => String): String = {
    "ddd"
  }

  def myFunction(name: String):String = {
    "dd"
  }

}




abstract class Tree

class Sum(r: Tree, l: Tree) extends Tree

case class Var(r: Tree, l: Tree) extends Tree

case class MyCaseClass(num: Double) {

  def >(that: MyCaseClass):Boolean = {
    true
  }

}