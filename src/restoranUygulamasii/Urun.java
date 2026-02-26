package restoranUygulamasii;

import java.util.Random;

public abstract class Urun {
	protected String ad;//urun ad ve fiyatı korunur
	protected double fiyat;
	
	Urun(){
		
	}
	
	public Urun(String ad,double fiyat) {
		this.ad=ad;
		this.fiyat=fiyat;
		
	}
	public String getAd() {//ürünün adını döndüren method
		return ad;
		
	}
	public double getFiyat() {//ürünün fiyatını döndüren metod
		return fiyat;
		
	}
	public abstract void urunBilgisi();

}
	class Yemek extends Urun{//urun sınıfından türetilmiş yemek sınıfı
		private String tur;//Yemek için belirtilen ek özellik
		
		public Yemek(String ad,double fiyat,String tur) {
			super(ad,fiyat);
			this.tur=tur;
			
		}
		
		public void urunBilgisi() {//ürün bilgilerini yazdırır
			System.out.println("Yemek Adı:"+ad);
			System.out.println("Fiyatı:"+ fiyat);
			System.out.println("Tür:"+ tur);
			
		}
		
	}
	
	class Icecek extends Urun{//ıcacek sınıfı urun sınıfından türetilmiştir
		private String boy;//ıcecek boyutunu belirten ek özellik
		
		public Icecek(String ad,double fiyat,String boy) {
			super(ad,fiyat);
			this.boy=boy;
			
		}
		public void urunBilgisi() {//urun bilgilerini yazdıran metot
			System.out.println("İçecek Adı:"+ad);
			System.out.println("Fiyatı:"+ fiyat);
			System.out.println("Boyut:"+ boy);
		}
		public void rastgeleboy() {//rastgele boyut seçme metodu
			String[] secenekler= {"kutu","litrelik","küçük"};//boyut seçeneklerini belirler
			Random random =new Random();//ragele seçmek için random nesnesi oluşturulur
			boy=secenekler[random.nextInt(secenekler.length)];//rasgele boyut seçilir ve boy değişkenine atanır.
		}
	}
	

