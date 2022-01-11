package rok19_20_k2;

public class Wlasciciel {
    public String imie;
    public String nazwisko;

    public Wlasciciel(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Wlasciciel{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
