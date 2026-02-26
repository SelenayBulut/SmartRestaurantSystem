# Java Restoran Uygulaması
 
## Proje Hakkında
Bu proje, bir restoranın menü yönetimi, müşteri ve garson takibi ile siparişlerin oluşturulmasını ve dosyaya yazdırılmasını sağlayan **Java tabanlı bir uygulamadır**.  
Proje **nesne yönelimli programlama (OOP)** prensipleri kullanılarak geliştirilmiştir.

## Özellikler
- Menüye ürün ekleme ve menüyü görüntüleme  
- Müşteri ve garson yönetimi  
- Rastgele sipariş oluşturma  
- Sipariş bilgilerini ekrana yazdırma ve dosyaya kaydetme  

## Sınıf Özeti
- **Siparis:** Sipariş bilgilerini tutar, ekrana yazdırır ve dosyaya kaydeder.  
- **Restoran:** Menü, müşteri ve garson listelerini yönetir; rastgele sipariş oluşturur.  
- **Kisi:** Temel kişi bilgilerini tutar (ad).  
- **Musteri:** Kisi sınıfından türetilmiştir; sipariş verme işlevi sağlar.  
- **Garson:** Kisi sınıfından türetilmiştir; sipariş alma ve bilgileri ekrana yazdırma işlevi sağlar.  
- **Urun:** Ürünlerin temel özelliklerini tutar (ad, fiyat); soyut bir sınıftır.  
- **Yemek ve Icecek:** Urun sınıfından türetilmiş, ekstra özellikler içerir (tür, boyut).  

## Kurulum
1. Java JDK yükleyin  
2. Proje dosyalarını indirin veya klonlayın:  
```bash
git clone <repository-url>
