import java.util.*;

class Main {

    public static void main(String[] args) {

        ArrayList<Grandparent> family = new ArrayList<>();

        Grandparent Mary = new Grandparent("Mary");
        Grandparent John = new Grandparent("John");
        Parent Amy = new Parent("Amy", "medium");
        Parent Andy = new Parent("Andy", "low");
        Child Annie = new Child("Annie", "high", "johnson");
        DroolingChild Tibbers = new DroolingChild("Tibbers", "high", 10);

        family.add(Mary);
        family.add(John);
        family.add(Amy);
        family.add(Andy);
        family.add(Annie);
        family.add(Tibbers);

        for (Grandparent p : family){
            p.walk();
        }


    }
}