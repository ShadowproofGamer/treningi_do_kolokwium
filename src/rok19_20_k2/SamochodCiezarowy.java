package rok19_20_k2;

public class SamochodCiezarowy extends Pojazd {
    public int ladownosc;

    public SamochodCiezarowy(Wlasciciel wl, double pojemnosc, String numer, int ladownosc) {
        super(wl, pojemnosc, numer);
        this.ladownosc=ladownosc;
    }

    @Override
    public String toString() {
        return "SamochodCiezarowy{" +
                "ladownosc=" + ladownosc +
                ", wlasciciel=" + wlasciciel +
                ", pojemnosc=" + pojemnosc +
                ", numer='" + numer + '\'' +
                '}';
    }
}
