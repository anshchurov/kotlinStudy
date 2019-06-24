package asdf.les1

import java.util.*

//like in old java
fun main(args: Array<String>){
    val m = max(3, 5)
    println("max = $m")
    var a = 3
    val b = 5
    println("min = ${if (a > b) b else a}")

    val p = Person("name", true)
    println("${p.name} and married ${p.isMarried}")

    val r = Rectangle(3, 5)
    println(r.isSquare)
    val random = Random()
    val r1 = Rectangle1(random.nextInt(), random.nextInt())
    println(r1.isSquare)


}


fun randomRectangle(): Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun max(a: Int, b: Int):Int{
    return if (a > b) a else b
}

class Person(
        val name: String,
        var isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get () {
            return height == width
        }
}
class Rectangle1(val height: Int, val width: Int){
    val isSquare: Boolean
        get () = height == width
}