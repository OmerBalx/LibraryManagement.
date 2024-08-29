package model;

import service.IUye;
import java.util.ArrayList;
import java.util.List;

public class Uye implements IUye {
    private String isim;
    private List<Kitap> oduncAlinanKitaplar;

    public Uye(String isim) {
        this.isim = isim;
        this.oduncAlinanKitaplar = new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    @Override
    public void kitapOduncAl(Kitap kitap) {
        if (kitap.getDurum() == Durum.ODUNC_ALINABILIR) {
            kitap.setDurum(Durum.ODUNC_VERILDI);
            oduncAlinanKitaplar.add(kitap);
            System.out.println(isim + " adlı üye " + kitap.getBaslik() + " kitabını ödünç aldı.");
        } else {
            System.out.println("Kitap ödünç alınamaz.");
        }
    }

    @Override
    public void kitapIadeEt(Kitap kitap) {
        if (oduncAlinanKitaplar.remove(kitap)) {
            kitap.setDurum(Durum.ODUNC_ALINABILIR);
            System.out.println(isim + " adlı üye " + kitap.getBaslik() + " kitabını iade etti.");
        } else {
            System.out.println("Kitap iade edilemez.");
        }
    }

    @Override
    public void oduncAlinanKitaplariGoruntule() {
        System.out.println(isim + " adlı üyenin ödünç aldığı kitaplar:");
        for (Kitap kitap : oduncAlinanKitaplar) {
            System.out.println("- " + kitap.getBaslik());
        }
    }
}
