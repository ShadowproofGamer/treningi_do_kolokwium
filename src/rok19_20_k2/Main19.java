package rok19_20_k2;

public class Main19 {
    public static void main(String[] args) {
        //zad1
        Ksiazka ks = new Ksiazka("Ignacy", "Wyszynski", "Bajki");
        Ksiazka ks2 = new Ksiazka("Adam", "Mickiewicz", "Pan Tadeusz");
        Ksiazka ks3 = new Ksiazka("Adam", "Mickiewicz", "Jakas Ksiazka");
        Zad1 biblioteka = new Zad1();
        biblioteka.addNewBook(ks);
        biblioteka.addNewBook(ks2);
        biblioteka.addNewBook(ks3);
        biblioteka.wyswietl("Adam", "Mickiewicz");

            //zad3
        Zad3 zad3 = new Zad3();
        Wlasciciel wl1 = new Wlasciciel("Jan", "Kloc");
        Wlasciciel wl2 = new Wlasciciel("Andrzej", "Koperek");
        SamochodCiezarowy sc1 = new SamochodCiezarowy(wl1, 2.8, "DW3775B", 120);
        SamochodCiezarowy sc2 = new SamochodCiezarowy(wl1, 3.2, "DW254KB", 160);
        SamochodOsobowy so1 = new SamochodOsobowy(wl1, 1.1, "DW32257", "Czerwony");
        SamochodCiezarowy sc3 = new SamochodCiezarowy(wl2, 3.6, "DW2596B", 210);
        SamochodOsobowy so2 = new SamochodOsobowy(wl2, 1.1, "DW78557", "Czarny");
        zad3.dodajPojazd(sc1);
        zad3.dodajPojazd(sc2);
        zad3.dodajPojazd(sc3);
        zad3.dodajPojazd(so1);
        zad3.dodajPojazd(so2);
        zad3.wyswietlRodzaj("Pojazd");
            //zad3.wyswietlRodzaj("SamochodOsobowy");
            //zad3.wyswietlRodzaj("SamochodCiezarowy");
        System.out.println("\n");
        zad3.wyswietlKolor("Czerwony");
        System.out.println("\n");
        zad3.wyswietlWlasciciel(wl1);
        System.out.println("\n");
        zad3.wyswietlNumer("DW32257");

        //zad2
        Zad2.zad2();

    }

}
