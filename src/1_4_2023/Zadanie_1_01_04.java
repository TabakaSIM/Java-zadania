import java.util.Random;

public class Zadanie_1_01_04 {
    public static void main(String[] args) {
        /*
1.Napisz program generujący jednowymiarową tablice liczb (10 elementów).
 Program powinien posortować tablicę przy pomocy algorytmu sortowania przez wstawianie
 lub przez wybranie (do wyboru, dla chętnych oba algorytmy). Wynikiem działania
 programu ma być wyświetlona tablica przed sortowaniem oraz posortowana.
 */

        Random random = new Random();
        int n = 10;
        int[] tab = new int[n];

        // Generowanie
        for(int i=0;i<n;i++){
            tab[i]= random.nextInt(100);
        }

        // Wyświetlanie
        for(int i=0;i<tab.length;i++) {
            System.out.print(tab[i] + " ");
        }
        // Sortowanie przez wybieranie
        /*
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
        }*/

        //Sortowanie przez wstawianie

        for(int i=1;i<tab.length;i++){

            int c = tab[i];
            int j = i-1;

            boolean done = false;

            while(!done){

                if(tab[j]>c){
                    tab[j+1]=tab[j];
                }else{
                    tab[j + 1] = c;
                    done = true;
                }
                if(j==0 & !done){
                    tab[j]=c;
                    done = true;
                }
                j--;
            }
        }

        //Nowa linia i wyświetlenie posortowanej tablicy
        System.out.println();
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }

        // Sprawdzanie, czy tablica jest posortowana
        /*
        System.out.println();
        for(int i=0;i<tab.length-1;i++){
            if(tab[i]>tab[i+1]){
                System.out.println("Error");
            }
        }
        */
    }
}
