

/**
 * @author peter
 */
object classGreeter extends App {
    class SimpleGreeter {
      val greeting = "Hello world!"
      def greet() = println(greeting)
    }
    class FancyGreeter(greeting: String){
      def greet() = println(greeting)      
    }
  val g = new SimpleGreeter
  g.greet()
  val fg = new FancyGreeter("Salut the world")
  fg.greet()
}

