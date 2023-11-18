package lesson_2

const val hoursPerDay = 24
const val minutesPerHour = 60
fun main() {
    val trainDepartureHour: Int = 9
    val trainDepartureMinute: Int = 39
    val trainDeparture: Int = trainDepartureHour * minutesPerHour + trainDepartureMinute
    val trainTravelMinute: Int = 457
    val trainComing: Int = trainDeparture + trainTravelMinute
    val trainComingHour: Int =
        if (trainComing / minutesPerHour < hoursPerDay) trainComing / minutesPerHour else trainComing / minutesPerHour - hoursPerDay
    val trainComingMinute: Int = trainComing % minutesPerHour

    println("$trainComingHour:$trainComingMinute")

}