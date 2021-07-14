package Week3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        UcakRezervasyonSistemi thy = new THYRezervasyonSistemi(10);
	        UcakRezervasyonSistemi pegasus = new PegasusRezervasyonSistemi(10);
	        int islem;
	       while(true)
	        {
	            System.out.println("THY Rezervasyon Sistemine Hoþ Geldiniz!");
	            System.out.println("****************************************");
	            System.out.println("THY'dan bilet almak icin 1'e basýnýz:");
                System.out.println("Pegasus'dan bilet almak icin 2'ye basýnýz:"); 
                System.out.println("Çýkýþ için 3 'e basýnýz:"); 
                islem=scanner.nextInt();
               
	            switch(islem)
	            {
	           
	                case 1:
	                        thy.RezervasyonAl();
	                    
	                break;
	                case 2 :
	                        pegasus.RezervasyonAl();
	                break;
	                 case 3:
	                        System.out.println("Çýkýþ yapýlýyor. Yine bekleriz :)");
	                        scanner.close();
	                 break;
	              
	            }
// break;
	} 
	   
  
}


}