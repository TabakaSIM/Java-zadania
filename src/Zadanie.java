import java.util.Random;

/*
Swtórz 10 elementową tablicę, w której znajdują się tylko
liczby z zakresu 0 - 100 i podzielne przez 7.
*/

public class Zadanie {
    public static void main(String[] args) {
            Random random = new Random();

            int[] tab = new int[10];

            for(int i = 0 ; i < tab.length ; i++){
                int n= 100 / 7;
                tab[i] = random.nextInt(n+1)*7;
                System.out.println(tab[i]);
            }

    }
}
