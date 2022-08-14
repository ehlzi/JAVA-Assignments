public class Parent extends Grandparent {

    String energy;
    public Parent(String name, String energy) {

        super(name);
        this.name = name;
        this.energy = energy;
    }

    @Override
    public void walk(){
        System.out.println(name + " walks normally with " + energy + " energy");
    }

}