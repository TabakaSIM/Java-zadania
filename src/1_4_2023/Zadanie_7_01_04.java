import java.util.Random;

public class Zadanie_7_01_04 {
    public static void main(String[] args) {
        /*
        7.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
        Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
        Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica.
        Przykłady:
        3, 23, 2, 23, 53
        53, 23, 2, 23, 3
        45, 23, 65, 1, 54
        54, 1, 65, 23, 45
        Zakres losowych liczb 0 - 100.
        */

        int n=10;
        int[] tab = new int[n];

        Random rng = new Random();

        for(int i=0;i<n;i++){
            tab[i]= rng.nextInt(101);
        }

        int[] newtab = new int[tab.length];

        for(int i = 0; i<tab.length;i++){
            newtab[i]=tab[tab.length-1-i];
        }

        System.out.print("Stara tablica:"+"\n");
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.print("\n"+"Nowa tablica:"+"\n");
        for(int i=0;i<tab.length;i++){
            System.out.print(newtab[i]+" ");
        }
    }
}
