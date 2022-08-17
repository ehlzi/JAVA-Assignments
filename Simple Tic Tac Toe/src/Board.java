import java.util.Scanner;

public class Board {

    public static void main() {

        //Marks
        String X = "X ";
        String O = "O ";

        //String[] userInput = {X, O, X, O, X, O, X, O, X};

        //Boundaries
        String boundT = "---------";
        String boundB = "---------";
        String boundL = "| ";
        String boundR = "|";
        /**/
        String line1 = boundL + X + O + X + boundR;
        String line2 = boundL + O + X + O + boundR;
        String line3 = boundL + X + O + X + boundR;

        //Board
        String board = line1 + "\n" + line2 + "\n" + line3;

        //System.out.println(boundT + "\n" + board + "\n" + boundB);

        Scanner sc = new Scanner(System.in);

        /*
        //Array Scanner Setup
        int length = 1;
        int arrLength = 1;
        String[] arr = new String[arrLength];
        */

        //Input
        int userInput = sc.nextInt();
        System.out.println(userInput);

        /*
        Arrays.fill(arr, 0, length, uInput);
        Arrays.fill(arr, length, arrLength, uInput);
         */

        /*
        if (uInput.length == arrLength) {
            System.out.println("Yeet");
        } else {
            System.out.println("Please enter 9 items to fill the board!");
        }
        */

    }
}