

/**
 * @author peter
 */
object traitsApp {
  def main(args: Array[String]) {
    var pet: Friendly = new Dog
    println(pet.greet())
    
    var peta: FriendlyExt  = new DogExt
    println(peta.greet())
    
    peta = new HungryCat
    println(peta.greet())
    
    peta = new HungryCat with ExclamatoryGreeter
    println(peta.greet())    
    
    peta = new HungryDog
    println(peta.greet())
    

    
    
  }
}