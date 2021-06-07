package lesson4;


public class TicTacToe {
    public static void main(String[] args) {


        final char DOT_X = 'X';
        final char DOT_O = 'O';
        final char DOT_EMPTY = '-';
        int size = 3;

        TicTacToeUtility ticTacToeUtility = new TicTacToeUtility();
        char[][] map = new char[size][size];


        ticTacToeUtility.InitMap(size, map, DOT_EMPTY);
        ticTacToeUtility.printMap(size, map);
        while (true) {
            ticTacToeUtility.humanTurn(size, map, DOT_EMPTY, DOT_X);
            ticTacToeUtility.printMap(size, map);
            if (ticTacToeUtility.winValidation(DOT_X, map)) {
                System.out.println("Human WIN !");
                break;
            }
            if (ticTacToeUtility.isMapFull(size, map, DOT_EMPTY)) {
                System.out.println("Nobody WIN");
                break;
            }
            ticTacToeUtility.computerTurn(size, map, DOT_EMPTY, DOT_O,DOT_X);
            ticTacToeUtility.printMap(size, map);
            if (ticTacToeUtility.winValidation(DOT_O, map)) {
                System.out.println("Computer WIN !");
                break;
            }
            if (ticTacToeUtility.isMapFull(size, map, DOT_EMPTY)) {
                System.out.println("Nobody WIN");
                break;
            }
        }
        ticTacToeUtility.printMap(size, map);
        System.out.println("Game Finished");

    }

}
