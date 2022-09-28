package sayiBulma;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array= new int[10];
        boolean varMi=false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aradığınız sayıyı yazınız:");
        int aranan=scanner.nextInt();
		for(int i=0;i<10;i++) {
			Random rnd=new Random();
			array[i]=rnd.nextInt(10);
		}
		
		for(int sayi: array) {
			if(sayi==aranan) {
				varMi=true;
				break;
			}
		}
		if(varMi==true) {
			System.out.println("Aranan sayı dizide mevcuttur.");
		}
		else {
			System.out.println("Aranan sayı dizide mevcut değil.");
		}
		
		
		
		
	}

}
