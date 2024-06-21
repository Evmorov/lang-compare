class Animal(private val name: String) {
  fun walk() {
    println("My name is $name and I'm walking")
  }
}

Animal("Kelya").walk()
