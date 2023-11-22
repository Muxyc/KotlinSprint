package lesson_4

const val averageMinWt = 35
const val averageMaxWt = 100
const val averageMaxVolume = 100

fun main() {
    var cargoWt = 20
    var cargoVolume = 80

    println(
        "Груз весом $cargoWt кг и объемом $cargoVolume л соответствует категории 'Average':" +
                "${cargoWt > averageMinWt && cargoWt <= averageMaxWt && cargoVolume < averageMaxVolume}"
    )
    cargoWt = 50
    cargoVolume = 100
    println(
        "Груз весом $cargoWt кг и объемом $cargoVolume л соответствует категории 'Average':" +
                "${cargoWt > averageMinWt && cargoWt <= averageMaxWt && cargoVolume < averageMaxVolume}"
    )
}