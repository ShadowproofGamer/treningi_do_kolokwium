package przyklady;

import java.util.Random;
import java.io.*;
public class TablicaZapis{
    
    public int[][] generuj(int w, int k, int z){
        int[][]t = new int[w][k];
        Random r = new Random();
        for(int i=0; i<t.length; i++)
           for(int j=0; j<t[0].length; j++)
               t[i][j] = r.nextInt(z);
        return t;
       }      
        
     // zapis tablicy liczb calkowitych do pliku
     public void writeTab(int[][]tab, String plik){
      try( PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tablica.txt"))))
        {
            pw.printf("Macierz %n");
            pw.printf("%4d %n", tab.length);
            pw.printf("%4d %n", tab[0].length);
            for(int i=0; i<tab.length; i++){
               for(int j=0; j<tab[0].length; j++)
                   pw.printf("%6d", tab[i][j]);
                   pw.println();
                }
          }catch(IOException e){ System.out.println("I/O error!"); }
    }
    
    public static void main(String[]args){
        String p = "tablica.txt";
        TablicaZapis tz = new TablicaZapis();
        int[][] tab = tz.generuj(4,6,100);
        tz.writeTab(tab,p);
    }
    
}
