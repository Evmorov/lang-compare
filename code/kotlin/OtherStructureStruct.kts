data class Customer(val name: String, val address: String) {
  fun greeting() = "Hello $name!"
}
println(Customer("Dave", "123 Main").greeting())
