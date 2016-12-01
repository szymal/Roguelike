package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class Hero {
    protected int level;
    protected int health;
    protected int armor;
    Item[] inventory = new Item[10];

    public Hero(){
        int level = 1;
        int health = 100;
        int armor = 100;
        inventory = new Item[0];
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

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public void useItem(Usable usable){
        usable.use(this);
    }
    public void eqpuipItem(Equippable equippable){
        equippable.equip(this);
    }

}
