package model;

public class KitapTarih extends Kitap {

    public KitapTarih(String ISBN, String baslik, String yazar, int yayinYili) {
        super(ISBN, baslik, yazar, yayinYili);
    }

    @Override
    public String getTur() {
        return "Tarih";
    }
}
