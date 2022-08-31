class Main {

    public static void main(String[] args) {

        String[] planets = {"Neptune", "Mercury", "Earth", "Jupiter", "Venus", "Pluto", "Uranus", "Saturn", "Mars"};

        String temp = planets[0];
        planets[0] = planets[1]; // 0 Nep 8 - Merc 1
        planets[1] = planets[4]; // 1 Merc 1 - Ven 4
        planets[4] = planets[3]; // 2 Earth 3 - Earth 2
        planets[3] = planets[8]; // 3 Jup 5 - Mars 8
        planets[8] = planets[5]; // 4 Ven 2 - Jup 3
        planets[5] = planets[7]; // 5 Plu 9 - Sat 7
        planets[6] = planets[6]; // 8 Mar 4 - Plu 5
        planets[7] = temp;

        for(int roPlanets = 0; roPlanets < planets.length; roPlanets++) {

            System.out.println(planets[roPlanets]);

        }
    }
}