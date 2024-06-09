package Task1.Data

import Task1.Domain.Models.Employee

class EmployeeReposytory
{

    var i:Int =0
    var employee = Employee(
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null)


    var listEmployee = mutableSetOf<Employee>()


    fun printList() {
        println("показать всё")
        println("""
            ---------------------------------------------------------------------------------------------------------------------------------------
            | Фамилия         | Имя             | Отчество        | Должность       | Отдел           | Ссылка на фото  | Дата род.  | Дата начала|
            ---------------------------------------------------------------------------------------------------------------------------------------
        """.trimIndent())


        for (item in listEmployee)
            item.showAll()

        println("---------------------------------------------------------------------------------------------------------------------------------------")
    }

}
