package game;

/**
 * Created by kamilszymczak on 29.11.2016.
 */
public abstract class Item {
    public abstract String getItemName();

    @Override
    public String toString() {
        return getItemName();
    }

}
