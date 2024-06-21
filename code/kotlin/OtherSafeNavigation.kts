class Winner {
  val address: Address? = null
}

class Address {
  val zipcode: Int = 192187
}

val winner = Winner()
val zip = winner.address?.zipcode
println(zip?.let { "Zipcode is $it" } ?: "No prize without zipcode")
