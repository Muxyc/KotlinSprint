package lesson_3

fun main() {
    var personLastName: String = "Андреева"
    val personFirstName: String = "Татьяна"
    val personPatronymic: String = "Сергеевна"
    var personalAeg: Int = 20

    println("$personLastName $personFirstName $personPatronymic, $personalAeg")
    personLastName = "Сидорова"
    personalAeg = 22
    println("$personLastName $personFirstName $personPatronymic, $personalAeg")
}