import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer value");
    int original = sc.nextInt();

    int copy = original;

    System.out.println(original + " equals " + copy);

    int low = 100;
    int high = 100;

    if(low == high){

    System.out.println("They are equal");

  }

    String string1 = "Hello World";

    String string2 = new String("Hello World");

    System.out.println(string1 == string2);

    System.out.println(string1.equals(string2));

  }
}