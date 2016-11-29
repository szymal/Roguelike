package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class HealthPotion extends Potion {
    @Override
    public String getItemName() {
        return "+10 HP!";
    }

    @Override
    public void use(Hero hero) {
        return hero.setHealth(hero.health+10);
    }
}
