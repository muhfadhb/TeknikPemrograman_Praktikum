package Association;

/**
 *
 * @author Muhammad Fadhil
 */
public class MainProgram {

    public static void main(String[] args) {
        // TODO code application logic here
        SepakBola sepakbola = new SepakBola ("Polban");
        
        // inisialisasi nama pegawai //
        Pemain e1 = new Pemain ("Danu Mahesa");
        Pemain e2 = new Pemain ("Muhammad Fadhil");
        Pemain e3 = new Pemain ("Dhafin rizqi fadhilah");
        Pemain e4 = new Pemain ("Muhammad Naufal Al ghani");
        
        // tampil //
        System.out.println(e1.getNamePemain() + " adalah Pemain Club " + sepakbola.getSepakBolaName());
        System.out.println(e2.getNamePemain() + " adalah Pemain Club " + sepakbola.getSepakBolaName());
        System.out.println(e3.getNamePemain() + " adalah Pemain Club " + sepakbola.getSepakBolaName());
        System.out.println(e4.getNamePemain() + " adalah Pemain Club " + sepakbola.getSepakBolaName());
    }
    
}