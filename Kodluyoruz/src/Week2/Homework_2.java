package Week2;

import java.util.Scanner;

public class Homework_2 {
	static double ticketPrice = 30;
	static Scanner scanner = new Scanner(System.in);
	static int age;
	public static void main(String[] args) {
		/*
		Sinema Bileti Sat��� :
		-18 ya� alt� i�in %10
		-18 ve 25 ya� aras� %5 indirim
		-Korku filmi se�imi %10 indirim
		 */
		
		System.out.println("*******S�NEMA B�LET SATI� NOKTASINA HO� GELD�N�Z*******");
		System.out.println("L�tfen ya��n�z� giriniz. ");
	    age = scanner.nextInt();   
		System.out.println("L�tfen film t�r�n� se�iniz. " + "\n" + "Bilet �cretimiz  30 TL 'dir.");
		System.out.println("Korku filmi i�in 1 , di�er film t�rleri i�in 2 giriniz. " + "\n");
		int movieCategory = scanner.nextInt();
		MovieCategory(movieCategory,age);
		
	}

	private static void MovieCategory(int movieCategory,int age) {
		if(movieCategory==1) {
			System.out.println("Film kategorinizi korku olarak se�tiniz. %10 indirim 'den yararlanacaks�n�z.");
			horrorMovie();
		}
		else
		{
			System.out.println("Korku filmi kategorisi d���ndaki filmlerimizde; 18 ya� alt� i�in %10, 18 ve 25 ya� aras� %5 indirim'den yararlanacaks�n�z.");
			OtherCategoryMovie(age);
		}
			
	}

	private static void OtherCategoryMovie(int age) {
		if(age<18) {
			double newTicketPrice = ticketPrice - ( ticketPrice * 0.10); 
			System.out.println("Bilet �cretiniz : "+ newTicketPrice +" TL'dir.");
		}
		else if(age >= 18 && age <=25) {
			double newTicket = ticketPrice - ( ticketPrice * 0.05); 
			System.out.println("Bilet �cretiniz : "+ newTicket +" TL'dir.");
		}
		else {
			System.out.println("Bilet �cretiniz : "+ ticketPrice +" TL'dir.");
		}
		
	}

	private static void horrorMovie() {
		System.out.println("%10 indirim ger�ekle�tiriliyor.");
		double newTicketPrice = ticketPrice - ( ticketPrice * 0.10); 
		System.out.println("Bilet �cretiniz : "+ newTicketPrice +" TL'dir.");
	}

}
