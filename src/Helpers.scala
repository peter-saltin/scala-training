

/**
 * @author peter
 */
object Helpers {
  //kom tillbaka till detta när du har mer förståelse för f: => A
  implicit class IntWithTimes(x: Int) {
    /* http://stackoverflow.com/questions/6951895/what-does-and-mean-in-scala
     * In the type declaration for a method or function parameter, 
     * with no symbol on the left hand side (e.g. def f(param: => T))
     *  it's a "by-name parameter", meaning that is evaluated every time 
     *  it's used within the body of the function, and not before.
     *   Ordinary "by-value" parameters are evaluated before entry into the function/method.
     * 
     */
    def times[A] (function: => A): Unit = {
      def loop(current: Int): Unit = 
        if(current > 0){
          function
          loop(current - 1)
        }
      loop(x)
    }
    
  }
  
  implicit class absolutKlass(val i: Int) {
    def AbSum( j: Int): 
      Int = 
         if ( i<0 ) ( (-1)*i + (
                      if (j<0) (-1)*j 
                      else j
                    )
              ) 
         else i + (
             if (j<0) (-1)*j 
             else j
             )
  }
  /*
  implicit class IntExtension212(val i: Int) { 
     def ☯(j: Int): Int = i % j
  }*/
}