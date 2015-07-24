

/**
 * @author peter
 */
object WorldlyGreeterObxj extends App{
  class WorldlyGreeter(greeting: String){
    def greet() = {
      val worldlyGreeting = WorldlyGreeter.worldify(greeting)
      println(worldlyGreeting)
    }
  }  
  object WorldlyGreeter {
    def worldify(s: String)  = s + ", worldy!"
  }
  val wg = new WorldlyGreeter("Hello")
  wg.greet()  
}