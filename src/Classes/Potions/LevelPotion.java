package Classes.Potions;

import Classes.Hero;
import Classes.Potion;

/**
 * Created by dev on 29.11.16.
 */
public class LevelPotion extends Potion
{
    @Override
    public String getItemName()
    {
        return "Potion of Level Up";
    }

    @Override
    public void use(Hero object)
    {
        object.setLevel(object.getLevel() + 1);
    }
}
