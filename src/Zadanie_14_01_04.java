import java.util.Random;

public class Zadanie_14_01_04 {
    public static void main(String[] args) {
    /*
    14.Napisz program który generuje tablicę liczb 0 i 1 (10 elementów). Program ma sprawdzić czy tablica jest symetryczna
     - pierwszy element taki jak ostatni, drugi taki jak przedostatni itd. Wynikiem działania programu ma być wypisana wygenerowana
      tablica oraz true albo false w zależności czy jest symetria czy nie.
     */

        int n=9;
        int[] tab = new int[n];

        Random rng = new Random();

        for(int i=0;i<tab.length;i++){
            tab[i]= rng.nextInt(2);
        }

        boolean czy_symetryczna = true;

        for(int i=0;i<tab.length;i++){
            if(tab[i]!=tab[tab.length-1-i]){
               czy_symetryczna = false;
            }
        }

        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+ " ");
        }

        if(czy_symetryczna){
            System.out.println("\nTablica jest symetryczna");
        }else{
            System.out.println("\nTablica nie jest symetyczna");
        }

    }
}
