package lesson3

fun main(args: Array<String>){
    var x:String? = null // can be null
    var n:Int = x!!.length //
    var nn: Int? = x?.length // ? - make result == null, if s == null

    var ll: Int = x?.length ?: 0 // default value for null

    println(46.coerceIn(100, 200))

    val b: Byte = 1
    val l = b + 1L


}

fun asd(s: String?): Int{
    return s!!.length
}


fun fff(mes: String): Nothing { // pages 232-233 (из этой функции не выйти, end of program)
    throw IllegalAccessException(mes)
}