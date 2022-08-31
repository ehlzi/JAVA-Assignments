
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number in the console above 6.");

        int x = sc.nextInt();

        sc.close();

        while (5 < x) {

            System.out.println(x);

            x = x - 1;

        }

    }

}
