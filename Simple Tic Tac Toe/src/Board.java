import java.util.*;

public class Board {

    public static void main() {

        final int scRange = 9;
        Scanner sc = new Scanner(System.in);

        //Input
        String uI = sc.nextLine();

        if (uI.length() == scRange) {

            //Boundaries
            String boundT = "---------";
            String boundB = "---------";
            String boundL = "| ";
            String boundR = " |";

            String line1 = boundL + uI.charAt(0) + " " + uI.charAt(1) + " " + uI.charAt(2) + boundR;
            String line2 = boundL + uI.charAt(3) + " " + uI.charAt(4) + " " + uI.charAt(5) + boundR;
            String line3 = boundL + uI.charAt(6) + " " + uI.charAt(7) + " " + uI.charAt(8) + boundR;

            //Board
            String layout = line1 + "\n" + line2 + "\n" + line3;
            String board = boundT + "\n" + layout + "\n" + boundB;

            System.out.println(board);

        } else {

            System.out.println("Please insert 9 items!");
            main();
        }
    }
}