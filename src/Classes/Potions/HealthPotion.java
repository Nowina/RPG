package Classes.Potions;

import Classes.Hero;
import Classes.Potion;

/**
 * Created by dev on 29.11.16.
 */
public class HealthPotion extends Potion
{
    @Override
    public String getItemName()
    {
        return "Potion of Healing";
    }

    @Override
    public void use(Hero object)
    {
        object.setHealth(object.getHealth() + 10);
    }
}
