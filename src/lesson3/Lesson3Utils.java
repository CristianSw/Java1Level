package lesson3;

import java.util.Arrays;

public class Lesson3Utils {


    static int[][] processArray(int[][] array, final int diagonalValue) {
        int iValue = 0;
        int jValue = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = diagonalValue;
                }
                if (i == iValue && j == jValue) {
                    array[i][j] = diagonalValue;
                }
            }
            iValue++;
            jValue--;
        }
        return array;
    }

    static void randomizeArray(int[] array, int min, int range) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * range) + min);
        }
    }

    static int[] fillArray(final int[] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value++;
        }
        return array;
    }

    static int[] processArray(int[] array, final int minimalValue, final int multiplyValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimalValue)
                array[i] *= multiplyValue;
        }
        return array;
    }

    static int[] processArray(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    static int[] processArray(final int[] array, final int initialValue) {
        Arrays.fill(array, initialValue);
        return array;
    }

    static void displayArray(final int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = " + array[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }


    static void displayArray(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }

    static int findMax(final int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    static int findMin(final int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    static boolean arraySumCheck(final int[] array){
        int beginSum = 0;
        int endSum = 0;
        for (int i = 0; i< array.length; i++){
            beginSum += array[i];
            for (int j = array.length -1; j > i; j--){
                endSum += array[j];
            }
            if (beginSum == endSum){
                System.out.println("first part = " + beginSum);
                System.out.println("end part = " + endSum);
                return true;
            }
            endSum = 0;
        }
        return false;
    }
}