package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class LevelPotion extends Potion {
    @Override
    public String getItemName() {
        return "Potion of Level Up";
    }

    @Override
    public void use(Hero hero) {
        return hero.setLevel(hero.level+1);
    }
}
