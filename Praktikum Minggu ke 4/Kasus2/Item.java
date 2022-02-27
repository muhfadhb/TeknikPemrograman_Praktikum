package Kasus2;

/**
 * @author Muhammad Fadhil
 * @version 1.0
 * @since 2022-27-02
 */

public class Item {
	private String name;
	
	private Item() {
		name = "Ipin";					// Isi variabel name dengan kata "Ipin"
	}

	public Item(String name) {
		this.name = new Item().name;	/* Panggil method Item, agar output yang dihasilkan adalah "Ipin"
										   dan tidak mengikuti isi String di main class */
		System.out.println(this.name);	// Tampilkan isi string ke layar
	}

}