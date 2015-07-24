

/**
 * @author peter
 */
trait FriendlyExt {
  def greet(): String = {
    return "Hi"
  }
}
class DogExt extends FriendlyExt {
  override def greet(): String = {
    return "Wooof"
  }
}

class HungryCat extends FriendlyExt {
  override def greet() = "Meow"
}

class HungryDog extends DogExt {
  override def greet() = "I'd like to eat my own dog food"
}

trait ExclamatoryGreeter extends FriendlyExt {
  override def greet() = super.greet() + "!"
}


