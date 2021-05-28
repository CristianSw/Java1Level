package lesson3;

import static lesson3.Lesson3Utils.*;

public class Lesson3Homework {
    public static void main(String[] args) {
//        ex1(5);
//        ex2();
//        ex3(6,2,1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);
//        ex4(5,1);
//        ex5(4,3);
//        ex6(1,2,3,4,5,6,10,99,-5,11,20,-100);
//

//        boolean isSum = ex7(2, 2, 2, 1, 2, 2, 10, 1);
//        System.out.println(isSum);
            ex8(2,1,2,3,4,5);


    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void ex1(final int size) {
        int[] initArray = new int[size];
        int max = 1;
        int min = 0;
        int range = max - min + 1;
        randomizeArray(initArray, min, range);
        System.out.println("Init Array");
        displayArray(initArray);
        int[] processedArray = processArray(initArray);
        System.out.println("Processed Array");
        displayArray(processedArray);
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void ex2() {
        int arraySize = 100;
        int[] initArray = new int[arraySize];
        int[] filledArray = fillArray(initArray);
        displayArray(filledArray);
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void ex3(final int minimalValue, final int multiplyValue, int... args) {
        System.out.println("Init Array");
        displayArray(args);
        int[] processedArgs = processArray(args, minimalValue, multiplyValue);
        System.out.println("Processed array");
        displayArray(processedArgs);
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void ex4(final int size, final int diagonalValue) {
        int[][] initArray = new int[size][size];
        System.out.println("init array");
        displayArray(initArray);
        int[][] processedArray = processArray(initArray, diagonalValue);
        System.out.println("processed array");
        displayArray(processedArray);
    }

    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */

    public static void ex5(final int length, final int initialValue) {
        int[] initialArray = new int[length];
        int[] processedArray = processArray(initialArray, initialValue);
        System.out.println("Processed Array");
        displayArray(processedArray);
    }

    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static void ex6(final int... args) {
        int min;
        int max;
        min = findMin(args);
        max = findMax(args);
        displayArray(args);
        System.out.println("Min Value : " + min);
        System.out.println("Max Value : " + max);
    }

    /**
     * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean ex7(final int... args) {
        return arraySumCheck(args);
    }

    public static void ex8(final int n, int... args) {

        if (n > 0) {
            for (int i = 0; i < args.length; i++) {
                int j = 0;
                if (i > args.length - n) {
                    args[i] = args[i + n];
                } else {
                    args[j] = args[i];
                    j++;
                }
            }

        } else {
            int i = args.length - 1;
            for (; i > 0; i--) {

            }

        }

        displayArray(args);
    }
}
