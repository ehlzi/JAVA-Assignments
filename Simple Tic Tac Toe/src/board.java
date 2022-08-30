import java.util.*;

public class board {

    //Board fill
    static String[] board;
    static String turn = "X";

    static void printBoard() {

        board = new String[9];

        for (int a = 0; a < 9; a++) {

            board[a] = String.valueOf(a + 1);

        }

        //Board Guides
        String boundT = "- - - - - - -";
        String boundB = "- - - - - - -";
        String boundM = "- - - - - - -";
        String boundL = "| ";
        String boundLRM = " | ";
        String boundR = " |";

        //Board combined
        String line1 = boundL + board[0] + boundLRM + board[1] + boundLRM + board[2] + boundR;
        String line2 = boundL + board[3] + boundLRM + board[4] + boundLRM + board[5] + boundR;
        String line3 = boundL + board[6] + boundLRM + board[7] + boundLRM + board[8] + boundR;


        System.out.println(boundT);
        System.out.println(line1);
        System.out.println(boundM);
        System.out.println(line2);
        System.out.println(boundM);
        System.out.println(line3);
        System.out.println(boundB);


    }

    static String checkWinner() {

        for (int a = 0; a < 8; a++) {

            String line = null;

            switch (a) {

                case 0:
                    line = board[0] + board[1] + board[2];
                    break;

                case 1:
                    line = board[3] + board[4] + board[5];
                    break;

                case 2:
                    line = board[6] + board[7] + board[8];
                    break;

                case 3:
                    line = board[0] + board[3] + board[6];
                    break;

                case 4:
                    line = board[1] + board[4] + board[7];
                    break;

                case 5:
                    line = board[2] + board[5] + board[8];
                    break;

                case 6:
                    line = board[0] + board[4] + board[8];
                    break;

                case 7:
                    line = board[2] + board[4] + board[6];
                    break;

            }

            //For X winner
            if (line.equals("XXX")) {

                return "X";

            }

            // For O winner
            else if (line.equals("OOO")) {

                return "O";

            }
        }

        for (int a = 0; a < 9; a++) {

            if (Arrays.asList(board).contains(

                    String.valueOf(a + 1))) {

                break;

            } else if (a == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

}