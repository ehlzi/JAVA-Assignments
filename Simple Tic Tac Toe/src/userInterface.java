import java.util.*;

public class userInterface {

    public static void main() {

        //Scanner Input and Variables
        Scanner sc = new Scanner(System. in);
        userX uX = new userX();
        userO uO = new userO();

        System.out.println("\n" + "What's the name for Player X?" + "\n");
        String userX = sc.nextLine();
        uX.setName(userX);

        System.out.println("\n" + "What's the name for Player O?" + "\n");
        String userO = sc.nextLine();
        uO.setName(userO);

        sc.close();
    }
}