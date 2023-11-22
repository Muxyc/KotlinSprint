package lesson_4

const val TABLES_TOTAL = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println("Доступность столиков на сегодня:" + (if (tablesBookedToday < TABLES_TOTAL) true else false))
    println("Доступность столиков на завтра:" + (if (tablesBookedTomorrow < TABLES_TOTAL) true else false))
}