package lesson_4

const val TABLES_TOTAL = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println("Доступность столиков на сегодня:${tablesBookedToday < TABLES_TOTAL}")
    println("Доступность столиков на завтра:${tablesBookedTomorrow < TABLES_TOTAL}")
}