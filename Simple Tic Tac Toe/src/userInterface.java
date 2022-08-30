import java.util.*;

public class userInterface {

    public static void getUser() {

        //Scanner Input and Variables
        Scanner sc = new Scanner(System. in);
        userX uX = new userX();
        userO uO = new userO();

        System.out.println(
                "What's the name for Player X?");
        String userX = sc.nextLine();
        uX.setName(userX);

        System.out.println(
                "What's the name for Player O?");
        String userO = sc.nextLine();
        uO.setName(userO);
    }
}