public class Main {

    public static void train(Animal animal){
        animal.print();
    }

    public static void train2(Animal animal){

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            System.out.println(dog.name + "'s color is " + dog.color);
        }
        else if (animal instanceof Rabbit){
            Rabbit rabbit = (Rabbit) animal;
            System.out.println(rabbit.name + "'s speed is " + rabbit.speed);
        }
        else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            System.out.println(cat.name + "'s jump height is " + cat.jump);
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Upcasting
        // This is upcasting since train only takes in Animal objects. It can still take a dog object because of upcasting.

        train(dog);

        // 1) Create a Rabbit and Cat classes. Make sure to add a print() method to them like the Dog class has.


        // 2) Make rabbit and cat objects.

        Rabbit rabbit = new Rabbit();
        Cat cat = new Cat();



        // Downcasting

        dog.name = "Rex";
        dog.color = "brown";
        train2(dog);

        // 3) Call the train method with the new rabbit and cat objects.

        train(rabbit);
        train(cat);

        // 4) Add a speed integer variable to the Rabbit class.

        rabbit.speed = 15;

        // 5) Set the rabbits name to Floof (like what is happening above to the dog) and its speed to 15.

        rabbit.name = "Floof";

        // 6) Add a jump height integer variable for the Cat class.

        cat.jump = 8;

        // 7) Make the cats name be Tom and its jump height to 8.

        cat.name = "Tom";

        // 8) Call the train2 method on Floof and Tom.

        train2(cat, rabbit);


    }
}