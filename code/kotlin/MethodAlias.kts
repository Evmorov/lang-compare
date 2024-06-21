class Greetings {
  fun hey() {
    println("How are you?")
  }
}

val greetings = Greetings()
greetings.hey().also { greetings::hey }
