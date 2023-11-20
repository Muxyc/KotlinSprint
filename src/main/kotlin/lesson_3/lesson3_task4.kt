package lesson_3

fun main() {
    var positionStart: String = "E2"
    var positionEnd: String = "E4"
    var stepNumber: Int = 1

    println("$positionStart-$positionEnd;$stepNumber")
    positionStart = "D2"
    positionEnd = "D3"
    stepNumber += 1
    println("$positionStart-$positionEnd;$stepNumber")
}