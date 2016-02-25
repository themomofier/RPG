
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class armor{
    private int armorQuality;
    private int damageResistance;
    private double deflectionFactor;
    private double weight;
    private double impairment;
    public armor(int damageResistance,double deflectionFactor, int armorQuality,double weight,double impairment){
        
    }
    public armor(){
        this(1,1,100,1,1);
    }

}
