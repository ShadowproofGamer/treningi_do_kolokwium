package copy_paste;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public abstract class Scanner_basic {
    public static void funkcja(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz x");
        String nazwa = scan.nextLine();
        //String nazwa = scan.next(); /* skanuje tylko jedno slowo */
        //String nazwa = scan.nextInt();
        //String nazwa = scan.nextDouble();
        //etc


        char[] c = new char[nazwa.length()];
        nazwa.getChars(0, nazwa.length(), c, 0);
        //System.out.println(c);
    }
}
