package Kasus2;

/**
 * @author Muhammad Fadhil
 * @version 1.0
 * @since 2022-27-02
 */

public class Item {
	private String name;
	
	private Item() {
		name = "Ipin";					//nama variabel diisi "Ipin"
	}

	public Item(String name) {
		this.name = new Item().name;	
		System.out.println(this.name);	
	}

}
