package lesson_2

fun main() {
    val paydayPermanentWorkers: Int = 50*30000
    val paydayWorkers: Int = paydayPermanentWorkers+30*20000
    val paydayAverage: Int = paydayWorkers/(50+30)

    println("Расходы на выплату зарплаты постоянных сотрудников: $paydayPermanentWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $paydayWorkers")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $paydayAverage")

}