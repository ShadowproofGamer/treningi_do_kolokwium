package copy_paste;

import java.util.Arrays;

public abstract class Zmiana_typu {
    public static void zmiana(){
        //String na char[]
        String s1 = "jakis napis";
        char[] c = new char[s1.length()];
        s1.getChars(0, s1.length(), c, 0);
        // or simply     c = s1.toCharArray();

        //String na byte[]
        String s6 = "jakis napis";
        byte[] b = s6.getBytes();

        //String na int
        String s2 = "12";
        int i = Integer.parseInt(s2);

        //String na double
        String s3 = "12.34521";
        double d = Double.parseDouble(s3);

        //String na float
        String s4 = "12.34521";
        float f = Float.parseFloat(s4);

        //String na String[]
        String s5 = "Kalin Marcel Michal Jakub Andrzej 32112 ,";
        String[] sarr = s5.split("\\s+");

        //char[] to String
        char[] c2 = {'a', 'b', 'c'};
        String str = new String(c2);



        //System.out.println(Arrays.toString(sarr));
        //System.out.println(sarr[0]);


    }

}
