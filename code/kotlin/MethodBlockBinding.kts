class Action {
  companion object {
    private var name: String = "Ann"
    fun say(sentence: () -> String) {
      println(sentence())
    }
  }
}

class Person(private val name: String) {
  fun greet() {
    Action.say { "My name is $name!" }
  }
}

Person("Alex").greet()
