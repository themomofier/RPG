
/**
 * Write a description of class bow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bow extends ranged{
    public bow(int effectiveRange,int damage,String name,int ammo,double rateOfFire,int weaponQuality){
       super(effectiveRange ,damage ,name ,ammo ,rateOfFire ,weaponQuality);
    }
    public bow(){
        this(1250,20,"David Bowie",25,.87,100);
    }
}