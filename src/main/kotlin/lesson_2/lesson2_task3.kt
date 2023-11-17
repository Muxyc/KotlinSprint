package lesson_2

fun main() {
    val trainDepartureHour: Int = 9
    val trainDepartureMinute: Int = 39
    val trainDeparture: Int = trainDepartureHour * 60 + trainDepartureMinute
    val trainTravelMinute: Int = 457
    val trainComing: Int = trainDeparture + trainTravelMinute
    val trainComingHour: Int = if (trainComing / 60 < 24) trainComing / 60 else trainComing / 60 -24
    val trainComingMinute: Int = trainComing % 60

    println("$trainComingHour:$trainComingMinute")

}