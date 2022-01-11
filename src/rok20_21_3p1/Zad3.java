package rok20_21_3p1;

import java.util.Arrays;

public class Zad3 {
    public static int[][] tablica(int[][] tab){
        int l = tab[0].length;
        int[][] temp = new int[tab.length][];
        boolean niereg = false;
        for (int[] t:tab){
            if (t.length>tab[0].length){
                niereg = true;
                l=t.length;
            }else if (t.length<tab[0].length){
                niereg = true;
            }
        }
        if (niereg){
            for(int i=0; i<tab.length; i++){
                temp[i] = new int[l];
                for (int j=0; j<l; j++){
                    if (j < tab[i].length){
                        temp[i][j] = tab[i][j];
                    }else{
                        temp[i][j] = tab[i][tab[i].length-1];
                    }
                }
            }
        }else{
            temp = transpozycja(tab);
        }
        return temp;
    }
    public static int[][] transpozycja(int[][] tab){
        int [][] wynik = new int[tab[0].length][tab.length];
        for(int i=0; i<tab.length;i++){
            for (int j=0; j<tab[0].length; j++){
                wynik[j][i]=tab[i][j];
            }
        }
        return wynik;
    }
}
