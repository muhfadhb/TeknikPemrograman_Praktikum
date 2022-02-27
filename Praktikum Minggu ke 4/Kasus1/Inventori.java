package Kasus1;

/**
 *
 * @author Muhammad fadhil
 */
public class Inventori {
    Barang[] barangs;
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        barangs[0].printShowBarang();// menampilkan variabel
        barangs[1].printShowBarang();
    }
    void pengadaan() {
        initBarang();
        barangs[0].setStok(20);//inoutkan isi dari variabel privat stok dengan method setStok()
        barangs[0].setStok(30);
        barangs[0].setStok(30);
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }

}