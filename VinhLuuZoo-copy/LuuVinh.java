
/**
 * Write a description of class LuuVinh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LuuVinh extends Animal
{
    public LuuVinh() {
        super("Vinh Luu", "orange", 4);
    }
    
    public String getType() {
        return "TabbyCat";
    }
    
    public String getName() {
        return "Neptune";
    }
    
    public String speak() {
        return "Scared of Water?";
    }
    
    public String getDisposition() {
        return "condescending";
    }
}