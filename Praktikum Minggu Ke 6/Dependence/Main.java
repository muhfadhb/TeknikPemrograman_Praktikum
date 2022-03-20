package Dependence;


public class Main {
    public static void main(String args[]){
        //intansiasi
        Mobilfo Mobilfo = new Mobilfo();
        JenisMobil Mobil = new JenisMobil();
        
        //print nim Ferarri dengan memanggil method print pada obj info dengan parameter berupa obj Ferarri
        Mobilfo.print(Mobil);
    }
}