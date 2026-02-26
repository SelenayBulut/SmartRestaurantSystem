package restoranUygulamasii;


import java.io.PrintWriter;

import java.util.Date;

public class Siparis {
	private Yemek yemek;
	private Icecek icecek;
	public Garson garson;
	private Musteri musteri;
	public Date tarih;
	public static long siparis_no=1;
	
	public Yemek getYemek() {//getter
		return yemek;
	}
	
	public void setYemek (Yemek yemek) {//setter
		this.yemek=yemek;
	}
	
	public Icecek getIcecek() {
		return icecek;
	}
	
	public void setIcecek(Icecek icecek) {
		this.icecek=icecek;
	}
	
	
	public Musteri getMusteri() {
		return musteri;
	}
	
	public void setMusteri(Musteri musteri) {
		this.musteri=musteri;
	}
	
	public long getSiparisNo() {
		return siparis_no;
	}
	
	
	public Siparis(Yemek yemek,Icecek icecek,Garson garson,Musteri musteri, Date tarih) {
		this.yemek=yemek;
		this.icecek=icecek;
		this.garson=garson;
		this.musteri=musteri;
		this.tarih=tarih;
	}
	public void siparisBilgisi() {//siparis bilgilerini ekrana yazdırır
		System.out.println("Siparis bilgileri:");
		
		if(yemek!=null) {// Eğer yemek nesnesi null değilse, yemeğin adını ve fiyatını yazdırır
		System.out.println("Yemek:"+yemek.getAd()+ "-" + yemek.getFiyat());
		}
		else {
			System.out.println("Yemek:Bos-0.0");
		}
		
		if(icecek!=null) {
		System.out.println("İçecek:"+icecek.getAd()+ "-" + icecek.getFiyat());
		}
		else {
			System.out.println("İçecek:Bos-0.0");
		}
		
		System.out.println("Garson:" + garson.getAd());
		
		System.out.println("Müşteri:"+musteri.getAd());
		
		System.out.println("Zaman:" + tarih);//siparis alınma tarihini ekrana yazdırır.
		
		System.out.println("Siparis alındı.");
		
		System.out.println("   ");
		
		
	}
	public void siparisYazdir(PrintWriter yazici ) {//siparis bilgilerini dosyaya yazdırma
		 yazici.println("Sipariş Bilgileri:");
		    yazici.println("Yemek: " + (yemek != null ? yemek.getAd() + " - " + yemek.getFiyat() : "Bos-0.0"));
		    yazici.println("İçecek: " + (icecek != null ? icecek.getAd() + " - " + icecek.getFiyat() : "Bos-0.0"));
		    yazici.println("Garson: " + garson.getAd());
		    yazici.println("Müşteri: " + musteri.getAd());
		    yazici.println("Zaman: " + tarih);
		    
		
	            }
	            
	        }
	
	
	








