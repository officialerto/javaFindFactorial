package findFactorial;

import java.util.Scanner;

public class Ders14 {

	public static void faktoriyel() {
		
		Scanner scan = new Scanner(System.in); //kullan�c�dan say� alaca��z o yuzden bunu yaz�yoruz
		
		System.out.println("Sayi: "); //printf
		
		int sayi = scan.nextInt(); //scanf
		
		int faktoriyel = 1; //faktoriyeli 1'e e�itliyoruz ��nk� 1 ile �arpacagz
		
		while (sayi > 0) { //dongu acmam�z gerek say�dan 1'e kadar tum say�lar� elden gec�rmes� �c�n
			
			faktoriyel *= sayi; //5 * 1 , 4 * 1, 3 * 1, 2 * 1, 1 * 1
			
			sayi--; //say�y� 1'e kadar kucultuyoruz ki o say�larla carps�n
			
		}
		
	
	System.out.println("Faktoriyel: " + faktoriyel); // sonucu yazd�r�yoruz

	}
	
	public static void main(String[] args) {
	
		faktoriyel(); // buras� da yukar�daki fonksiyonu cag�r�yor
	
	




}
	
	
}
