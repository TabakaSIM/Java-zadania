import java.util.Random;

public class Zadanie_5_01_04 {
    public static void main(String[] args) {
        /*
        5.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
        Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5.
        Zakres losowych liczb 0 - 10.
         */

        int n=10;
        int[] tab = new int[n];

        Random rng = new Random();
        int ilosc=0;

        for(int i=0;i<n;i++){
            tab[i]= rng.nextInt(11);
            if(tab[i]==5){
                ilosc++;
            }
        }

        System.out.println("Wygenerowana tablica to:");
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }

        System.out.println("\n" + "Liczba powtórzeń liczy 5 to: " + ilosc);
    }
}
