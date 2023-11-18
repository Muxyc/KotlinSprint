package lesson_2

fun main() {
    val oreIron: Int = 11
    val oreCrystal: Int = 7
    val oreBuff: Int = 20
    val oreIronBonus: Int
    val oreCrystalBonus: Int

    oreIronBonus = oreIron * oreBuff / 100
    println("oreIronBonus:$oreIronBonus")
    oreCrystalBonus = oreCrystal * oreBuff / 100
    println("oreСrystalBonus:$oreCrystalBonus")
}