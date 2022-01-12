package rok20_21_k2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad2 {
    public static void zad2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz nazwę wejściowego pliku z rozszerzeniem (np. plik.txt)");
        String nazwa = scan.next();
        System.out.println("wpisz nazwę wyjściowego pliku z rozszerzeniem (np. plik.txt)");
        String nazwaOut = scan.next();
        try(
                BufferedReader br = new BufferedReader(new FileReader("src/rok20_21/"+nazwa));
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/rok20_21/"+nazwaOut));
                ){
            String naglowek = br.readLine();
            String kol = br.readLine();
            kol+=" Srednia";
            ArrayList<String[]> tab = new ArrayList<>();
            String temp =br.readLine();
            while (temp!=null){
                temp = temp.trim();
                String [] x = temp.split("\\s+");
                tab.add(x);
                temp=br.readLine();
            }
            br.close();
            bw.write(naglowek+"\n");
            bw.write(kol+"\n");
            for (String[] s:tab){
                double srednia = (Double.parseDouble(s[3]) + Double.parseDouble(s[4])+ Double.parseDouble(s[5]))/3;
                String zapis ="";
                for (String st:s){
                    zapis+=st+" ";
                }
                zapis+= srednia+"\n";
                bw.write(zapis);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("brak pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }
    }


}
