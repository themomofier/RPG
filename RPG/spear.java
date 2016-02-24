
/**
 * Write a description of class spear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spear extends throwableWeapon{
    public spear(int length, int width,int bladeLength, String name, int damage,int weaponQuality,int range){
        super(length, width, name, damage, weaponQuality, bladeLength, range);
    }
    public spear(){
        this(84, 3,7,"Pokie",30,100,175);
    }
}
