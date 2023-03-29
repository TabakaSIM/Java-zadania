/*
Stwórz choinkę, np:
            *
           ***
          *****
         *******
        *********
       ***********
      *************
     ***************
    *****************
   *******************
  *********************
 ***********************
*************************
            *
 */


import java.util.Random;

public class Zadanie_2 {
    public static void main(String[] args) {
        int w = 13;

        for (int i = 0; i < w; i++) {

            for (int j = 0; j < w - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                Random random = new Random();
                if (random.nextInt(10)>8) {
                    System.out.print("o");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        for (int i = 0; i < w - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }
}
