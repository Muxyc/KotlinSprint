package lesson_2
const val HOURS_PER_DAY = 24
const val MINUTES_PER_HOUR = 60

fun main() {
    val trainDepartureHour: Int = 9
    val trainDepartureMinute: Int = 39
    val trainDeparture: Int = trainDepartureHour * MINUTES_PER_HOUR + trainDepartureMinute
    val trainTravelMinute: Int = 457
    val trainComing: Int = trainDeparture + trainTravelMinute
    val trainComingHour: Int =
        if (trainComing / MINUTES_PER_HOUR < HOURS_PER_DAY) trainComing / MINUTES_PER_HOUR else trainComing / MINUTES_PER_HOUR - HOURS_PER_DAY
    val trainComingMinute: Int = trainComing % MINUTES_PER_HOUR

    println("$trainComingHour:$trainComingMinute")

}