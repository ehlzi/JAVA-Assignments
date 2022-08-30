import java.util.*;

public class BoardXX {

    static final int scRange = 9;

    //Input
    static Scanner sc = new Scanner(System.in);
    static String uI = sc.nextLine();

    public static void board() {

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
            board();
        }
    }
}