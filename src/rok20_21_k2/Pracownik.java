package rok20_21_k2;

public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
    Wynagradzanie sposob;
    public Pracownik(String imie, String nazwisko, int wiek, int sposob){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
        setSposob(sposob);
    }

    public void setSposob(int sposob) {
        if (sposob==1){
            this.sposob= new PlacaEtat();
        }else{
            this.sposob= new PracaUmowa();
        }
    }

    public void wyswietl(double placa){
        System.out.println(sposob.oblicz(placa));
    }
}
