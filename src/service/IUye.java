package service;

import model.Kitap;

public interface IUye {
    void kitapOduncAl(Kitap kitap);
    void kitapIadeEt(Kitap kitap);
    void oduncAlinanKitaplariGoruntule();
}