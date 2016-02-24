
/**
 * Abstract class boradSword - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class broadSword extends sword{
    public broadSword(int length, int width, String name, int damage,int weaponQuality){
        super(length, width, name, damage, weaponQuality);
    }
    public broadSword(){
        this(42,6, "The Wombo Combo", 34, 100);
    }
}
