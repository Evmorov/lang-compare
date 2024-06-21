class Animal {
  private var toy: String? = null

  fun take(toy: String) {
    this.toy = toy
  }

  fun play() {
    println("I'm playing with $toy")
  }
}

val animal = Animal()
animal.take("a ball")
animal.play()