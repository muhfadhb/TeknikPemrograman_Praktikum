package Soal5;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * Input format	: Satu baris berupa plat number untuk 4 mobil
 * Output format: Satu baris Berupa tulisan “Jalan” atau “Berhenti
 * 
 * @author Muhammad Fadhil
 * @version 1.0
 * @since 2022-02-20
 */

public class Soal5 {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)){
			String mobil1 = input.next();						
			String mobil2 = input.next();						
			String mobil3 = input.next();						
			String mobil4 = input.next();						
			String numberInput = mobil1+mobil2+mobil3+mobil4;	
			long number = Long.parseLong(numberInput);			
			if((number-999999)%5 == 0) {						
				System.out.println("Jalan");		// Print "Jalan" mobil akan berjalan jika memenuhi syarat
			}else {
				System.out.println("Berhenti");		// Print "Berhenti" mobil akan berhenti jika memenuhi syarat
			}
		}
	}
}

/** Buka Tutup Jalan</h1>
 * Program Buka Tutup Jalan mengimplementasikan aplikasi untuk melakukan pengaturan jalan. 
 * Setiap empat mobil yang lewat digabung setiap angkanya. Jika (gabungan angka tersebut 
 * dikurangi 999999) hasilnya dibagi 5 sisa bagi hasilnya 0 maka 4 mobil tersebut harus 
 * berhenti, dan memperbolehkan mobil lainnya dari arah bersebrangan untuk jalan. Begitu 
 * terus sebaliknya.
 * */