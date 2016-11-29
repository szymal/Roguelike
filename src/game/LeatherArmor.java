package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class LeatherArmor extends Armor {
    @Override
    public String getItemName() {
        return "Lether Armor";
    }

    @Override
    public void equip(Hero hero) {
        return hero.setArmor(hero.armor+10);
    }
}
