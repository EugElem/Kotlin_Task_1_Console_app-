package Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class AddEmployee(
    lastName:String? =null,
    firstName: String? =null,
    patronymic:String? =null,
    position: String? =null,
    department: String? =null,
    urlPhoto: String? =null,
    birthDate: String? =null,
    startDate: String? =null,
    )
    : Employee(
    lastName,
    firstName,
    patronymic,
    position,
    department,
    urlPhoto,
    birthDate,
    startDate,) {




    /*override fun showAll(){
        var i:Int=1

        println("""
            --------------------------------------------------------------------------------------------------------------
            |Фамилия         |Имя             |Отчество        |Дата род.  |Должность       |Ссылка на фото  |Дата начала|
             ${lastName}      $firstName       $patronymic      $birthDate  $department      $position        $startDate
        """.trimIndent())

    }*/
    //Сообщить, что ввести пользователю
    //Получить введеннные данные

    //Сохранить


    // Сохранение (добавление в Лист)
    fun addNewEmployee(listEmployee: EmployeeReposytory) {
        var employee:Employee = Employee(
            lastName,
            firstName,
            patronymic,
            position,
            department,
            urlPhoto,
            birthDate,
            startDate,
            )


        listEmployee.listEmployee.add(employee)
        listEmployee.printList()
    }

    // вызов фушкций получения от пользователя параметров гового сотрудника
    fun getParametresNewEmployee(){
        getLastName()
        getFirstName()
        getРatronymic()
        getBirthDate()
        getPosition()
        getDepartment()
        getUrlPhoto()
        getStartDate()
    }


    fun getLastName(){
        print("Введите фамилию: ")
        lastName = readln()
        lastName +=" ".repeat(15-lastName!!.length)
    }

    fun getFirstName(){
        print("Введите имя: ")
        firstName = readln()
        firstName +=" ".repeat(15-firstName!!.length)
    }

    fun getРatronymic(){
        print("Введите отчество, при наличии: ")
        patronymic = readln()
        patronymic +=" ".repeat(15-patronymic!!.length)

    }

    fun getBirthDate(){
        print("Введите дату рождения: ")
        birthDate = readln()
        birthDate +=" ".repeat(10-birthDate!!.length)

    }

    fun getPosition(){
        print("Введите должность: ")
        position = readln()
        position +=" ".repeat(15-position!!.length)

    }

    fun getDepartment(){
        print("Введите отдел: ")
        department = readln()
        department +=" ".repeat(15-department!!.length)

    }

    fun getUrlPhoto(){
        print("Введите ссылку на фото, при наличии: ")
        urlPhoto = readln()
        urlPhoto +=" ".repeat(15-urlPhoto!!.length)
    }

    fun getStartDate(){
        print("Введите дату принятия на работу: ")
        startDate = readln()
        startDate +=" ".repeat(10-startDate!!.length)

    }
}