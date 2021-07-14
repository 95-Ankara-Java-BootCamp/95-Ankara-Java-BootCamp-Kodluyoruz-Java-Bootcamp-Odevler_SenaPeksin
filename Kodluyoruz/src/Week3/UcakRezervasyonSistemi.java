package Week3;

import java.util.Scanner;

public abstract class UcakRezervasyonSistemi {
	Scanner scanner = new Scanner(System.in);
	private int koltukSayisi;
	protected boolean koltuklar[] ;
	
	public UcakRezervasyonSistemi() {
		  setKoltukSayisi(10);
	}
	
	public UcakRezervasyonSistemi(int koltukSayisi) {
		if (koltukSayisi < 10) {
			System.out.println("Koltuk sayisi minimum 10 olmal�d�r.");
			this.koltukSayisi = 10;
		} else {
			this.koltukSayisi = koltukSayisi;
		}
		
		this.koltuklar = new boolean[this.koltukSayisi];
	}
	
	public boolean ekonomiDoluMu() {	     
	     for (int i = 5; i < koltuklar.length; i++) {
				if (koltuklar[i] == false) {
					System.out.println("Ekonomi s�n�f�m�zda bo� koltuklar�m�z mevcuttur.");
					return false;
				}
			}
	 	System.out.println("Ekonomi s�n�f�m�zda bo� koltuk kalmam��t�r");
			return true;
	}
	
	 
	public boolean businessDoluMu() {
		for (int i = 0; i < 5; i++) {
			if (koltuklar[i] == false) {
				 System.out.println("Business s�n�f�m�zda bo� koltuklar�m�z mevcuttur.");
				return false;
			} 
		}
		System.out.println("Business s�n�f�m�zda bo� koltuk kalmam��t�r");
		return true;
		
	}
	
	public boolean ucakDoluMu() {
        if (businessDoluMu() == true && ekonomiDoluMu() == true) {
         	System.out.println("U�a��m�zda bo� koltuk kalmam��t�r.");
        	return true;
		}
        System.out.println("U�a��m�zda bo� koltuklar�m�z mevcuttur.");
		return false;
	}
	
	public abstract void RezervasyonAl();
	
	
	
	//getter - setter for koltukSayisi
	public int getKoltukSayisi() {
		return koltukSayisi;
	}
	public void setKoltukSayisi(int koltukSayisi) {
		this.koltukSayisi= koltukSayisi;
		
	}


	
	
}
