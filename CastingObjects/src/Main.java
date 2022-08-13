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
        Rabbit rabbit = new Rabbit();
        Cat cat = new Cat();

        dog.name = "Rex";
        rabbit.name = "Floof";
        cat.name = "Tom";

        dog.color = "brown";
        rabbit.speed = 15;
        cat.jump = 8;

        train(dog);
        train2(dog);
        train(rabbit);
        train(cat);

        train2(rabbit);
        train2(cat);
    }
}