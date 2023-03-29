import java.util.Random;

public class Zadanie_8_01_04 {
    public static void main(String[] args) {
        /*
        8.Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
        Wynikiem działania programu mają być wyświetlone obie tablice oraz trzecia
         tablica będąca połączeniem dwóch wygenerowanych. Przykład:
        3, 5, 12, 34, 45
        45, 21, 65, 23, 1
        3, 5, 12, 34, 45, 45, 21, 65, 23, 1
         */
        Random rng = new Random();
        int n=10;
        int[] tab1 = new int[n];
        int[] tab2 = new int[n];


        for(int i=0;i<n;i++){
            tab1[i]= rng.nextInt(101);
            tab2[i]= rng.nextInt(101);
        }

        int[] newtab = new int[tab1.length+tab2.length];

        for(int i = 0; i<tab1.length+tab2.length;i++) {
            if (i < n) {
                newtab[i] = tab1[i];
            } else {
                newtab[i] = tab2[i-n];
            }
        }
        System.out.print("Tablica pierwsza:"+"\n");
        for(int i=0;i<tab1.length;i++){
            System.out.print(tab1[i]+" ");
        }
        System.out.print("\n"+"Tablica druga:"+"\n");
        for(int i=0;i<tab2.length;i++){
            System.out.print(tab2[i]+" ");
        }
        System.out.print("\n"+"Polaczona tablica:"+"\n");
        for(int i=0;i<newtab.length;i++){
            System.out.print(newtab[i]+" ");
        }
    }
}
