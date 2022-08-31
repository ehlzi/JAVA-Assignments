class Main {

    public static void main(String[] args) {

        WaterBottle bottleOne = new WaterBottle();

        bottleOne.drink();

        WaterBottle bottleTwo = bottleOne;

        bottleTwo.drink();
        bottleTwo.check();
        bottleOne.check();

        LightSwitch lights = new LightSwitch();

        System.out.println("Lightswitch:");

        System.out.println(lights.getStatus());

        lights.flick();

        System.out.println(lights.getStatus());

    }
}