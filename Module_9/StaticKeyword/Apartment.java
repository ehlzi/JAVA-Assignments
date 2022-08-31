public class Apartment {

    WaterTank waterTank;
    int floor;

    public Apartment(int number, WaterTank waterTank) {

        this.waterTank = waterTank;

        floor = number;

    }

    public void useWater() {

        waterTank.useWater();

        waterTank.printWaterLevel();

    }

}