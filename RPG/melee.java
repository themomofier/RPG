
/**
 * Abstract class melee - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class melee extends weapon{
    private int length;
    private int width;
    public melee(int Length, int Width, String name, int damage,int weaponQuality){
        super(weaponQuality, name, damage);
        length = Length;
        width = Width;
    }
    public melee(){
        this(1,1,"",1,1);
    }
}
