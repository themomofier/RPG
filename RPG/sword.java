
/**
 * Abstract class Sword - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class sword extends melee{
    
    public sword(int length, int width, String name, int damage,int weaponQuality){
        super(length, width, name, damage, weaponQuality);
    }
    public sword(){
        this(36,3,"The Magnificent Mr Swordie",4, 100);
    }
}
