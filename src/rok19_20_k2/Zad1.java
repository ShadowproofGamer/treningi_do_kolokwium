package rok19_20_k2;

import java.util.Iterator;
import java.util.TreeSet;

public class Zad1 {
    TreeSet<Ksiazka> zbior = new TreeSet<>();
    public void addNewBook(Ksiazka k){
        zbior.add(k);
    }
    public void wyswietl(String imie, String nazwisko){
       Iterator<Ksiazka> zi = zbior.iterator();
       boolean all = true;
       while(all){
           if (zi.hasNext()){
               Ksiazka ksi = zi.next();
               if(ksi.imieAutora.equals(imie) && ksi.nazwiskoAutora.equals(nazwisko))
                   System.out.println(ksi.tytul);
           }else all=false;
       }

    }

}
