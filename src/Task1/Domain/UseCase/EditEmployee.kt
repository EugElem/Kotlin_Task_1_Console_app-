package Task1.Domain.UseCase

import Task1.*
import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class EditEmployee (
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


        //Предложение изменить данные, что ввести пользователю
        //Получить введеннные данные

        //Сохранить


        fun chooseParemetrToEdit(){
            while (i !=0){
                println("""
        -----------------------------------------------------
        |   Выберите, что бы вы хотели изменить:                                            |
        |    1. Фамилия:        $lastName                   |
        |    2. Имя:            $firstName                  |
        |    3. Отчество:       $patronymic                 |
        |    4. Должность:      $position                   |
        |    5. Отдел:          $department                 |
        |    6. Ссылка на фото: $urlPhoto                   |
        |    7. Дата рождения:  $birthDate                  |
        |    8. Работает с:     $startDate                  |
        |    0. Отмена                                      |
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

        // Сохранение (добавление в Лист)
        fun addNewEmployee(listEmployee: EmployeeReposytory) {
            var employee: Employee = Employee(
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

        // вызов фушкций получения от пользователя параметров нового сотрудника
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