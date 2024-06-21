class Animal {
    fun walk() {
        println("I'm walking")
    }
}

val animal = Animal()
println(animal::walk is Function0<*>)