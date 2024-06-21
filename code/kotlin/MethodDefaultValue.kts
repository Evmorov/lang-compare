fun send(abroad: Boolean = false) {
  println(if (abroad) "Send abroad" else "Send locally")
}
send()
send(true)