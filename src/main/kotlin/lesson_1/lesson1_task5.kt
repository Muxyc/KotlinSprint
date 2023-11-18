package lesson_1

fun main() {
    val seconds: Int = 6480
    val hour: Int
    val minutes: Int
    val secondsRemainder: Int

    hour = seconds / 3600
    minutes = (seconds % 3600) / 60
    secondsRemainder = (seconds % 3600) % 60
    println(
        String.format("%02d", hour) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d",secondsRemainder)
    )


}