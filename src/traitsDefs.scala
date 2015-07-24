

/**
 * @author peter
 */
trait Friendly {
  def greet(): String = {
    return "Hi"
  }  
}

class Dog extends Friendly {
  override def greet(): String = {
    return "Woof"
  }
}
