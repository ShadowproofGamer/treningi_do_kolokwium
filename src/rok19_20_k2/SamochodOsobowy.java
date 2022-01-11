package rok19_20_k2;

public class SamochodOsobowy extends Pojazd {
    public String kolor;
    public SamochodOsobowy(Wlasciciel wl, double pojemnosc, String numer, String kolor) {
        super(wl, pojemnosc, numer);
        this.kolor=kolor;
    }
    @Override
    public String toString() {
        return "SamochodOsobowy{" +
                "kolor=" + kolor +
                ", wlasciciel=" + wlasciciel +
                ", pojemnosc=" + pojemnosc +
                ", numer='" + numer + '\'' +
                '}';
    }
}
