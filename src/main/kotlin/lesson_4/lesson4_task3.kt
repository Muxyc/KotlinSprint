package lesson_4

const val GOOD_WEATHER = "солнечная"
const val GOOD_TENT = "открыт"
const val GOOD_HUMIDITY = 20
const val NO_GOOD_SEASON = "зима"

fun main() {
    val weather: Boolean = GOOD_WEATHER == "солнечная"
    val tent: Boolean = GOOD_TENT == "открыт"
    val humidity: Int = 20
    val season: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${weather && tent && humidity == GOOD_HUMIDITY && season != NO_GOOD_SEASON}"
    )
}