/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author Muhammad Fadhil
 */
public class Main {

	public static void main(String[] args) {
		// Instansiasi Objek
		Shape S1 = new Shape("Blue", true);
		Circle C1 = new Circle(14, "Red", true);
		Rectangle R1 = new Rectangle (2, 10, "Pink", false);
		Square Sq1 = new Square (5);
		
		System.out.println(S1.toString());
		
		System.out.println(C1.toString());
		System.out.println(C1.getArea());
		System.out.println(C1.getPerimeter());
		
		System.out.println(R1.toString());
		System.out.println(R1.getArea());
		System.out.println(R1.getPerimeter());
		
		System.out.println(Sq1.toString());
		System.out.println(Sq1.getArea());
		System.out.println(Sq1.getPerimeter());
	}

}