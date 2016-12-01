package program;

import game.HealthPotion;
import game.Hero;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class Main {
    public static void main(String args[]){
       Hero hero = new Hero();
        HealthPotion healthPotion = new HealthPotion();
        hero.useItem(healthPotion);
        System.out.println(hero.getHealth());
    }

}
