import java.util.Random;
import java.lang.Math.*;

public class Zadanie_11_01_04 {
    public static void main(String[] args) {
        /*11.Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
        Program ma sprawdzić czy z podanych boków da się zbudować trójkąt. Jeśli się da to program ma wypisać na
        ekranie true (w przeciwnym wypadku false) i obliczyć obwód tego trójkąta. Jak sprawdzić czy z podanych
        boków da się zbudować trójkąt znajdziecie w google pod hasłem: "Nierówność trójkąta".*/

        Random rng = new Random();

        int a = rng.nextInt(50);
        int b = rng.nextInt(50);
        int c = rng.nextInt(50);

        int[] tab = {a, b, c};

        //Sortowanie tablicy
        for (int i = 0; i < tab.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[index] > tab[j]) {
                    index = j;
                }
            }
            int max = tab[i];
            tab[i] = tab[index];
            tab[index] = max;
        }
        boolean trojkat = tab[0]+tab[1]>=tab[2];
        System.out.println(trojkat);

        if(trojkat){
            int obw=a+b+c;
            System.out.println("Obwod tego trojkata to: " + obw);
            double p = (double)(a+b+c)/2;
            double p2 = p*(p-a)*(p-b)*(p-c);
            double pole = Math.sqrt(p2);
            System.out.println("Pole tego trojkata to: " + pole);
        }
    }
}
