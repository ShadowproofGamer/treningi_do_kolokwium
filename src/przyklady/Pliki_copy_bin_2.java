package przyklady;

import java.io.*;
import java.util.*;
public class Pliki_copy_bin_2{

  // kopiowanie binarne po jednym bajcie
  public void copy1(String p1, String p2){
     int ile =0;
     int c;
     try(FileInputStream fis = new FileInputStream(p1);
         FileOutputStream fos = new FileOutputStream(p2);){  
     while((c = fis.read()) != -1) {
       fos.write(c);
       ile ++;
    }
  }catch(IOException e){
   System.out.println("IOException " + e);
  }
   System.out.println("Skopiowano " + ile + " bajtow");
 }
  // kopiowanie binarne z wlasnym buforem
  public void copy2(String p1, String p2){
     int ile =0;
     int c;
     byte[] bufor = new byte[512];
     try(FileInputStream fis = new FileInputStream(p1);
         FileOutputStream fos = new FileOutputStream(p2);){  
     while((c = fis.read(bufor)) != -1) {
       fos.write(bufor);
       ile += c;;
    }
  }catch(IOException e){
   System.out.println("IOException " + e);
  }
   System.out.println("Skopiowano " + ile + " bajtow");
 }
     
  public static void main(String[]args){
      Pliki_copy_bin_2 pcb = new Pliki_copy_bin_2();
      String f1="zima1.jpg";
      String f2="zima2.jpg";
      //pcb.copy1(f1, f2);
      pcb.copy2(f1, f2);
      
    }
    
}
