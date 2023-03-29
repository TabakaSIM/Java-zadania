import java.util.Random;

public class Zadanie_9_01_04 {
    public static void main(String[] args) {
        /*9.Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
        Wynikiem działania programu mają być wypisane obie tablice, oraz trzecia tablica w
        której każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic. Przykład:
        1 4 4 64 45
        23 32 5 23 3
        24 36 9 87 48*/

        Random rng = new Random();
        int n=10;
        int[] tab1 = new int[n];
        int[] tab2 = new int[n];


        for(int i=0;i<n;i++){
            tab1[i]= rng.nextInt(101);
            tab2[i]= rng.nextInt(101);
        }

        int[] newtab = new int[n];

        for(int i = 0; i<newtab.length;i++) {
            newtab[i]=tab1[i]+tab2[i];
        }
        System.out.print("Tablica pierwsza:"+"\n");
        for(int i=0;i<tab1.length;i++){
            System.out.print(tab1[i]+" ");
        }
        System.out.print("\n"+"Tablica druga:"+"\n");
        for(int i=0;i<tab2.length;i++){
            System.out.print(tab2[i]+" ");
        }
        System.out.print("\n"+"Suma tablic:"+"\n");
        for(int i=0;i<newtab.length;i++){
            System.out.print(newtab[i]+" ");
        }

    }
}
