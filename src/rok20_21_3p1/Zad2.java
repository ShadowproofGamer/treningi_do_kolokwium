package rok20_21_3p1;

import java.util.Scanner;

public class Zad2 {
    public static void punkty(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz slowo:");
        String s = scan.next();
        char[] c = s.toCharArray();
        char[] p1 ={'a', 'e', 'i', 'n', 'o', 'r', 's', 'w', 'z' };
        char[] p2 ={ 'c', 'd', 'k', 'l', 'm', 'p', 't', 'b'};
        char[] p3 ={'g', 'h', 'j', 'u', 'y' };
        char[] p5 ={ 'f', 'x', 'q', 'v' };

        int wynik = 0;
        for (char ch : c){
            for (char c1:p1){
                if (c1==ch){
                    wynik+=1;
                    break;
                }
            }
            for (char c1:p2){
                if (c1==ch){
                    wynik+=2;
                    break;
                }
            }
            for (char c1:p3){
                if (c1==ch){
                    wynik+=3;
                    break;
                }
            }
            for (char c1:p5){
                if (c1==ch){
                    wynik+=5;
                    break;
                }
            }
        }
    System.out.println(wynik);
    }
}
