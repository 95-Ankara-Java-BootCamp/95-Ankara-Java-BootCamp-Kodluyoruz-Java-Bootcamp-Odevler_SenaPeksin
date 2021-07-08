package Week2;

import java.util.Scanner;

public class Homework_2 {
	static double ticketPrice = 30;
	static Scanner scanner = new Scanner(System.in);
	static int age;
	public static void main(String[] args) {
		/*
		Sinema Bileti Satýþý :
		-18 yaþ altý için %10
		-18 ve 25 yaþ arasý %5 indirim
		-Korku filmi seçimi %10 indirim
		 */
		
		System.out.println("*******SÝNEMA BÝLET SATIÞ NOKTASINA HOÞ GELDÝNÝZ*******");
		System.out.println("Lütfen yaþýnýzý giriniz. ");
	    age = scanner.nextInt();   
		System.out.println("Lütfen film türünü seçiniz. " + "\n" + "Bilet ücretimiz  30 TL 'dir.");
		System.out.println("Korku filmi için 1 , diðer film türleri için 2 giriniz. " + "\n");
		int movieCategory = scanner.nextInt();
		MovieCategory(movieCategory,age);
		
	}

	private static void MovieCategory(int movieCategory,int age) {
		if(movieCategory==1) {
			System.out.println("Film kategorinizi korku olarak seçtiniz. %10 indirim 'den yararlanacaksýnýz.");
			horrorMovie();
		}
		else
		{
			System.out.println("Korku filmi kategorisi dýþýndaki filmlerimizde; 18 yaþ altý için %10, 18 ve 25 yaþ arasý %5 indirim'den yararlanacaksýnýz.");
			OtherCategoryMovie(age);
		}
			
	}

	private static void OtherCategoryMovie(int age) {
		if(age<18) {
			double newTicketPrice = ticketPrice - ( ticketPrice * 0.10); 
			System.out.println("Bilet ücretiniz : "+ newTicketPrice +" TL'dir.");
		}
		else if(age >= 18 && age <=25) {
			double newTicket = ticketPrice - ( ticketPrice * 0.05); 
			System.out.println("Bilet ücretiniz : "+ newTicket +" TL'dir.");
		}
		else {
			System.out.println("Bilet ücretiniz : "+ ticketPrice +" TL'dir.");
		}
		
	}

	private static void horrorMovie() {
		System.out.println("%10 indirim gerçekleþtiriliyor.");
		double newTicketPrice = ticketPrice - ( ticketPrice * 0.10); 
		System.out.println("Bilet ücretiniz : "+ newTicketPrice +" TL'dir.");
	}

}
