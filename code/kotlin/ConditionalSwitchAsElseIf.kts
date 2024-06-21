val score = 76
val grade = when {
score < 60 -> 'F'
score < 70 -> 'D'
score < 80 -> 'C'
score < 90 -> 'B'
else -> 'A'
}
println(grade)
