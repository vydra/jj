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

        for(SuperHero eachHero :  heroes) {
            System.out.println( eachHero.getClass().getSimpleName()
                    + ": suiteColor: " + eachHero.getSuitColor()
                    + " hasCape: " + eachHero.isCaped() + " motto: " + eachHero.motto()
            );
        }

        SuperHero[][] capedHeroes = new  SuperHero[3][3];

        for(int i = 0; i < heroes.size(); i++) {
            SuperHero hero = heroes.get(i);
            if(hero.isCaped()) {
                System.out.println(hero);
                capedHeroes[i / 3][ i % 3] = hero;
                //heroes.remove(i);
            }
        }

        for(int r = 0; r < capedHeroes.length;r++)
        {
            for(int c = 0; c < capedHeroes[r].length; c++ ) {
                System.out.println(capedHeroes[r][c]  + " " );

            }

        }


    }
}
