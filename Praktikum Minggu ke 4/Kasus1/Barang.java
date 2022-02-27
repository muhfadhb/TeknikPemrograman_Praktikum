package Kasus1;

/**
 * 
 * @author Muhammad Fadhil
 */
public class Barang {
    String kode_Barang;
    String nama_Barang;
    private int stok;
    String nama_barang;
    
    public int getstok() {
       return stok;
    }
    
    public void setStok(int stok) {
        this.stok += stok;
    }
    
    public Barang(String kode, String nama, int stk) {
        String kode_barang = kode;
        String nama_barang = nama;
        stok = stk;
    }
    
    void printShowBarang(){
        System.out.println(this.nama_barang + "(" + this.stok + ")");
    }

    String getStock() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    
