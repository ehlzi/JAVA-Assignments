import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("What numbers would you like to do math with?");
    
    int x = input.nextInt();
    int y = input.nextInt();
  
    input.close();
    
    System.out.println("The sum of " + x + " and " + y + " equals: " + "\n");
    System.out.println(x + y + "\n");
    
    System.out.println("The difference of " + x + " and " + y + " equals: " + "\n");
    System.out.println(x - y + "\n");
    
    System.out.println("The product of " + x + " and " + y + " equals: " + "\n");
    System.out.println(x * y + "\n");
    
    System.out.println("The quotient of " + x + " and " + y + " equals: " + "\n");
    System.out.println(x / y + "\n");

  }
}
