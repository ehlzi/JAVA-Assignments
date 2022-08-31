import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = input.nextInt();

        input.close();

        if (age > 18) {

            System.out.println("You are beautiful!");

        } else {

            System.out.println("You are so cute!");

        }

    }

}