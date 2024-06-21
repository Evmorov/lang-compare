try {
  throw Exception("An error!")
} catch (e: Exception) {
  println(e.message)
}