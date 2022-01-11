package rok19_20_k2;

import java.util.ArrayList;

public class Zad3 {
    ArrayList<Pojazd> pojazdy = new ArrayList<>();
    public void wyswietlRodzaj(String rodzaj){
        if (rodzaj.equals("SamochodOsobowy")){
            for (Pojazd p: pojazdy){
                if (p instanceof SamochodOsobowy){
                    System.out.println(p);
                }
            }
        }
        else if (rodzaj.equals("SamochodCiezarowy")){
            for (Pojazd p: pojazdy){
                if (p instanceof SamochodCiezarowy){
                    System.out.println(p);
                }
            }
        }
        else if (rodzaj.equals("Pojazd")){
            for (Pojazd p: pojazdy){
                System.out.println(p);
            }
        }
    }
    public void dodajPojazd(Pojazd p){
        if (!pojazdy.contains(p)){
            pojazdy.add(p);
        }
    }
    public void wyswietlWlasciciel(Wlasciciel wl){
        for (Pojazd p:pojazdy){
            if (p.wlasciciel == wl){
                System.out.println(p);
            }
        }
    }
    public void wyswietlKolor(String kolor){
        for (Pojazd p:pojazdy){
            if (p instanceof SamochodOsobowy){
                if (((SamochodOsobowy) p).kolor.equals(kolor)) System.out.println(p);
            }
        }
    }
    public void wyswietlNumer(String numer){
        for(Pojazd p:pojazdy){
            if (p.numer.equals(numer)) System.out.println(p);
        }
    }
}

