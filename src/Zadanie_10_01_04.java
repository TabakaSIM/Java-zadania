public class Zadanie_10_01_04 {
    public static void main(String[] args) {
        /*10.Napisac program w którym są 3 zmienne:
        s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
        k - liczba całkowita - oznacza krok w ciągu arytmetycznym
        n - liczba całkowita - oznacza ilość elementów ciągu.
                Program ma zwracać sumę elementów takiego ciągu. Przykład:
        s = 3, k = 5, n = 4
        program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
        3, 8, 13, 18
        następnie je sumuje i podaje wynik: 42.
        Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)*/

        int s=-21;
        int k=4;
        int n=13;
        for (int i = 0; i < n; i++) {
            int a=s+i*k;
            System.out.print(a);
            if(i!=n-1){
                System.out.print(", ");
            }
        }
        int suma=((2*s+n*k)/2)*n;
        System.out.print("\nSuma tych wyrazow to: " + suma);
    }
}
