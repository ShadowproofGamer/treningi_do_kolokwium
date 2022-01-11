package rok20_21_k2;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class Ksiazka {
    Autor autor;
    String tytul;
    int strony;
    int numer;
    public Ksiazka(Autor autor, String tytul, int strony, int numer){
        this.autor=autor;
        this.strony=strony;
        this.tytul=tytul;
        this.numer=numer;
    }

}
