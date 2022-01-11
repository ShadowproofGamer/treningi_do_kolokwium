package rok19_20_k2;

public class Ksiazka implements Comparable<Ksiazka> {
    public String imieAutora;
    public String nazwiskoAutora;
    public String tytul;

    public Ksiazka(String imieAutora, String nazwiskoAutora, String tytul) {
        this.imieAutora = imieAutora;
        this.nazwiskoAutora = nazwiskoAutora;
        this.tytul = tytul;
    }

    public int compareTo(Ksiazka k) {
        int result = this.nazwiskoAutora.compareTo(k.nazwiskoAutora);
        if (result == 0) {
            result = this.imieAutora.compareTo(k.imieAutora);
            if (result == 0) {
                result = this.tytul.compareTo(k.tytul);
            }

        }
        return result;
    }

}
