package lesson_4

const val AVERAGE_MIN_WT = 35
const val AVERAGE_MAX_WT = 100
const val AVERAGE_MAX_VOLUME = 100

fun main() {
    var cargoWt = 20
    var cargoVolume = 80

    println(
        "Груз весом $cargoWt кг и объемом $cargoVolume л соответствует категории 'Average':" +
                "${cargoWt > AVERAGE_MIN_WT && cargoWt <= AVERAGE_MAX_WT && cargoVolume < AVERAGE_MAX_VOLUME}"
    )
    cargoWt = 50
    cargoVolume = 100
    println(
        "Груз весом $cargoWt кг и объемом $cargoVolume л соответствует категории 'Average':" +
                "${cargoWt > AVERAGE_MIN_WT && cargoWt <= AVERAGE_MAX_WT && cargoVolume < AVERAGE_MAX_VOLUME}"
    )
}