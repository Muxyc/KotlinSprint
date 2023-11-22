package lesson_4

fun main() {
    val shipDamage: Boolean = readLineBool("наличие повреждений корпуса (true/false):")
    val shipCrew: Int = readLineInt("текущий состав экипажа, человек:")
    val shipFood: Int = readLineInt("количество ящиков с провизией на борту, ящиков:")
    val weather: Boolean = readLineBool("благоприятность метеоусловий (true/false):")

    println(
        "Научно-исследовательский корабль  может приступить к долгосрочному плаванию?:" +
                "${(!shipDamage && shipCrew in 55..70 && shipFood > 50) or (shipCrew == 70 && shipFood >= 50 && weather)}"
    )
}

fun readLineBool(text: String): Boolean {
    while (true) {
        print(text)
        when (readLine()) {
            "true", "t" -> return true
            "false", "f" -> return false
        }
        println("Введено не корректное значение")
    }
}

fun readLineInt(text: String): Int {
    var readInt: Int?
    while (true) {
        print(text)
        readInt = readLine()?.toIntOrNull()
        if (readInt is Int) return readInt
        println("Введено не корректное значение")
    }
}