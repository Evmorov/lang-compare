fun <T> mySelect(arr: List<T>, predicate: (T) -> Boolean): List<T> {
  val selected = mutableListOf<T>()
  for (a in arr) {
    if (predicate(a)) {
      selected.add(a)
    }
  }
  return selected
}
println(mySelect(listOf(1, 5, 10)) { it < 6 })