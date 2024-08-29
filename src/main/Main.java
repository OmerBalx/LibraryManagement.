package main;

import model.*;
import service.Kutuphane;

public class Main {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();

        // Kitaplar
        Kitap bilimKitabi = new KitapBilim("12345", "Sapiens", "Yuval Noah Harari", 2011);
        Kitap romanKitabi = new KitapRoman("67890", "Kürk Mantolu Madonna", "Sabahattin Ali", 1943);
        Kitap tarihKitabi = new KitapTarih("54321", "Nutuk", "Mustafa Kemal Atatürk", 1927);

        // Kitapları kütüphaneye ekleyelim
        kutuphane.kitapEkle(bilimKitabi);
        kutuphane.kitapEkle(romanKitabi);
        kutuphane.kitapEkle(tarihKitabi);

        // Üyeler
        Uye uye1 = new Uye("UYE 1");
        Uye uye2 = new Uye("UYE 2");

        // Üyeleri kütüphaneye ekleyelim
        kutuphane.uyeEkle(uye1);
        kutuphane.uyeEkle(uye2);

        // Ali'nin kitap ödünç alma işlemi
        uye1.kitapOduncAl(bilimKitabi);
        uye1.kitapOduncAl(romanKitabi);

        // Kütüphane durumunu görüntüleyelim
        kutuphane.kutuphaneDurumuGoruntule();

        // Ali'nin ödünç aldığı kitapları görüntüleyelim
        uye1.oduncAlinanKitaplariGoruntule();

        // Ali'nin kitap iade işlemi
        uye1.kitapIadeEt(bilimKitabi);

        // Kütüphane durumunu tekrar görüntüleyelim
        kutuphane.kutuphaneDurumuGoruntule();
    }
}
