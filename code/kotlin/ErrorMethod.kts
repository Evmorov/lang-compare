fun divide(num1: Int, num2: Int) {
  try {
    println(num1 / num2)
  } catch (e: Exception) {
    println(e.message)
  }
}
divide(1, 0)