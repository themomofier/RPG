
/**
 * Abstract class weapon - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class weapon implements WeaponInterface{
    private int weaponQuality;
    private String name;
    private int damage;
    
    public weapon(int WeaponQuality, String Name, int Damage){
        name = Name;
        weaponQuality = WeaponQuality;
        damage = Damage;
    }
    public boolean parry (){
         int x;
        x = (int)(Math.random()*100)+1;
        if ( x >= 50 ){
            System.out.println("'git gud scrub'");
            return true;
        }
        else {
            System.out.println("you got rekt");
        }
        return false;
    }
    public int attack(){
        System.out.println("you hit him for " + damage + " damage lol. ");
        return damage;
    }
}
