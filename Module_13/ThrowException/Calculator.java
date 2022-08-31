public class Calculator {

    public static void calculate(int x, int y) throws ArithmeticException {

        System.out.println(x/y);

    }

    public static void use(int x, int y) {

        try{

            Calculator.calculate(x, y);

        } catch (ArithmeticException ari) {

            System.out.println("Caught ArithmeticException");
            System.out.println("Don't divide by 0!");

        } catch (Exception ariTwo) {

            System.out.println("Some other exception");

        } finally {

            System.out.println("This will always print out");
        }
    }

}