package Composition;


public class Main {
    public static void main(String args[]){
        
        //instansiasi
        Paket paket;
        paket = new Paket(new Harga(900000000),new Mobil("Ferarri"));
        
        System.out.println("Isi paket : " + paket.getMoney().getJumlah()+" Rupiah dan "+paket.getmerk(). getJenisMobil());
    }
}