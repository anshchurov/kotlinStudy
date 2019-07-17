package lesson1

import java.io.File

fun main(args: Array<String>) {

    var listEmployee = readEmployee("C:\\Users\\user\\Desktop\\Kotlin study\\src\\lesson1\\resources\\file")
    var finded = findByName("nam11", listEmployee!!)[0].lastName //TODO checking null
    print(finded)
}

//fun readEmployee(filePath: String): List<Employee>
//    = File(filePath).forEachLine { Employee(it.split(";")[0], it.split(";")[1], it.split(";")[2]) }

fun readEmployee(filePath: String): List<Employee>? {
    val lines = File(filePath).useLines { it.toList() }
    var res = mutableListOf<Employee>()
    for (str in lines){
        res.add(Employee(str.split(";")[0], str.split(";")[1], str.split(";")[2]))
    }
    return res.toList()
}

class Employee(
        val name: String,
        val lastName: String,
        var phone: String

)

fun findByName(name: String, listEmployee: List<Employee>?): List<Employee> {
    if (listEmployee == null) throw NullPointerException("wtf")
    return listEmployee.filter{ it.name == name}
}
