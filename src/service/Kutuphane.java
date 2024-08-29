package service;

import model.Kitap;
import model.Uye;
import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitaplar;
    private List<Uye> uyeler;

    public Kutuphane() {
        this.kitaplar = new ArrayList<>();
        this.uyeler = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
    }

    public void kutuphaneDurumuGoruntule() {
        System.out.println("Kütüphanedeki Kitaplar:");
        for (Kitap kitap : kitaplar) {
            System.out.println("- " + kitap.getBaslik() + " (" + kitap.getTur() + ") - Durum: " + kitap.getDurum());
        }
        System.out.println("\nKütüphanedeki Üyeler:");
        for (Uye uye : uyeler) {
            System.out.println("- " + uye.getIsim());
        }
    }
}
