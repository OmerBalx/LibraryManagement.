package model;

public class KitapBilim extends Kitap {

    public KitapBilim(String ISBN, String baslik, String yazar, int yayinYili) {
        super(ISBN, baslik, yazar, yayinYili);
    }

    @Override
    public String getTur() {
        return "Bilim";
    }
}
