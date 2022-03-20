package Aggregation;

public class Bidang {
    // state //
    private String namaBidang;
    private Jurnalis jurnalis;
    
    // constructor //
    public Bidang (String namaBidang){
        this.namaBidang = namaBidang;
    }
    
    // getter setter //
    public void setJurnalis (Jurnalis jurnalis){
        this.jurnalis = jurnalis;
    }
    
    public Jurnalis getJurnalis(){
        return jurnalis;
    }
    
    public String getNamaBidang(){
        return namaBidang;
    }
}