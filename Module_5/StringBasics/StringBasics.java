import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Type two words below this sentence!");
    String mystery = sc.next();
    String mystery2 = sc.next();

    sc.close();

    System.out.println(mystery.length());

    System.out.println(mystery.charAt(4));

    System.out.println(mystery + mystery2);

  }
}