package lesson1

import asdf.les1.randomRectangle

fun main(args: Array<String>){
    println(randomRectangle().isSquare)

    println(Color.BLUE.rgb())
    val a = 5
    when(a){
        15 -> println("1-5")
        6 -> println("6")
    }
}

enum class ColorSimple {
    RED, WHITE, BLACK
}

enum class Color(
        val r: Int, val g: Int, val b: Int
){
    RED(255, 0, 0), ORANGE(255, 165, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

