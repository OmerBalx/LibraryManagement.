package model;

public class KitapRoman extends Kitap {

    public KitapRoman(String ISBN, String baslik, String yazar, int yayinYili) {
        super(ISBN, baslik, yazar, yayinYili);
    }

    @Override
    public String getTur() {
        return "Roman";
    }
}
