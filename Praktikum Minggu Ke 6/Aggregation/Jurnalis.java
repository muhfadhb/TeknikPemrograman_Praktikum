package Aggregation;

public class Jurnalis{
    // state //
    private String nim;
    private String nama ;
    
    // constructor //
    public Jurnalis (String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim (){
        return nim;
    }
}