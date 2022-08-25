import java.util.*;

public class BoardX {

    static final int range = 2;
    static Scanner sc = new Scanner(System.in);

    //Board
    static String boundT = "---------";
    static String boundB = "---------";
    static String boundL = "| ";
    static String boundR = "|";

    public static char[][] getBoard() {

        char[][] board = new char[3][3];
        String boardInput = sc.next();
        int readChar = 0;
        final String scRange = "_________";

        if (boardInput.length() == scRange.length()) {

            for (int i = 0; i <= range; i++) {

                for (int j = 0; j <= range; j++) {

                    board[i][j] = boardInput.charAt(readChar);
                    readChar++;
                }
            }

        } else {

            System.out.println("Please insert 9 items!");
            getBoard();
        }

        return board;
    }

    public static void printBoard(char[][] getBoard) {

        System.out.println(boundT);

        for (int i = 0; i <= range; i++) {

            System.out.print(boundL);

            for (int j = 0; j <= range; j++) {

                System.out.print(getBoard[i][j] + " ");
            }

            System.out.print(boundR);
            System.out.println();
        }

        System.out.println(boundB);
    }

}