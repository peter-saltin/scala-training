

/**
 * @author peter
 */
object greetRepeatedly extends App {
  class RepeatGreeter(greeting: String, count: Int){
    //möjlig standardanrop med en parameter def:count=1
    def this(greeting: String) = this(greeting, 1)
    //möjligt standardanrop utan parameter
    def this() = this("Hej mr peters", 5)
    
    def greet() = {
      for (i <- 1 to count) { 
        println(greeting)     
      }
    }
    
  }
  val g = new RepeatGreeter("Hej peter",3)
  g.greet()
  val g2 = new RepeatGreeter()
  g2.greet()
}