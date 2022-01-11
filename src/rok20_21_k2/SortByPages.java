package rok20_21_k2;

import java.util.Comparator;

public class SortByPages implements Comparator<Ksiazka> {

    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        if (o1.strony> o2.strony){
            return 1;
        }else if (o1.strony < o2.strony){
            return -1;
        }
        return 0;
    }
}
