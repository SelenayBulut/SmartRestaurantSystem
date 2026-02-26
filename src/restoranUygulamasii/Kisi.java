package restoranUygulamasii;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Kisi {
	String ad;
	
	Kisi() {//no-arg constructor
		
	}
	
	public Kisi(String ad){
		this.ad=ad;
	}
	
	public String getAd(){// kisi adını döndürür
		return ad;
	}
}
	
	class Musteri extends Kisi{//musteri classı kisi sınıfından kalıtım alır
		
		public Musteri(String ad) {
			super(ad);//üst sınıftan kalıtımla alma
			
		}
		
		public Siparis siparisVer(Yemek yemek,Icecek icecek) {
			
		    return new Siparis(yemek, icecek, null, null, null );//yeni siparis nesnesi oluşturur
			
			
		}
	}
	
	class Garson extends Kisi{
		
		public Garson() {//no arg constructor
			
		}
		public Garson(String ad) {//parametreli constructor üst sınıfın yapıcı metdounu alıyor.
			super(ad);
			
		}
		
		
		public void siparisAl(Siparis s,ArrayList<Siparis>siparisler) {
			siparisler.add(s);//siparisi listeye ekler
		    s.siparisBilgisi();//siparis bilgilerini ekrana yazdırır.
		    
		   
		   
		    String klasorAdi = "Siparisler";//klasöre isim verir
		    File klasor = new File(klasorAdi);
		    
		    if (!klasor.exists()) {//klasör yoksa oluşturur
		        klasor.mkdir();
		    }
		    
		    for (int i = 0; i < siparisler.size(); i++) {//tüm siparisler için dosya oluşturur ve bilgileri yazar
		        Siparis siparis = siparisler.get(i);
		        String dosyaAdi = klasorAdi + File.separator + "siparis_" + (i + 1) + ".txt";//dosya adı klasör adı ve sipariş numarasından oluşur
		        
		        try (PrintWriter yazici = new PrintWriter(new FileWriter(dosyaAdi))) {
		            siparis.siparisYazdir(yazici); // Siparis bilgilerini dosyaya yazdırır
		        } catch (IOException e) {
		            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
		        }
			
		    }
		}
	}
			
			
		
			
			
		 
		
			
	
		
		
	


