package methods;


public class Main {

	public static void main(String[] args) {
		
		System.out.println(topla(3, 7));
        System.out.println(topla1(1,2,3,4,5,6));       
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;	
	}
	
	public static int topla1(int... sayilar) {
		int toplam =0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	
	
	

}
