public class Zadanie_12_01_04 {
    public static void main(String[] args) {
        /*12.Napisz program który ma dwie zmienne:
        weight - waga, liczba całkowita
        height - wzrost, liczba całkowita
        program ma obliczać BMI (wskaźnik masy ciała, wzór do znalezienia w internecie, gdybyście nie znaleźli to piszcie)
        i na podstawie wyliczonego BMI wypisywać "Nadwaga, Niedowaga, W normie itp.*/

        int waga=80;
        int wzrost=180; // w cm!

        double BMI = (double)(waga)*10000/(wzrost*wzrost);

        System.out.println("Twoje BMI to: " + BMI);
        String zakres = new String();

/*        mniej niż 16 - wygłodzenie
        16 - 16.99 - wychudzenie
        17 - 18.49 - niedowaga
        18.5 - 24.99 - wartość prawidłowa
        25 - 29.99 - nadwaga
        30 - 34.99 - I stopień otyłości
        35 - 39.99 - II stopień otyłości
        powyżej 40 - otyłość skrajna */

        if (BMI<16.0){
            zakres="Wyglodzenie";
        }else if(BMI<17.0){
            zakres="Wychudzenie";
        }else if(BMI<18.5){
            zakres="Niedowaga";
        }else if(BMI<25.0){
            zakres="Waga prawidlowa";
        }else if(BMI<30){
            zakres="Nadwaga";
        }else if(BMI<35){
            zakres="I stopien otylosci";
        }else if(BMI<40){
            zakres="II stopien otylosci";
        }else{
            zakres="Nadwaga";
        }

        System.out.println("Masz: " + zakres);
    }
}
