class ClassScope {

  static int num = 5;
  
  static int num2;
 
  static Main num3;

  double num4 = 1.23;

  public static void main(String[] args) {
   

    System.out.println(num);

    num2 = 10;

    Main main = new Main();

    System.out.println(main.num4);

    Main main2 = new Main();

    main.num4 = 10;

    System.out.println(main2.num4);
    
    main2.num2 = 15;
    
    System.out.print(main.num2);

  }
}
