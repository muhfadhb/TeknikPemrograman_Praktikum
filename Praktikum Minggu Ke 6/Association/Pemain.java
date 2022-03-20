package Association;

/**
 *
 * @author Muhammad Fadhil
 */
public class Pemain {
    // state //
    private String name;
    boolean getNamePemain;
    
    // constructor //
    Pemain (String name){
        this.name = name;
    }
    
    public String getNamePemain (){
        return this.name;
    }
}