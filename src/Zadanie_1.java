import java.util.Random;

/*
Swtórz 10 elementową tablicę, w której znajdują się tylko
liczby z zakresu 0 - 100 i podzielne przez 7.
*/

public class Zadanie_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int times=0;

        int[] tab = new int[10];
        int x=100;
        for(int i = 0; i<tab.length;i++){
            int t;
            do{
                t=random.nextInt(x);
                times++;
            } while(t % 7 != 0);
            tab[i] = t;
            System.out.println(tab[i]);
        }
        System.out.println("Times " + times);
    }
}
