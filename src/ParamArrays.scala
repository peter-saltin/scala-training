

/**
 * @author peter
 */
object ParamArrays extends App {
  val s = new String("Hello, world!")
  println(s)
  //step8
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"
  
  for (i <- 0 to 2)
    print(greetStrings(i) + "|-|\n") 
  // 1 + 3 är samma som att skriva 1.+(3), + är en metod? funktionsanrop?
  val test = 1.+(3)
  println(test)
  def ♂(x:String): String = 
     if (x == "Han") "Man" 
       else "Kvinna" 
  print(♂("Han"))
  implicit class IntExtension2123(val i: Int) extends AnyVal { 
     def ★(j: Int): Int = i % j
  }
  println(3 ★ 2)
  println(3.★(2))
  
  implicit class IntExtension212(val i: Int) { 
     def ☯(j: Int): Int = i % j
  }
  println(4 ☯ 2)
 
}