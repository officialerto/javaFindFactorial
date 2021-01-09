package findFactorial;

import java.util.Scanner;

public class Ders14 {

	public static void faktoriyel() {
		
		Scanner scan = new Scanner(System.in); //kullanýcýdan sayý alacaðýz o yuzden bunu yazýyoruz
		
		System.out.println("Sayi: "); //printf
		
		int sayi = scan.nextInt(); //scanf
		
		int faktoriyel = 1; //faktoriyeli 1'e eþitliyoruz çünkü 1 ile çarpacagz
		
		while (sayi > 0) { //dongu acmamýz gerek sayýdan 1'e kadar tum sayýlarý elden gecýrmesý ýcýn
			
			faktoriyel *= sayi; //5 * 1 , 4 * 1, 3 * 1, 2 * 1, 1 * 1
			
			sayi--; //sayýyý 1'e kadar kucultuyoruz ki o sayýlarla carpsýn
			
		}
		
	
	System.out.println("Faktoriyel: " + faktoriyel); // sonucu yazdýrýyoruz

	}
	
	public static void main(String[] args) {
	
		faktoriyel(); // burasý da yukarýdaki fonksiyonu cagýrýyor
	
	




}
	
	
}
