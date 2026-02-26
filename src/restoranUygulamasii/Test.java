package restoranUygulamasii;



public class Test {

	public static void main(String[] args) {
		Restoran restoran=new Restoran();//Restoran nesenesi oluşturur
		
		Yemek[] yemekler= {//yemek nesneleri oluşturur ve bir diziye ekler
				new Yemek("Ezogelin",100.0 , "çorba"),
				new Yemek("İskender",500.0 , "et yemeği"),
				new Yemek("Mantı",200.0 , "hamur işi")
		};
		
		Icecek[] icecekler= {//ıcecek neseneleri oluşturur ve bir diziye ekler
			    new Icecek("Kola",50.0 ,"" ),
				new Icecek("Su",30.0 , ""),
				new Icecek("Ice tea", 50.0, "")
				
		};
		
		for (Yemek yemek:yemekler){//yemek nesnelerini restoran menüsüne ekler
			restoran.menuyeUrunEkle(yemek);
		}
		
		for(Icecek icecek:icecekler) {//içecek nesnelerini restoran menüsüne ekler
			restoran.menuyeUrunEkle(icecek);
		}
		
		    Musteri musteri1 = new Musteri("Begüm");//müsteri nesneleri oluşturur
	        Musteri musteri2 = new Musteri("Emir");
	        Musteri musteri3 = new Musteri("Mira");

	        Garson garson1 = new Garson("Kerem");//garson nesneleri oluşturu
	        Garson garson2 = new Garson("Rüzgar");
	        Garson garson3 = new Garson("Alara");
	        
	    
	        restoran.musteriEkle(musteri1);//müsteri nesneleri restorana eklenir
	        restoran.musteriEkle(musteri2);
	        restoran.musteriEkle(musteri3);

	      
	        restoran.garsonEkle(garson1);//garson nesenleri restorana eklenir
	        restoran.garsonEkle(garson2);
	        restoran.garsonEkle(garson3);
	        
	        restoran.menuyuGoster();//Restoran menüsü konsola yazdırılır
	        
	        restoran.rasgeleSiparislerOlustur(10);//rasgele siparişler oluştutulur
	        
	       
	        
	        
	        

	}

}
