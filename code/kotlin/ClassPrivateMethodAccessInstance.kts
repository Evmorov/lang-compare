class Animal(private val name: String) {
  init {
    greet()
  }

  private fun greet() {
    println("Hello! My name is $name")
  }
}

Animal("Kelya")
