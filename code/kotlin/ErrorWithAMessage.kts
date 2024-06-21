try {
  println(1 / 0)
} catch (e: Exception) {
  println(e.message)
}