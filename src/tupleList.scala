

/**
 * @author peter
 */
object tupleList extends App {
  val oneTwoThree = List(1,2,3)
  println(oneTwoThree)
  val oneTwo = List(1,2)
  val threeFour = List(3,4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  val slist = oneTwoThreeFour
  println(oneTwoThreeFour)
  //oneTwo(1) = -1
  println(oneTwo)
  print(threeFour.drop(1))
  println(threeFour)
  println(oneTwoThreeFour.exists(x => x == 3))
  println(oneTwoThreeFour.filter(x => x <= 3))
  println(slist.map(x => x * 3))
  //map skulle kunna användas vid regression
  println(slist.map(x => 0.023 + 2.7 * x ))
  println(slist.sortWith((s,t) => t > s))
  println(slist.sortWith((s,t) => s > t))
  //tuplets can contain different types
  val triplet = (99, "Test", List(1,2))
  println(triplet._1)
  println(triplet._2)
  println(triplet._3)
  
 
}