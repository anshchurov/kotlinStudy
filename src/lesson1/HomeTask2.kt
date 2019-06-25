package lesson1

import jdk.nashorn.internal.objects.NativeArray.forEach
import java.io.File

fun main(args: Array<String>) {

    var listEmployee = readEmployee("C:\\Users\\Dron4yes\\Desktop\\Kotlin study\\src\\lesson1\\resources\\file")
    var finded = findByName("nam11", listEmployee!!)[0].lasyName //TODO checking null
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
    val lasyName: String,
    var phone: String

)

fun findByName(name: String, listEmployee: List<Employee>): List<Employee> {
    return listEmployee.filter{ it.name == name}
}
