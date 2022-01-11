package rok20_21_k2;

public class PracaUmowa implements Wynagradzanie{

    @Override
    public double oblicz(double placa) {
        return (0.75*placa+300);
    }
}
