class Animal {
  fun walk() {
    println("I'm walking")
  }
}

val animal = Animal()
println(animal::class.java.getMethod("walk") != null)
