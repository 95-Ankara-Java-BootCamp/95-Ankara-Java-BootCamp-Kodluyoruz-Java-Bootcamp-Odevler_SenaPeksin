package Week1;

public class Homework_3 {
	  public static  void main(String[] args){

	        double armutFiyat=2.14;
	        double elmaFiyat=3.67;
	        double domatesFiyat=1.11;
	        double muzFiyat=0.95;
	        double patlicanFiyat=5;

	        int armutKacKilo=1;
	        int elmaKacKilo=2;
	        int domatesKacKilo=3;
	        int muzKacKilo=4;
	        int patlicanKacKilo=5;
	        
	        System.out.print("Armut Kaç Kilo ? : " +armutKacKilo + "kg \n");
	        System.out.print("Elma Kaç Kilo ? :" +elmaKacKilo +"kg \n ");
	        System.out.print("Domates Kaç Kilo ? :"+domatesKacKilo +"kg \n");
	        System.out.print("Muz Kaç Kilo ? :"+muzKacKilo +"kg \n");
	        System.out.print("Patlýcan Kaç Kilo ? :"+patlicanKacKilo +"kg \n");


	        double armutHesap=armutFiyat*armutKacKilo;
	        double elmaHesap=elmaFiyat*elmaKacKilo;
	        double domatesHesap=domatesFiyat*domatesKacKilo;
	        double muzHesap=muzFiyat*muzKacKilo;
	        double patlicanHesap=patlicanFiyat*patlicanKacKilo;
	        double toplam = armutHesap+elmaHesap+domatesHesap+muzHesap+patlicanHesap;

	        System.out.println("Toplam Tutar :"+toplam+" TL");


	    }
}
