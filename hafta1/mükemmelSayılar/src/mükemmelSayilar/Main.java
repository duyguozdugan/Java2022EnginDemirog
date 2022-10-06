package mükemmelSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int sayi=scanner.nextInt();
		int mükemmelsayi=1;
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				mükemmelsayi+=i;
			}
		}
		if(sayi==mükemmelsayi) {
			System.out.println("Girilen sayı mükemmel sayıdır.");
		}
		else {
			System.out.println("Girilen sayı mükemmel sayı değildir.");
		}

	}

}
