package przyklady;

import java.util.Random;
import java.io.*;
public class TablicaOdczyt{
   
    // odczyt tablicy liczb calkowitych z pliku
   public int[][] readTab(String plik){
        int w, k;
        int [][] wynik = null;
        String [] stab;    
       try(BufferedReader br = new BufferedReader(new FileReader(plik)))
       {
            br.readLine();  // tekst Macierz
            String s = br.readLine();
            s = s.trim();
            w = Integer.parseInt(s);
            s = br.readLine();
            s = s.trim();
            k = Integer.parseInt(s);
            System.out.println("w= " + w + " k= " + k);
            wynik = new int[w][k];
            for(int i=0; i<wynik.length; i++){
                String line = br.readLine();
                line = line.trim();
                stab = line.split("\\s+");
                for(int j=0; j<wynik[0].length; j++)
                    wynik[i][j] = Integer.parseInt(stab[j]);
                }
         } catch(IOException e){ System.out.println("I/O error!"); }
       return wynik;
      }
      
   public void wyswietlTab(int[][] tab){
          System.out.println("Tablica odczytana");
           for(int i=0; i<tab.length; i++){
               for(int j=0; j<tab[0].length; j++)
                   System.out.printf("%6d", tab[i][j]);
              System.out.println();
                }
            }
   
   public static void main(String[]args){
          String p = "tablica.txt";
          TablicaOdczyt to = new TablicaOdczyt();
          int[][] t = to.readTab( p );
          to.wyswietlTab(t);
        }          
}
