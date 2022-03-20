package Aggregation;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Jurnalis jurnalis = new Jurnalis("211524019", " Muhammad Fadhil");
        Bidang bidang = new Bidang ("Jurnalis ESPN F1");
        
        bidang.setJurnalis(jurnalis);
        
        // tampil //
        System.out.println ("NO jurnalis      : " + bidang.getJurnalis().getNim());
        System.out.println ("Nama Jurnalis     : " + bidang.getJurnalis().getNama());
        System.out.println ("Bidang        : " + bidang.getNamaBidang());
        
    }
    
}
