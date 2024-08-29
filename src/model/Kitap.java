package model;

public abstract class Kitap {
    private String ISBN;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private Durum durum;

    public Kitap(String ISBN, String baslik, String yazar, int yayinYili) {
        this.ISBN = ISBN;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = Durum.ODUNC_ALINABILIR; // Varsayılan durum
    }

    // Getter ve Setter metodları
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    public abstract String getTur();
}
