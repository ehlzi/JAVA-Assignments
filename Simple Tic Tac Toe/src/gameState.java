import java.util.*;

public class gameState extends board {

    static boolean playerTurn = true; //Player 1 = True; Player 2 = False;
    static boolean gameStateY = false; //Checks if game has ended
    static Scanner in = new Scanner(System.in);
    static String winner = null;

    static void gameStateX() {

        printBoard();

        while (winner == null) {

            int numInput;

            // Exception handling.
            // numInput will take input from user like from 1 to 9.
            // If it is not in range from 1 to 9.
            // then it will show you an error "Invalid input."
            try {numInput = in.nextInt();

                if (!(numInput > 0 && numInput <= 9)) {

                    System.out.println("Invalid input; re-enter slot number:");

                    continue;

                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input; re-enter slot number:");

                continue;

            }

            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(String.valueOf(numInput))) {

                board[numInput - 1] = turn;

                if (turn.equals("X")) {

                    turn = "O";

                } else {

                    turn = "X";

                }

                printBoard();
                winner = checkWinner();

            } else {

                System.out.println("Slot already taken; re-enter slot number:");

            }
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {

            System.out.println("It's a draw! Thanks for playing.");

            // For winner -to display Congratulations! message.
        } else {

            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");

        }
    }
}