package rok20_21_k2;

import java.util.Comparator;

public class SortByAutor implements Comparator<Ksiazka> {

    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        int wynik = o1.autor.nazwisko.compareTo(o2.autor.nazwisko);
        if (wynik==0){
            wynik=o1.autor.imie.compareTo(o2.autor.imie);
            if (wynik==0){
                wynik=o1.tytul.compareTo(o2.tytul);
            }
        }
        return wynik;
    }
}
