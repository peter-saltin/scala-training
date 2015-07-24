

/**
 * @author peter
 */
object foreacher extends App {
  val argsx = Array("hej" , "på", "dej") 
  argsx.foreach(arg => print(arg + " "))
  argsx.foreach((arg: String) => print(arg))
  println("|")
  argsx.foreach(print)
  println("|")
  //testa for
  for (arg <- argsx)
    println(arg)
    
}