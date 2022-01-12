package rok20_21_k2;

public class Zad3 {
    public Zad3(){
        Pracownik p1 = new Pracownik("Stig", "Malutki", 32, 1);
        Pracownik p2 = new Pracownik("Kamil", "Cienki", 21, 2);
        Pracownik p3 = new Pracownik("Ernest", "Kominek", 71, 1);
        double x = 1700;
        p1.wyswietl(x);
        p2.wyswietl(x);
        p3.wyswietl(x);
        p3.setSposob(2);
        p3.wyswietl(x);
    }
}
