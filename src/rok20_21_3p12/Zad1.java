package rok20_21_3p12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad1 {
    public static void zad1(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Towar> arr = new ArrayList<>();
        System.out.println("wpisz ilosc towarow do wprowadzenia");
        int j = scan.nextInt();
        for (int gg=0; gg<j ;gg++){
            String s;
            int i;
            double d;
            System.out.println("wpisz produkt:");
            s = scan.next();
            System.out.println("wpisz ilosc:");
            i = scan.nextInt();
            System.out.println("wpisz cene:");
            d = scan.nextDouble();
            arr.add(new Towar(s, i, d));
        }
        arr.sort(new ComparatorTowar());

        try(

                //BufferedWriter bw = new BufferedWriter(new FileWriter("src/rok20_21_3p12/txt.txt"));
                PrintWriter pw = new PrintWriter("src/rok20_21_3p12/txt.txt")
        ){
            pw.write("Wykaz towarów nr 12/2020 \n");
            pw.write("Lp. \tNazwa \tCena \tIlosc \tWartosc\n");
            int x=1;
            for (Towar a: arr){
                System.out.print(a);
                pw.printf("%-2d %14s %6.2f %4d %6.2f \n", x, a.nazwa, a.cena, a.ilosc, a.wartosc);
                System.out.printf("%-2d %12s %10.2f %4d %10.2f \n", x, a.nazwa, a.cena, a.ilosc, a.wartosc);
                x++;
            }
            pw.close();
        }catch (Exception e){
            System.out.println("Error"+e);
        }
    }
}
