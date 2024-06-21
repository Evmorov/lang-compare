try {
  1 / 0
} catch (e: ArithmeticException) {
  println("Can't divide")
} finally {
  println("But that's ok")
}
