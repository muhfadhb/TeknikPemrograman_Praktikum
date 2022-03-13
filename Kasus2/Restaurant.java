package kasus2;
import java.util.Scanner;

public class Restaurant {
    // states //
    private SpekMenu [] menu = new SpekMenu [10];
    public static byte id = 1; // mulai dari 1 agar tidak ambigu
    int i;
    Scanner keyboard = new Scanner (System.in);
    
    // method //
    public Restaurant(){
       for (i=0 ; i<10; i++){
           menu [i] = new SpekMenu();
       }
    }
    
    public void tambahMenuMakanan (String nama, double harga, int stok){
        this.menu[id].setNama_makanan(nama);
        this.menu[id].setHarga_makanan(harga);
        this.menu[id].setStok(stok);
    }
    
    public void tampilMenuMakanan (){
        System.out.println("==DAFTAR MENU MAKANAN==");
        System.out.println("No Nama Makanan\tHarga");
        for (int i = 0;i <= id; i++){
            if (!isOutOfStock (i)){
                System.out.println (i +") " + menu[i].getNama_makanan() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock (int id){
        return (menu[id].getStok() == 0);
    }
    
    public static void nextId(){
        id++;
    }
    
    public void kurangiStok (int id, int jumlahpemesanan){
        int stok = 0;
        stok = menu[id].getStok() - jumlahpemesanan;
        menu[id].setStok(stok);
    }
    
    public void pesanMakanan (){
        int kodeMakanan;
        int jumlahPesanan;
        
        System.out.println("");
        System.out.println("==SILAHKAN PESAN MAKANAN==");
        System.out.print("No.Makanan = ");
        kodeMakanan = keyboard.nextInt();
        System.out.print("Jumlah Pesanan = ");  
        jumlahPesanan = keyboard.nextInt();
        if (jumlahPesanan > menu[kodeMakanan].getStok()){
            System.out.println("Maaf Stok yang Ada Tidak Memadai!");
            System.out.println("");
        }else{
            System.out.println("");
            kurangiStok (kodeMakanan,jumlahPesanan);
        }
    }
}