class Animal {
  fun eat(food: String) {
    if (meat(food)) println("Om nom nom")
  }

  private fun meat(food: String) = food == "meat"
}

Animal().eat("meat")
