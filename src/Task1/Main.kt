package Task1

import Task1.Data.EmployeeReposytory
import Task1.Domain.UseCase.AddEmployee
import Task1.Domain.UseCase.EditEmployee

var i = 100


var listEmployee = EmployeeReposytory()

fun main(){
    while (i!=0){
        println("""
        -----------------------------------------------------
        |   Меню                                            |
        |    1. Принять сотрудника                          |
        |    2. Изменить данные сотрудника                  |
        |    3. Уволить сотрудника                          |
        |    4. Рассчитать премию                           |
        |    5. Офильтровать по фамилии                     |
        |    6. Офильтровать по дате устройства на работу   |
        |    7. Офильтровать по стажу                       |
        |    8. Отфильтровать по должности                  |
        |    0. Выход из приложения                         |
        -----------------------------------------------------
            
        """.trimIndent())
        print("Введите номер пункта меню: ")
        i = readln().toInt()

        Thread.sleep(400)
        print("Ответ системы: ")
        when (i){
            1 -> addEmployee()
            2 -> updateEmployee()
            3 -> deleteEmployee()
            4 -> calculateBonus()
            5 -> filterName()
            6 -> filterStartDate()
            7 -> filterWorkExperience()
            0 -> {
                exit()
                break
            }
        }

        Thread.sleep(1000)
        println("Нажмите любую кнопку, чтобы подолжить")
        readln()
    }
}
// 1. Принять сотрудника
fun addEmployee(){
    var addEmployee = AddEmployee(listEmployee.toString())
    addEmployee.getParametresNewEmployee()
    println("Данные принятого сотрудника введены")
    Thread.sleep(1000)
    addEmployee.addNewEmployee(listEmployee)
    println("Данные принятого сотрудника сохранены")
    Thread.sleep(1000)
}

//2. Изменить данные сотрудника
fun updateEmployee(){
    var editEmployee = EditEmployee(listEmployee.toString())
    editEmployee.chooseParemetrToEdit()
    println("Данные сотрудника изменены и обновлены")
}

//3. Уволить сотрудника
fun deleteEmployee(){
    println("Данные сотрудника удалены")
}

//4. Рассчитать премию
fun calculateBonus(){
    println("Премии рассчитаны")
}

//5. Офильтровать по фамилии
fun filterName(){
    println("Фильтрация по фамилии выполнена")
}

//6. Офильтровать по дате устройства на работу
fun filterStartDate(){
    println("Фильтрация по дате устройства на работу выполнена")
}

//7. Офильтровать стажу
fun filterWorkExperience(){
    println("Фильтрация по стажу выполнена")
}

//8. Отфильтровать по должности
fun filterPosition(){
    println("Фильтрация по должности выполнена")
}

//0. Вы выполнили выход из приложения
fun exit(){
    println("Вы выполнили выход из приложения")
    Thread.sleep(1000)
}