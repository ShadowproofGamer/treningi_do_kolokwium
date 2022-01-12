package copy_paste;

import java.io.*;
import java.util.ArrayList;

public abstract class IO {
    public static void normalFileRead_Write(){
        try(
                BufferedReader br = new BufferedReader(new FileReader("src/rok19_20_k2/txt.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/rok19_20_k2/txt2.txt"));
        ){
            ArrayList<String[]> arr = new ArrayList<>();
            String t=".";
            while ((t = br.readLine()) != null && t.length()>0){
                arr.add(t.split("\\s+"));
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("brak pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
