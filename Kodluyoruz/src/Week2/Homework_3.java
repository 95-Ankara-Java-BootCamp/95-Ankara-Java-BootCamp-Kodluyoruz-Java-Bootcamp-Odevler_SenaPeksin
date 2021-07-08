package Week2;

import java.util.Scanner;

public class Homework_3 {
	
	 static double average = 0;
	 
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  double firstNote= 0;
		  double finalNote =0;
		  System.out.println("Vize notunuzu giriniz");
		  firstNote = scanner.nextDouble();
		  System.out.println("Final notunuzu giriniz");
		  finalNote = scanner.nextDouble();
		  if((firstNote<0 || firstNote>100) || (finalNote<0 || finalNote>100)) {
	           System.out.println("Vize ve  Final notunuz 0-100 arasýnda olmalýdýr. ");
	       } 
		  else
	       {
		       calculateAverage(firstNote,finalNote);
	      }
}

	private static void calculateAverage(double firstNote, double finalNote) {
		
		 average = (firstNote*0.20) + (finalNote*0.70);
		 System.out.println("Ortalamanýz : " + average);
		 
		 if(average>=90 && average<=100) {
	         System.out.println("Tebrikler, AA ile geçtiniz");
	       }
		 else if(average>=85 && average<90){
	         System.out.println("Tebrikler, BA ile geçtiniz");
	       }
		 else if(average>=75 && average<85){
	         System.out.println("Tebrikler, BB ile geçtiniz");
	       }
		 else if(average>=65 && average<75){
	         System.out.println("Tebrikler, CB ile geçtiniz");
	       }
		 else if(average>=60 && average<65){
	         System.out.println("Tebrikler, CC ile geçtiniz");
	       }
		 else if(average>=55 && average<60){
	         System.out.println("Tebrikler, DC ile geçtiniz");
	       }
		 else if(average>=45 && average<55){
	         System.out.println("Tebrikler, DD ile zar zor  geçtiniz");
	       }
		 else if(average<45) {
			 System.out.println("Harf notunuz : FF");
		 }
	          
	}

}


