package lesson_1

fun main(){
    val seconds: Int = 6480
    val hour: Int
    val minutes: Int
    val secondsRemainder: Int

    hour=seconds/3600
    minutes=(seconds-3600*hour)/60
    secondsRemainder=(seconds-3600*hour-60*minutes)/60

    if (hour < 10) print("0$hour:") else print("$hour:")
    if (minutes < 10) print("0$minutes:") else print("$minutes:")
    if (secondsRemainder < 10) println("0$secondsRemainder") else println("$secondsRemainder")

}