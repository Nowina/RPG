package Classes.Armors;

import Classes.Armor;
import Classes.Hero;

/**
 * Created by dev on 01.12.16.
 */
public class IronArmor extends Armor{
    @Override
    public void equip(Hero object)
    {
        object.setArmor(object.getArmor() + 20);

    }

    @Override
    public String getItemName()
    {
        return "IronArmor";
    }
}
