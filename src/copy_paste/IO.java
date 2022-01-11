package copy_paste;

import java.io.*;

public class IO {
    public void download(){
        try(
                BufferedReader br = new BufferedReader(new FileReader("src/rok19_20_k2/txt.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/rok19_20_k2/txt2.txt"));
        ){
            //todo

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
