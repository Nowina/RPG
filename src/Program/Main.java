package Program;

import Classes.Potions.HealthPotion;
import Classes.Hero;
import Classes.Potions.LevelPotion;
/**
 * Created by dev on 29.11.16.
 */
public class Main
{
    public static void main(String [] args)
    {
        Hero John = new Hero();

        HealthPotion pot = new HealthPotion();
        John.addInventoryUsable(pot);
        John.useItem(pot);

        LevelPotion potLevel = new LevelPotion();
        John.addInventoryUsable(potLevel);
        John.useItem(potLevel);


        System.out.println("John's health: " + John.getHealth());
        System.out.println("John's Armor: " + John.getArmor());
        System.out.println("John's Level: " + John.getLevel());
        for (int i = 0; i < John.getInventorySize(); i++)
        {
            System.out.println(John.getInventoryItem(i));
        }
    }
}
