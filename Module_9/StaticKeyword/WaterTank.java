class WaterTank {

    public static int waterLevel;

    public WaterTank(){
        waterLevel = 100;
    }


    public void useWater(){

        waterLevel = waterLevel - 10;

        if (waterLevel != 0){

            System.out.println("Water gushes");

        } else {

            System.out.println("No water. Please refill");

        }
    }

    public void refill(){

        System.out.println("Watertank is being refilled");

        waterLevel = 100;

        System.out.println("Watertank is full");

    }

    public void printWaterLevel(){

        System.out.println("Water level: " + waterLevel);

    }

}