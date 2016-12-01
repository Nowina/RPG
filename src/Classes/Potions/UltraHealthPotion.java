package Classes.Potions;

import Classes.Hero;
import Classes.Potion;

/**
 * Created by dev on 01.12.16.
 */
public class UltraHealthPotion extends Potion {
    @Override
    public String getItemName() {
        return "UltraHealthPotion";
    }

    @Override
    public void use(Hero object) {
        object.setHealth(object.getHealth() + 100);

    }
}
