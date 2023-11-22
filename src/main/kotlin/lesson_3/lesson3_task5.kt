package lesson_3

fun main() {
    var stepInfo: String = "D2-D4;0"
    var stepInfoList: List<String> = stepInfo.split('-', ';')

    for (i in stepInfoList) println(i)
}