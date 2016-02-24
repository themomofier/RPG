
/**
 * Abstract class Ranged - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ranged extends weapon{
    private int ammo;
    private int effectiveRange;
    private double rateOfFire;
    public ranged (int effectiveRange,int damage,String name,int ammo,double rateOfFire,int weaponQuality){
       super(weaponQuality, name, damage);
    }
    public ranged(){
        this(1,1,"",1,1,1);
    }
    
}
