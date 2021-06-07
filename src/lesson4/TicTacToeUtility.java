package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeUtility {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public void InitMap(final int size, char[][] map, final char emptyCell) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = emptyCell;
            }
        }
    }

    public void printMap(final int size, char[][] map) {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


    }

    public void humanTurn(final int size, char[][] map, final char emptyCell, final char userCell) {
        int x, y;
        do {
            System.out.println("Enter coordinates");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!cellValidation(x, y, size, map, emptyCell));
        map[x][y] = userCell;
    }

    public boolean cellValidation(int x, int y, int size, char[][] map, char emptyCell) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[x][y] == emptyCell) return true;
        return false;

    }

    public void computerTurn(final int size, char[][] map, char emptyCell, char computerCell, char userSymbol) {
        int x, y;
        boolean isTrue = true;
        boolean isContinue = true;
        int symbolCount = 0;
        //row check
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == userSymbol) {
                    symbolCount++;
                }
                if (symbolCount == 2) {
                    while (isContinue) {
                        for (int k = 0; k < map.length; k++) {
                            if (map[i][k] == emptyCell) {
                                map[i][k] = computerCell;
                                isTrue = false;
                                isContinue = false;
                            }
                        }
                    }
                }
            }
            symbolCount = 0;
        }

//      column check
        for (int i = 0; i < map.length; i++) {
            for (char[] chars : map) {
                if (chars[i] == userSymbol) {
                    symbolCount++;
                }
                if (symbolCount == 2) {
                    while (isContinue) {
                        for (int k = 0; k < map.length; k++) {
                            if (map[k][i] == emptyCell) {
                                map[k][i] = computerCell;
                                isTrue = false;
                                isContinue = false;
                            }
                        }
                    }
                }
            }
            symbolCount = 0;
        }

//        diagonal check
        int iValue = 0;
        int jValue = map.length - 1;
        symbolCount = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if ((i == iValue && j == jValue) && map[i][j] == userSymbol) {
                    symbolCount++;
                }
                if (symbolCount == 2) {
                    while (isContinue) {
                        for (int k = 0; k < map.length; k++) {
                            for (int l = 0; l < map.length; l++) {
                                if ((k == iValue && l == jValue)) {
                                    if (map[k][l] == emptyCell) {
                                        map[k][l] = computerCell;
                                        isTrue = false;
                                        isContinue = false;
                                    }
                                }
                            }
                        }
                    }
                }
                iValue++;
                jValue--;
            }
        }

        for (int k = 0; k < map.length; k++) {
            for (int j = 0; j < map.length; j++) {
                if (k == j && map[k][j] == userSymbol) {
                    symbolCount++;
                }
                if (symbolCount == 2) {
                    for (int r = 0; r < map.length; r++) {
                        for (int c = 0; c < map.length; c++) {
                            if (r == c) {
                                if (map[r][c] == emptyCell) {
                                    map[r][c] = computerCell;
                                    isTrue = false;
                                    isContinue = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (isTrue) {
            do {
                x = random.nextInt(size);
                y = random.nextInt(size);
            } while (!cellValidation(x, y, size, map, emptyCell));
            System.out.println("Computer move in coordinates " + (x + 1) + " and " + (y + 1));
            map[x][y] = computerCell;
        }
    }

    public boolean winValidation(char symbol, char[][] map) {
        int symbolCount = 0;
        for (char[] chars : map) {
            for (int j = 0; j < map.length; j++) {
                if (chars[j] == symbol) {
                    symbolCount++;
                }
                if (symbolCount == 3) {
                    return true;
                }
            }
            symbolCount = 0;
        }

        for (int i = 0; i < map.length; i++) {
            for (char[] chars : map) {
                if (chars[i] == symbol) {
                    symbolCount++;
                }
                if (symbolCount == 3) {
                    return true;
                }
            }
            symbolCount = 0;
        }

//         diagonal value calc

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i == j && map[i][j] == symbol) {
                    symbolCount++;
                }
                if (symbolCount == 3) {
                    return true;
                }
            }
        }

        int iValue = 0;
        int jValue = map.length - 1;
        symbolCount = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if ((i == iValue && j == jValue) && map[i][j] == symbol) {
                    symbolCount++;
                }
                if (symbolCount == 3) {
                    return true;
                }
            }
            iValue++;
            jValue--;
        }
        return false;

    }

    public boolean isMapFull(final int size, char[][] map, char emptyCell) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == emptyCell) return false;
            }
        }
        return true;
    }

}
