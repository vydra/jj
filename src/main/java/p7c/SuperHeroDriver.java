package p7c;

import java.util.ArrayList;

public class SuperHeroDriver {
    public static void main(String[] args) {
        AsteroidMan asteroidMan = new AsteroidMan();
        asteroidMan.setSuitColor("Red");
        asteroidMan.setCape(true);

        FriedEggMan friedEggMan = new FriedEggMan();
        friedEggMan.setSuitColor("Yellow");
        friedEggMan.setCape(true);

        LizzardWoman lizzardWoman = new LizzardWoman();
        lizzardWoman.setSuitColor("Green");
        lizzardWoman.setCape(false);

        ArrayList<SuperHero> heroes = new ArrayList<>();
        heroes.add(asteroidMan);
        heroes.add(friedEggMan);
        heroes.add(lizzardWoman);

        System.out.println("Original set of heroes:");

        for(SuperHero eachHero :  heroes) {
            System.out.println( eachHero.toString()
                    + ": suiteColor: " + eachHero.getSuitColor()
                    + " hasCape: " + eachHero.isCaped() + " motto: " + eachHero.motto()
            );
        }

        SuperHero[][] capedHeroes = new  SuperHero[3][3];
        ArrayList<Integer> capedIndexList = new ArrayList<>();
        for(int i = 0; i < heroes.size(); i++) {
            SuperHero hero = heroes.get(i);
            if(hero.isCaped()) {
                capedHeroes[i / 3][ i % 3] = hero;
                capedIndexList.add(i);
            }
        }

        for( int i : capedIndexList) {
            heroes.remove(i);
        }


        System.out.println("\nPrinting 2D array of SuperHero");
        for(int r = 0; r < capedHeroes.length;r++)
        {
            for(int c = 0; c < capedHeroes[r].length; c++ ) {
                System.out.print(capedHeroes[r][c]  + " " );

            }
            System.out.println("");

        }

        System.out.println("\nPrinting contents of capped heroes");
        for(int r = 0; r < capedHeroes.length;r++)
        {
            for(int c = 0; c < capedHeroes[r].length; c++ ) {
                SuperHero eachHero = capedHeroes[r][c];
                if(eachHero != null) {
                    System.out.println(eachHero.toString()
                            + ": suiteColor: " + eachHero.getSuitColor()
                            + " hasCape: " + eachHero.isCaped() + " motto: " + eachHero.motto());
                }

            }
        }

        System.out.println("\nRemaining set of heroes");
        for(SuperHero eachHero :  heroes) {
            System.out.println( eachHero.toString()
                    + ": suiteColor: " + eachHero.getSuitColor()
                    + " hasCape: " + eachHero.isCaped() + " motto: " + eachHero.motto()
            );
        }

    }
}
