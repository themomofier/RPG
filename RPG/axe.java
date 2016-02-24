
/**
 * Write a description of class axe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class axe extends throwableWeapon{
    public axe(int length, int width,int bladeLength, String name, int damage,int weaponQuality,int range){
        super(length, width, name, damage, weaponQuality, bladeLength, range);
    }
    public axe(){
      this(24,3,6,"The Hacker",25,100,150);
    }
}
