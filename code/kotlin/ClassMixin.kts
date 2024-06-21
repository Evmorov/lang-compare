interface Moving {
  fun walk() {
    println("${this::class.simpleName} is walking")
  }
}

interface Interacting {
  fun talk() {
    println("${this::class.simpleName} is talking")
  }
}

class Human : Moving, Interacting

val human = Human()
human.walk()
human.talk()
