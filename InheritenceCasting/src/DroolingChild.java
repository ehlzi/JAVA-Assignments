// 3. Make DroolingChild extend from parent

public class DroolingChild extends Parent {
    int droolAmount;

    public DroolingChild(String name, String energy, int droolAmount) {

        super(name, energy);
        this.name = name;
        this.energy = energy;
        this.droolAmount = droolAmount;
    }

    @Override
    public void walk(){

        System.out.println(name + " crawls forward with " + energy + " energy while drooling " + droolAmount + " liters");

    }
}