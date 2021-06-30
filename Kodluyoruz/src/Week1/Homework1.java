package Week1;

public class Homework1 {
	public static void main(String args[])  
	{    
	 int sayi1=0;
	 int sayi2=1;
	 int sayi3;
	 
	 System.out.print(sayi1+" "+sayi2);
	    
	 for(int i=2;i<10;++i)  
	 {    
	 sayi3 = sayi1+sayi2;    
	  System.out.print(" "+sayi3);    
	  sayi1=sayi2;    
	  sayi2=sayi3;    
	 }    
}
}