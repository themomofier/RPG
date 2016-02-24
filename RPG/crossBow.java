
/**
 * Write a description of class crossBow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crossBow extends ranged{
    public crossBow(int effectiveRange,int damage,String name,int ammo,double rateOfFire,int weaponQuality){
       super(effectiveRange ,damage ,name ,ammo ,rateOfFire ,weaponQuality);
    }
    public crossBow(){
        this(1000,20,"The Bow of Crosses",40,.15,100);
    }
}
