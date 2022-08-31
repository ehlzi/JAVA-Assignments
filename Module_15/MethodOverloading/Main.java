class Main {

    public static void main(String[] args) {

        Guitar g = new Guitar();

        System.out.println(g.Bass());
        System.out.println(g.Bass(3, "deep"));
        System.out.println(g.Bass(9, "clanging sounds", 3));

    }
}