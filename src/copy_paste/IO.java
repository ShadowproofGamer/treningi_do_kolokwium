package copy_paste;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import a_przykladowe_dane.*;


public abstract class IO {
    public static void normalFileRead_Write(){
        try(
                BufferedReader br = new BufferedReader(new FileReader("src/a_przykladowe_dane/txt.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/a_przykladowe_dane/txt2.txt"));
        ){
            ArrayList<String[]> arr = new ArrayList<>();
            String t=".";
            while ((t = br.readLine()) != null && t.length()>0){
                arr.add(t.split("\\s+"));
            }
            //todo smh with data

            for (String[] s:arr){
                bw.write(String.format("%6s %6s %5.2f %4d \n", s[0], s[1], 1.357, 2));
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
    public static void byteFileRead_Write(){
        try(
                BufferedInputStream br = new BufferedInputStream(new FileInputStream("src/a_przykladowe_dane/png.png"));
                BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("src/a_przykladowe_dane/png2.png"));
        ){
            int count = 0;
            int i;
            byte[] b = new byte[1024];
            while ((i=br.read(b, 0, 1024)) != -1){
                bw.write(b, 0, i);
                count+=i;
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
