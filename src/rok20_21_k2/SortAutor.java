package rok20_21_k2;

import java.util.Comparator;

public class SortAutor implements Comparator<Autor> {

    @Override
    public int compare(Autor o1, Autor o2) {
        int wynik=o1.nazwisko.compareTo(o2.nazwisko);
        if (wynik==0)wynik=o1.imie.compareTo(o2.imie);
        return wynik;
    }
}
