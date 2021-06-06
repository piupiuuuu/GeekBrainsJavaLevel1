package Lesson5;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 */

public class MainApp {

    public static void main(String[] args) {
        Employee[] emp = {
                new Employee("Ivanov Ivan","Technical Director", "i.ivanov@gmail.com","89251111111",100_000,55),
                new Employee("Petrov Pavel","Commissioning engineer", "i.ivanov@gmail.com","89252222222",70_000,45),
                new Employee("Andreev Andrey","Design engineer", "i.ivanov@gmail.com","89253333333",70_000,35),
                new Employee("Sergeev Sergey","Software engineer", "i.ivanov@gmail.com","89254444444",70_000,30),
                new Employee("Alekseev Aleksey","Electrician", "i.ivanov@gmail.com","89257777777",60_000,40),
        };

        for(int i = 0; i < emp.length; i++) {
            if(emp[i].getAge() > 40) {
                System.out.println(emp[i].toString());
            }
        }
    }
}
