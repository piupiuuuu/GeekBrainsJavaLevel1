package Lesson3;

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
 * заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной
 * len, каждая ячейка которого равна initialValue;
 * 6. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 * 7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве
 * есть место, в котором сумма левой и правой части массива равны
 * 8. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 */

import java.util.Arrays;
public class ArrayApp {

    public static void main(String[] args) {
        replaceValuesArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(initializeArray(5, 55)));
        minAndMax(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 });
        System.out.println(isEqualSum(new int[]{1, 2, 2, 5}));
        moveArray(new int[]{3, 5, 6, 1},-2);
    }

    public static void replaceValuesArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];
        for(int i = 0; i <array.length;i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(i == j || j == array.length - 1 - i) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[] initializeArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }


    public static void minAndMax(int [] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.printf("Min value array = %d. Max value array = %d. \n", min, max);
    }

    public static boolean isEqualSum(int[] array) {
        boolean result = false;

        int sum1 = 0;
        for (int j : array) {
            sum1 += j;
        }

        int sum2 = 0;
        for (int j : array) {
            sum2 += j;
            if (sum2 == sum1 - sum2) {
                result = true;
            }
        }
        return result;
    }

    public static void moveArray(int[] array, int number) {
        if(number >= 0) {
            for(int j = 1; j <= number; j++){
                for (int i = array.length - 1; i > 0; i--) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        } else {
            number = - number;
            for(int j = 1; j <= number; j++) {
                for (int i = 0; i < array.length - 1; i++) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}