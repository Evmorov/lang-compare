val foo: Any = "Hello!"
when (foo) {
  in 1..5 -> println("It's between 1 and 5")
  10, 20 -> println("10 or 20")
  "And" -> println("case in one line")
  is String -> println("You passed a string '$foo'")
  else -> println("You gave me '$foo'")
}