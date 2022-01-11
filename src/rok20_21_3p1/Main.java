package rok20_21_3p1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Zad1 zad1 = new Zad1();
        //zad1.punkty(100, 30, 20);
//
        //
        //Zad2.punkty();

        int[][] tab = {{1,3,2,4,5},{1,4,2},{3,2,1}};
        int[][] tab2 = {{1,3,2,4,5},{1,4,2, 0, 4},{3,2,1, 3, 3}};
        System.out.println(Arrays.deepToString(tab));
        System.out.println(Arrays.deepToString(tab2));
        System.out.println(Arrays.deepToString(Zad3.tablica(tab)));
        System.out.println(Arrays.deepToString(Zad3.tablica(tab2)));

    }
}
