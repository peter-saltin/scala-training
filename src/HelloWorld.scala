package hello

/**
 * @author peter
 */
/**
object HelloWorld  extends App {
    def main(args: Array[String]) {
      println("Hello World!")
    }
}*/




object HelloWorld  extends App {
  def max1(x: Int, y: Int): Int = if (x < y) y else x
  println("Hello World!")
  println(max1(1,2))
  val argsx = Array("hej" , "swej", "nej", "mej")
  var i = 0
  while ( i < argsx.length) {
    println(argsx(i))
    i += 1
  }
  i = 0
  while ( i < argsx.length) {
    print(argsx(i))
    i += 1
  }
}