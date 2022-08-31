class Tortoise extends Reptile {

    public Tortoise(String name, String limbs, int life){

        super(name, limbs, life);

    }

    @Override
    public void whoAmI(){

        super.whoAmI();

        System.out.println(" and a tortoise. My skin is " + super.skin + ".");

    }

}