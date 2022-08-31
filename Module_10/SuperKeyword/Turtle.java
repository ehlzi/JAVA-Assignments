class Turtle extends Reptile {

    int breath;

    public Turtle(String name, String limbs, int life, int breath) {

        super(name, limbs, life);

        this.breath = breath;

    }

    @Override
    public void whoAmI(){

        super.whoAmI();

        System.out.println(" and a turtle. My skin is " + super.skin + ". I can hold my breath for " + breath + " minutes.");

    }

}
