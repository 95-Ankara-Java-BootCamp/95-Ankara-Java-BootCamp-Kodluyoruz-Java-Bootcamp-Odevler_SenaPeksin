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
         * Bir kýrtasiye dükkanýna mal geliyor.
         * Kýrtasiyeci kalem, silgi gibi malzemelerin kaydýný sisteme girecek.
         * soru 1: Toplam kaç adet mal aldý.
         * soru 2: Hangi maldan kaç adet aldý.
         * soru 3: Kaç çeþit malý var.
         */
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("-------  Ürün Stok Takibi ------- ");
		 System.out.println("Ürün girisini durdurmak için 'quit' kelimesini kullanabilirsiniz. ");
		 while(true){
	            System.out.print("Lütfen ürün adi giriniz : ");
	            String product = scanner.nextLine();   
	            if( product.equals("kalem")|| product.equals("silgi")||product.equals("kitap")) {
	            	 AddProduct(product);
	            }
	            else if(product.equals("quit")) {
	            	 System.out.print("Ürün girisi durduruldu. " + "\n");
	            	//scanner.close();
	            	break;
	            }
	            else {
	            	 System.out.print("Sistemimizde ürün girisi sadece kitap, kalem ve silgi içindir."+ "\n");
	            	 break;
	            }
	      }
		
		 ShowList(productsList);
		 System.out.println("*********************");
		 System.out.println("Eklenen Ürün Sayisi : "+productsList.size());
		 System.out.println("Güncel Ürün Listesi : "+ productsList);
		 ProductNumber(productsList);
		 ProductKind(productsList);
}
	 public static void AddProduct(String product) {  // add product method
			productsList.add(product);
	}

	 public static void ShowList(List<String> productsList ) {  //  product list method
		 for(String product1: productsList)
			{
				System.out.println("Eklenen Ürünler: " +product1);
			}
	}
	 public static void ProductNumber(List<String> productsList ) {  // ürün sayýsý
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
		    System.out.println("Güncel Kalem Sayisi: " +totalPencil+ " tanedir.");
			System.out.println("Güncel Silgi Sayisi: " +totalEraser+" tanedir.");
			System.out.println("Güncel Kitap Sayisi: " +totalBook+" tanedir.");
	}
	 public static void ProductKind(List<String> productsList ) {  // Product kind method
	        HashSet<String> ProductKind = new HashSet<>();
	        ProductKind.addAll(productsList);
	        System.out.println("Güncel Ürün Çesidi : " + ProductKind.size());
	 }
		
	 
	 
	 
	 
}

