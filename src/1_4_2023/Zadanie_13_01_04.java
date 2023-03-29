import java.util.Random;

public class Zadanie_13_01_04 {
    public static void main(String[] args) {
        /*
        13.Napisz program który symuluje rzuty dwiema kastkami do gry (takie zwykłe białe kości jak w monopoly).
        Program ma wykonać 10 000 rzutów i wypisać liczbę która wypadała najczęściej
        (ta liczba jest oczywiście sumą oczek na dwóch kościach które symulujemy.
         */

        int[] zliczanie = new int[11];
        Random rng = new Random();

        for(int i =0; i<zliczanie.length;i++) {
            zliczanie[i]=0;
        }
        int[] rzut=new int[2];

        for(int i=0;i<10000;i++){
            rzut[0]= rng.nextInt(6)+1;
            rzut[1]= rng.nextInt(6)+1;

            zliczanie[rzut[0]+rzut[1]-2]++;

        }

        for(int i=0;i<zliczanie.length;i++){
            int ilosc = i+2;
            System.out.println("Liczba " + ilosc + " wypadla "+zliczanie[i] +" razy.");
        }

    }
}
