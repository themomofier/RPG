
/**
 * Abstract class shortSword - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class shortSword extends sword{
    public shortSword(int length, int width, String name, int damage,int weaponQuality){
        super(length, width, name, damage, weaponQuality);
    }
    
    public shortSword(){
        this(28,3,"lil Willie",14,100);
    }
}
