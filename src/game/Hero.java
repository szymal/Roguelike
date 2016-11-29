package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class Hero {
    protected int level;
    protected int health;
    protected int armor;
    protected String inventory = ;

    public Hero(){
        int level = 1;
        int health = 100;
        int armor = 100;
        String inventory =  ;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public void useItem(Usable){
        Usable.use(Hero());
    }

}
