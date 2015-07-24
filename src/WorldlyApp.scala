

/**
 * @author peter
 * 
C:\Users\peter\workspace\scala\hello\src>scalac WorldlyApp.scala WorldlyGreeter.
scala

C:\Users\peter\workspace\scala\hello\src>scala WorldlyApp
Hello you.., worldy!

cmd exempel:
//stå i mappen där det ska kompileras
d:
cd d:\code\WorldlyApp\compiled
//kompilera skapar class filerna:
scalac D:\code\WorldlyApp\WorldlyApp.scala D:\code\WorldlyApp\WorldlyGreeter.scala
//exekvera
scala WorldlyApp
 */
object WorldlyApp {
  def main(args: Array[String]) {
    val wg = new WorldlyGreeter("Hello you..")
    wg.greet()
  }
}