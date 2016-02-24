
/**
 * Write a description of class throwableWeapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public abstract class throwableWeapon extends melee{ 
    private int bladeLength;
    private int range;
    public throwableWeapon(int length, int width, String name, int damage,int weaponQuality, int bladeLength, int range){
        super(length, width, name, damage, weaponQuality);
    }
    public throwableWeapon(){
        this(1,1,"",1,1,1,1);
    }
    public boolean throwWeapon(){
        int x;
        x = (int)(Math.random()*100)+1;
        if ( x >= 50 ){
            System.out.println("you did the thing...");
            return true;
        }
        else {
            System.out.println("you didn't do the thing :/");
        }
        return false;
    }
}
