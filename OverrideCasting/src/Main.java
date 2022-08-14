import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animal = new ArrayList<>();

        Duck duck = new Duck();
        Duckling duckling = new Duckling();
        Horse horse = new Horse();
        Sheep sheep = new Sheep();

        animal.add(duck);
        animal.add(duckling);
        animal.add(horse);
        animal.add(sheep);

        for (Animal p : animal){
            p.sound();
        }

    }
}

class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Duck extends Animal {

    @Override

    void sound(){
        System.out.println("Quack!");
    }
}

class Duckling extends Duck {

    @Override

    void sound(){
        System.out.println("Small quack!");
    }
}

class Horse extends Animal {

    @Override

    void sound(){
        System.out.println("Neigh!");
    }
}

class Sheep extends Animal {

    @Override

    void sound(){
        System.out.println("Baa!");
    }
}