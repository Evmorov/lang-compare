class Animal {
  fun walk() {
    bark()
    guard()
    println("I'm walking")
  }

  private fun bark() {
    println("Wuf!")
  }

  private fun guard() {
    println("WUUUF!")
  }
}

Animal().walk()
