package rok20_21_k2;

import java.util.ArrayList;

public class Zad1 {
    ArrayList<Ksiazka> biblioteka = new ArrayList<>();
    public void wpisz(Ksiazka k){
        if (!biblioteka.contains(k))
        biblioteka.add(k);
    }
    public void wyswietlWgAutorow(){
        biblioteka.sort(new SortByAutor());
        System.out.println("Sortowanie wedlug autorow");
        int x=1;
        for (Ksiazka k:biblioteka){
            System.out.println(x+" "+k.autor.nazwisko+" "+k.autor.imie+" "+k.tytul);
            x++;
        }
    }
    public void wyswietlWgStron(){
        biblioteka.sort(new SortByPages());
        System.out.println("Sortowanie wedlug stron");
        int x=1;
        for (Ksiazka k:biblioteka){
            System.out.println(x+" "+k.autor.nazwisko+" "+k.autor.imie+" "+k.tytul+k.strony);
            x++;
        }
    }
    public void wyswietlPodanegoAutora(Autor a){
        System.out.println("Sortowanie wedlug autorow");
        int x=1;
        ArrayList<String> t = new ArrayList<>();
        for (Ksiazka k:biblioteka){
            if (k.autor.equals(a) && !t.contains(k.tytul)){
                System.out.println(x+" "+k.autor.nazwisko+" "+k.autor.imie+" "+k.tytul);
                t.add(k.tytul);
            }
            x++;
        }
    }
    public void wyswietlAutorow(){
        System.out.println("Wyswietlanie autorow");
        ArrayList<Autor> t = new ArrayList<>();
        for (Ksiazka k:biblioteka){
            if (!t.contains(k.autor)){
                t.add(k.autor);
            }
        }
        t.sort(new SortAutor());
        for (Autor a:t){
            System.out.println(a.nazwisko+" "+a.imie);
        }
    }
}
