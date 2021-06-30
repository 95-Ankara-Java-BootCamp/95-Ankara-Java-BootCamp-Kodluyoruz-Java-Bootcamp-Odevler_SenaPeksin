package Week1;

public class Homework_2 {
	
public static void main(String args[])  
{
		
/*
* Sýnav Notlarýmýz 90-100 => AA
*85-90 => BA
*75-85 => BB
*65-75 => CB
*60-65 => CC
*55-60 => DC
*45-55 => DD
*45’ten azsa FF olsun
**/
	int sinavNotu= 50;
	System.out.println("Sýnav notunuz : " + sinavNotu);
	
	 
	 if(sinavNotu>=90 && sinavNotu<=100) {
         System.out.println("Tebrikler, AA ile geçtiniz");
       }
	 else if(sinavNotu>=85 && sinavNotu<90){
         System.out.println("Tebrikler, BA ile geçtiniz");
       }
	 else if(sinavNotu>=75 && sinavNotu<85){
         System.out.println("Tebrikler, BB ile geçtiniz");
       }
	 else if(sinavNotu>=65 && sinavNotu<75){
         System.out.println("Tebrikler, CB ile geçtiniz");
       }
	 else if(sinavNotu>=60 && sinavNotu<65){
         System.out.println("Tebrikler, CC ile geçtiniz");
       }
	 else if(sinavNotu>=55 && sinavNotu<60){
         System.out.println("Tebrikler, DC ile geçtiniz");
       }
	 else if(sinavNotu>=45 && sinavNotu<55){
         System.out.println("Tebrikler, DD ile zar zor  geçtiniz");
       }
	 else if(sinavNotu<45) {
		 System.out.println("Malesef kaldýnýz.. ");
	 }
	 else{

         System.out.println("Sýnav Notunuz 0-100 arasý olmalýdýr");

       }
		
}
}

