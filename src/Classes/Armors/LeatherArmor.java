package Classes.Armors;

import Classes.Armor;
import Classes.Hero;

/**
 * Created by dev on 29.11.16.
 */
public class LeatherArmor extends Armor
{
    @Override
    public String getItemName()
    {
        return "Leather Armor";
    }

    @Override
    public void equip(Hero object)
    {
        object.setArmor(object.getArmor() + 10);
    }
}
