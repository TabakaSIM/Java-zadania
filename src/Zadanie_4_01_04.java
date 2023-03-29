import java.util.Random;

public class Zadanie_4_01_04 {
    public static void main(String[] args) {
        /*
        4.Napisz program generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba
         jest losowa ale nie jest mniejsza niż poprzednia liczba.

         Przykłady:
        23, 34, 53, 60, 80
        0, 10, 70, 70, 70
        nieprawidłowy wynik:
        34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).

        Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20.
         */
        int n=10;
        int[] tab = new int[n];

        Random rng = new Random();

        for(int i=0;i<n;i++){
        tab[i]= rng.nextInt(21);
        }

        // Wystarczy posortować (Np. fragment kody z zadania 1)

        for(int i=0;i<tab.length-1;i++){
            int index = i;

            for(int j=i+1;j<tab.length;j++){
                if(tab[index]>tab[j]){
                    index=j;
                }
            }
            int c=tab[i];
            tab[i]=tab[index];
            tab[index]=c;
        }

        System.out.println();
        System.out.println("Wygenerowana liczba to: ");
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }

    }
}
