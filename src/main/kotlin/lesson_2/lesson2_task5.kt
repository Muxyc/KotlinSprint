package lesson_2

import kotlin.math.pow

fun main() {
    val amountInitial: Double = 70000.0
    val amountFinal: Double
    val interestRate: Double = 16.7
    val termOfInvestment: Double = 20.0

    amountFinal = amountInitial * (1 + interestRate / 100).pow(termOfInvestment)
    println(String.format("%.3f", amountFinal))
}