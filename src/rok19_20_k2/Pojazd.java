package rok19_20_k2;

public abstract class Pojazd {
    public Wlasciciel wlasciciel;
    public double pojemnosc;
    public String numer;

    public Pojazd(Wlasciciel wl, double pojemnosc, String numer) {
        this.numer = numer;
        this.wlasciciel = wl;
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "wlasciciel=" + wlasciciel +
                ", pojemnosc=" + pojemnosc +
                ", numer='" + numer + '\'' +
                '}';
    }
}
