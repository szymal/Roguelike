package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public class LevelPotion extends Potion {
    @Override
    public String getItemName(String name) {
        return super.getItemName("Potion of Level Up");
    }

    @Override
    public void use() {
        super.use();
    }
}
