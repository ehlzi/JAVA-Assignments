import java.util.*;
class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello please tell me your name?");

        String name = input.nextLine();

        System.out.println("Hello " + name + ", it is nice to meet you.");

        System.out.println("What state do you live in?");

        String state = input.nextLine();

        System.out.println("How old are you?");

        String age = input.nextLine();

        input.close();

        System.out.println("It appears you are" + " " + name + ", you're from the state of " + state + ", and you've been alive for " + age + " whole years. WOW!");

    }
}