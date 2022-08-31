class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        try{

            Dog.meow();

        } catch (Exception dg){

            System.out.println("No 'Meow' from a dog!");

        }

        Dog.bark();

    }
}