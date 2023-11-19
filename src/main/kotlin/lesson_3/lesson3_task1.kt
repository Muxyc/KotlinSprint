package lesson_3

fun main() {
    val userName: String = "Михаил"
    var greetings: String = "Доброе утро, $userName!"

    println(greetings)
    greetings = "Добрый вечер, $userName!"
    println(greetings)
}