package lesson2;

public class Lesson2Homework {
    public static void main(String[] args) {

        System.out.println(checkIntSum(5, 6));
        System.out.println(checkIntSum(5, 5));

        checkNumberSign(5);
        checkNumberSign(0);
        checkNumberSign(-200);

        System.out.println(isNegative(2));
        System.out.println(isNegative(0));
        System.out.println(isNegative(-125));

        printString("Some String", 5);

        System.out.println(calcYear(1585));
        System.out.println(calcYear(1584));
        System.out.println(calcYear(1600));
        System.out.println(calcYear(1612));
        System.out.println(calcYear(1896));
        System.out.println(calcYear(2001));
        System.out.println(calcYear(2004));
        System.out.println(calcYear(1999));
        System.out.println(calcYear(1998));
    }


    public static boolean checkIntSum(final int a, final int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else
            return false;
    }

    public static void checkNumberSign(final int number) {
        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean isNegative(final int number) {
        if (number < 0) {
            return true;
        } else
            return false;
    }

    public static void printString(final String stringValue, final int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(stringValue);
        }
    }

    public static boolean calcYear(final int year) {
        if (year % 100 == 0){
            return false;
        }
        return year % 4 == 0 || year % 400 == 0;

    }
}
