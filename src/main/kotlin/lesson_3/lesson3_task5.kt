package lesson_3

fun main() {
    var stepInfo: String = "D2-D4;0"
    var positionStart: String
    var positionEnd: String
    var stepNumber: Int

    positionStart = stepInfo.substring(0, 2)
    positionEnd = stepInfo.substring(3, 5)
    stepNumber = stepInfo.substringAfterLast(';').toInt()
    println(positionStart)
    println(positionEnd)
    println(stepNumber)
}