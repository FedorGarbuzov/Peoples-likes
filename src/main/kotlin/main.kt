fun main() {
    val likes = "111"
    val last = Character.getNumericValue(likes.last())
    val penultimate = likes.dropLast(1)
    val penultimateNum = if (!penultimate.isEmpty()) Character.getNumericValue(penultimate.last()) else 0

    val result = if (last == 1 && penultimateNum != 1) "человеку" else "людям"
    println("Публикация понравилась: $likes $result")
}