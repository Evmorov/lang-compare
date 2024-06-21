open class Animal {
  fun walk() {
    println("I'm walking")
  }
}

class Dog : Animal() {
  fun sing() {
    println("Bark!")
  }
}

Dog().walk()
