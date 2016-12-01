package Classes;

/**
 * Created by dev on 29.11.16.
 */
public abstract class Item
{
    String name;
    public abstract String getItemName();
    @Override
    public String toString()
    {
        return getItemName();
    }
}
