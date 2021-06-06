package Lesson2;

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число
 * передали или отрицательное. Замечание: ноль считаем положительным числом.
 * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
 * и вернуть false если положительное.
 * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
 * указанное количество раз;
 * 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class ParameterizedMethodsApp {
    public static void main(String[] args) {
        System.out.println(isSumInLimit(20, 40));
        printPositiveOrNegativeInteger(-20);
        System.out.println(isPositiveOrNegativeInteger(20));
        printStr("ABC", 5);
        System.out.println(" ");
        System.out.println(isLeapYear(2020));
    }

    public static boolean isSumInLimit(int number1, int number2) {
        return (number1 + number2) >= 0 & (number1 +number2) <= 20 ? true : false;
    }

    public static void printPositiveOrNegativeInteger(int number) {
        System.out.println((number >= 0) ? "Положительное число" : "Отрицательное число");
    }

    public static boolean isPositiveOrNegativeInteger(int number) {
        return (number >= 0) ? false : true;
    }

    public static void printStr(String text, int numberOfRepetitions) {
        for(int i = 1; i <= numberOfRepetitions; i++) {
            System.out.print(text + " ");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 100 != 0 & year % 4 == 0)) return true;
        else return false;
    }

}
