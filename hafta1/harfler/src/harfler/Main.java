package harfler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz: ");
		String harf=scanner.nextLine();
		
		switch (harf) {
		case "A":
		case "a":
		case "O":
		case "o":
		case "I":
		case "ı":
		case "U":
		case "u":
			System.out.println("Girdiğiniz harf kalın sesli bir harftir.");
			break;
		case "E":
		case "e":
		case "Ö":
		case "ö":
		case "İ":
		case "i":
		case "Ü":
		case "ü":
		   System.out.println("Girdiğiniz harf ince sesli bir harftir.");
		   break;
		 default:
			 System.out.println("Girdiğiniz harf ünlü harf değildir.");
		
	}

}}
