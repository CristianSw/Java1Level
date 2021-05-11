public class HomeWorkApp {

    public static void main(String[] args) {
        // test methods
        printThreeWords();
        //check that sum is positive
        checkSumSign(20,40);
        //check that sum is negative
        checkSumSign(-100,25);
        //check value from negative diapason
        printColor(-200);
        //check border value for red
        printColor(0);
        //check left border value for yellow
        printColor(1);
        // check value from diapason for yellow
        printColor(99);
        //check right border value for yellow
        printColor(100);
        //check left border value for green
        printColor(101);
        //check value from diapason for green
        printColor(5000);
        //check when a > b
        compareNumbers(5,3);
        //check when a = b
        compareNumbers(5,5);
        //check when a < b
        compareNumbers(5,10);

    }


    private static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    private static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }
}
