

/**
 * @author peter
 */
object SetsMaps extends App{
  import scala.collection.mutable.HashMap
  import scala.collection.mutable.HashSet
  val treasureMap = new HashMap[Int, String]
  treasureMap += 1 -> "go to island"
  treasureMap += 3 -> "Find big X on ground"
  treasureMap += 4 -> "Dig"
  println(treasureMap(3))
  val kartaXY = new HashMap[String, List[Int]]
  kartaXY += "Sundsvall" -> List(2,3)
  println(kartaXY("Sundsvall"))
  val jetSet = new HashSet[String]
  jetSet += "Lear"
  jetSet += ("Boeing", "Airbus")
  println(jetSet.contains("Cessna"))
  println(jetSet)
  val romanNumeral = Map( 1 -> "I", 2-> "II", 3->"III", 4->"IV", 5-> "V")
  println(romanNumeral(4))
}