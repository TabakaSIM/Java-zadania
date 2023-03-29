import java.util.Random;

public class Zadanie_3_01_04 {
    public static void main(String[] args) {
        /*
        3.Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb.
         Wynikiem działania programu ma być wyświetlona tablica oraz najmniejsza
         liczba z tej tablicy. Zakres losowych liczb 0 - 100.
         */

        int[][] tab = new int[5][5];
        Random rng = new Random();

        for (int i=0;i< tab.length;i++){
            for(int j=0;j<tab[0].length;j++){
                tab[i][j]= rng.nextInt(101);
            }
        }

        for (int i=0;i< tab.length;i++){
            for(int j=0;j<tab[0].length;j++){
                System.out.print(tab[i][j] + " ");
                if (tab[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
