
/**
 * Abstract class longSword - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class longSword extends sword{
    public longSword(int length, int width, String name, int damage,int weaponQuality){
        super(length, width, name, damage, weaponQuality);
    }
    public longSword(){
        this(48,4,"Longie",25,100);        
    }
}
