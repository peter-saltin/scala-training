

/**
 * @author peter
 */
object classCarefullGreeter extends App{
  class CarefulGreeter(greeting: String){
    if (greeting == null) {
      throw new NullPointerException("Greeting was null")
    }
    def greeter() =         println(greeting)
    
  }
 val g = new CarefulGreeter(null)
 g.greeter()
}