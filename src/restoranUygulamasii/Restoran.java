package restoranUygulamasii;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Restoran {
	private ArrayList<Urun> menu=new ArrayList<Urun>();
	private ArrayList<Siparis> siparisler=new ArrayList<Siparis>();
	private ArrayList<Musteri> musteriler=new ArrayList<Musteri>();
	private ArrayList<Garson> garsonlar=new ArrayList<Garson>();
	
	public Restoran() {
		
	}
	
	
	
	
	public void menuyeUrunEkle(Urun urun) {//menüye ürün eklemek için kullanılan metod
		menu.add(urun);
		
	}
	public void musteriEkle(Musteri musteri) {//yeni müşteri ekleyen metod
		musteriler.add(musteri);
		
	}
	public void garsonEkle(Garson garson) {//yeni garson ekler 
		garsonlar.add(garson);
		
	}
	public void menuyuGoster() {//menüyü konsola yazdırır
		System.out.println("-----MENÜ-----");
		for(Urun urun:menu) {
			urun.urunBilgisi();
			System.out.println("----------------");
		}
		
	}
	
	public void rasgeleSiparislerOlustur(int sayi) {// verilen sayi kadar rastgele siparişler oluşturur
		Random random =new Random();
		String[] secimler = {"sadece yemek", "sadece içecek", "yemek & içecek"};
		
		for (int i = 0; i <sayi; i++) {
			//rasgele musteri garson yemek seçilir get ile alınır
			Musteri musteri = musteriler.get(random.nextInt(musteriler.size()));
            Garson garson = garsonlar.get(random.nextInt(garsonlar.size()));
            Yemek yemek = null;
            Icecek icecek = null;
            Date tarih = new Date(); 
            
            String secim = secimler[random.nextInt(secimler.length)];//rasgele seçimler arasından seçim yapılır

           
            //seçilen seceneğe göre yemek, içecek ya da yemek ve içecek secilir
            if (secim.equals("sadece yemek") || secim.equals("yemek & içecek")) {//hangisinin seçildiğini belirlemek için
                if (!menu.isEmpty()) {
                    Urun urun = menu.get(random.nextInt(menu.size()));
                    if (urun instanceof Yemek) {//verilen objenin o sınıfa ait olup olmadığı belirlenir
                        yemek = (Yemek) urun;
                    }
                }
            }

           
            if (secim.equals("sadece içecek") || secim.equals("yemek & içecek")) {
                if (!menu.isEmpty()) {
                    Urun urun = menu.get(random.nextInt(menu.size()));
                    if (urun instanceof Icecek) {
                        icecek = (Icecek) urun;
                    }
                }
            }

            
            if (yemek == null && icecek == null) {//yemek ve içeceğin aynı anda boş olması durumunu engellemek amaçlanır
            	sayi=sayi+1;// bu kısım çalıştrıldığında o sipariş verilmiş gibi davranılmaması için kullandım.
                continue; // diğer siparişi oluşturmak için sonraki adıma geçer
            }
           
            //siparis garsona iletilir
            Siparis siparis = new Siparis(yemek, icecek, garson, musteri, tarih);
            garson.siparisAl(siparis, siparisler);
            siparisler.add(siparis); 
           
            }
        }
  }



                  


