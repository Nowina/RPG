package Classes;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 29.11.16.
 */

public class Hero
{
    private int level;
    private int health;
    private int armor;
    private List inventory = new ArrayList();

    public Hero()
    {
        level = 1;
        health = 100;
        armor = 0;
    }

    public int getLevel(){return level;}
    public int getHealth(){return health;}
    public int getArmor() {return armor;}

    public void setLevel(int NewValue){level = NewValue;}
    public void setHealth(int NewValue){health = NewValue;}
    public void setArmor(int NewValue){armor = NewValue;}

    public void useItem (Interfaces.Usable usable)
    {
        usable.use(this);
    }
    public void equipItem (Interfaces.Equippable equipped)
    {
        equipped.equip(this);
    }

    //inventory methods
    public void addInventoryEquippable(Interfaces.Equippable stuff){ inventory.add(stuff);}
    public void addInventoryUsable(Interfaces.Usable use){ inventory.add(use);}
    public String getInventoryItem(int i){return inventory.get(i).toString();}
    public int getInventorySize(){return inventory.size();}
}
