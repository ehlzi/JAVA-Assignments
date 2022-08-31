class Main {

  static int num = 5;

  static int num2;

  static Main num3;

  double num4 = 1.23;

  void blockScope(){

    int methodInt = 10;

    Main main2 = new Main();
    this.num = 15;

    num2 = 25;
    num4 = 55;
    main2.num4 = 105;

    System.out.println("Method starting");
    System.out.println("Main.num = " + Main.num);
    System.out.println("main2.num = " + main2.num);
    System.out.println("main2.num2 = " + main2.num2);
    System.out.println("num2 = " + num2);
    System.out.println("num4 = " + num4);
    System.out.println("main2.num4 = " + main2.num4);
    System.out.println("Method ending");
  }

  public static void main(String[] args) {

    System.out.println(num);

    num2 = 10;
    System.out.println(num2);

    Main main = new Main();
    System.out.println(main.num4);

    main.blockScope();

    System.out.println(main.num4);

  }
}