package rok20_21_3p12;

import java.util.Comparator;

public class ComparatorTowar implements Comparator<Towar> {

    @Override
    public int compare(Towar o1, Towar o2) {
        return o1.nazwa.compareTo(o2.nazwa);
    }
}
