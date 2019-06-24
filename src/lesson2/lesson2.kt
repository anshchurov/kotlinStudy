package lesson2

val set = hashSetOf(1, 7, 33)
val list = arrayListOf(1, 5, 2, 1)
val map = hashMapOf(1 to "one", 2.to("two"), Pair(3, "three"))

fun main(args: Array<String>) {
    println("last = ${list.last()}")
    println("list = $list")
    println("max = ${list.max()}")
    println("max = ${set.max()}")
    println("min = ${list.min()}")


    val view : View = Button()
    view.showOff()

    println("last char".lastChar1)
//    println("last char".lastChar1("d"))//????????????????????????????????????????????????????????????


    val argsList = listOf("args", *args) // -> "args", args(0)(0), ... , args(0)(n), ... , args(n)(0), ... , args(m)(n)
}


//fun String.getLastChar():Char{
//    return get(length - 1)
////    return this.get(this.length - 1)
//}

fun String.getLastChar() = get(length - 1)

fun <T> Collection<T>.JoinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}
// функции расширения не переопределяются (принадлежат классу (как static)):
fun View.showOff() = println("view")
fun Button.showOff() = println("button")


// сделать поле:
val String.lastChar1: Char
    get() = get(length - 1)

var StringBuilder.lastChar1: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

//infix fun String.lastChar2() = get(length - 1)