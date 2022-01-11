package rok20_21_3p1;

import java.util.Random;

public class Zad1 {
    public void punkty(int n, int x, int y){
        Random myrandom = new Random();
        int [][] tab = new int[n][2];
        for(int i=0; i<n; i++){
            tab[i][0]= myrandom.nextInt(x);
            tab[i][1]= myrandom.nextInt(y);

        }
        wyswietl(tab);
        najdalej(tab);
        trojkat(tab);
    }
    public void wyswietl(int[][] tab){
        for (int[] t: tab){
            System.out.println("("+t[0]+","+t[1]+")");
        }
    }
    public double[] najdalej(int[][] tab){
        double w=0;
        int index=0;
        int[] xy = new int[2];
        for (int i=0; i<tab.length;i++){
            int[] t=tab[i];
            double temp= Math.sqrt(Math.pow(t[0], 2) + Math.pow(t[1],2));
            if (temp>w){
                w=temp;
                xy[0]=t[0];
                xy[1]=t[1];
                index=i;
            }
        }
        System.out.println("("+xy[0]+","+xy[1]+") odleglosc "+w);
        return new double[]{xy[0], xy[1], w, index};
    }
    public void trojkat(int[][] tab){
        double[] p1 =najdalej(tab);
        tab[(int)p1[3]]= new int[]{0, 0, 0, 0};
        double[] p2 =najdalej(tab);
        double c = Math.sqrt(Math.pow(p1[0]-p2[0], 2) + Math.pow(p1[1]-p2[1],2));
        double p = 0.5*(p1[2]+p2[2]+c);
        double pole = Math.sqrt(p*(p-p1[2])*(p-p2[2])*(p-c));
        System.out.println(pole);
    }
}
