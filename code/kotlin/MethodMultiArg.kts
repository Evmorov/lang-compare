fun sweets(buy: Boolean, vararg brands: String) {
  if (buy) println(brands.joinToString(" "))
}
sweets(true, "snickers", "twix", "bounty")