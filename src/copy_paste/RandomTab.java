package copy_paste;

import java.util.Arrays;
import java.util.Random;

public class RandomTab {
    public RandomTab(){
        Random myRandom = new Random();
        int[][] tab = new int[5][];
        for (int i=0;i<tab.length;i++){
            tab[i] = new int[myRandom.nextInt(10)];
        }
        for (int i=0; i<tab.length;i++){
            for (int j=0;j<tab[i].length;j++){
                tab[i][j]= myRandom.nextInt(20);
            }
        }
        System.out.println(Arrays.deepToString(tab));
    }
}
