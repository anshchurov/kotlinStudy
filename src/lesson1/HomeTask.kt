package lesson1

import kotlin.math.ceil

fun main(args: Array<String>) {
    val num = 7
    for (i in 1..91) {
        getFloorAndEntrance(i)
    }
}

// расширить для варианта с 2мя квартирами на 1ом этаже
fun getFloorAndEntrance(num: Int): Pair<Int, Int>? {
    val floor = 5
    val entrance = 6
    val flat = 3
    if (checkFlatBorder(num, flat, floor, entrance)) {
        println("Квартир только ${flat * floor * entrance}")
        return null
    }
    val currentEntrance = ceil(num / (flat * floor).toDouble()).toInt()
    val currentFloor = if (num % (flat * floor) != 0) ceil((num % (flat * floor)) / (flat.toDouble())).toInt() else floor

    print("Квартира $num : Подъезд: $currentEntrance; ")
    println("Этаж: $currentFloor")

    return Pair(currentFloor, currentEntrance)
}

fun checkFlatBorder(num: Int, floor: Int, entrance: Int, flat: Int): Boolean {
    if (num < 1 && num > flat * floor * entrance) {
        println("Квартир только ${flat * floor * entrance}")
        return false
    } else
        return true
}