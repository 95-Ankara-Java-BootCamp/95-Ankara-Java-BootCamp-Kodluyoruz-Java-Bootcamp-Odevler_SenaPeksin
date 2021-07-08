package Week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Homework_1 {
	
	    static List<String> productsList = new ArrayList<>();
	  	static int totalPencil=0;
	  	static int totalEraser=0;
	  	static int totalBook=0;
	  	
	public static void main(String[] args) {
		
		 /**
         * Bir k�rtasiye d�kkan�na mal geliyor.
         * K�rtasiyeci kalem, silgi gibi malzemelerin kayd�n� sisteme girecek.
         * soru 1: Toplam ka� adet mal ald�.
         * soru 2: Hangi maldan ka� adet ald�.
         * soru 3: Ka� �e�it mal� var.
         */
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("-------  �r�n Stok Takibi ------- ");
		 System.out.println("�r�n girisini durdurmak i�in 'quit' kelimesini kullanabilirsiniz. ");
		 while(true){
	            System.out.print("L�tfen �r�n adi giriniz : ");
	            String product = scanner.nextLine();   
	            if( product.equals("kalem")|| product.equals("silgi")||product.equals("kitap")) {
	            	 AddProduct(product);
	            }
	            else if(product.equals("quit")) {
	            	 System.out.print("�r�n girisi durduruldu. " + "\n");
	            	//scanner.close();
	            	break;
	            }
	            else {
	            	 System.out.print("Sistemimizde �r�n girisi sadece kitap, kalem ve silgi i�indir."+ "\n");
	            	 break;
	            }
	      }
		
		 ShowList(productsList);
		 System.out.println("*********************");
		 System.out.println("Eklenen �r�n Sayisi : "+productsList.size());
		 System.out.println("G�ncel �r�n Listesi : "+ productsList);
		 ProductNumber(productsList);
		 ProductKind(productsList);
}
	 public static void AddProduct(String product) {  // add product method
			productsList.add(product);
	}

	 public static void ShowList(List<String> productsList ) {  //  product list method
		 for(String product1: productsList)
			{
				System.out.println("Eklenen �r�nler: " +product1);
			}
	}
	 public static void ProductNumber(List<String> productsList ) {  // �r�n say�s�
		 for(String product1: productsList)
			{
				if(product1.equals("kalem")) {
					 totalPencil++;
				}
				else if(product1.equals("silgi")) {
					totalEraser++;
				}
				else if(product1.equals("kitap")) {
					totalBook++;
				}
			}
		    System.out.println("G�ncel Kalem Sayisi: " +totalPencil+ " tanedir.");
			System.out.println("G�ncel Silgi Sayisi: " +totalEraser+" tanedir.");
			System.out.println("G�ncel Kitap Sayisi: " +totalBook+" tanedir.");
	}
	 public static void ProductKind(List<String> productsList ) {  // Product kind method
	        HashSet<String> ProductKind = new HashSet<>();
	        ProductKind.addAll(productsList);
	        System.out.println("G�ncel �r�n �esidi : " + ProductKind.size());
	 }
		
	 
	 
	 
	 
}

