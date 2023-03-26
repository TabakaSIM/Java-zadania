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

public class Zadanie_2 {
    public static void main(String[] args) {
        int w = 13;

        for (int i = 0; i < w; i++) {

            for (int j = 0; j < w - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < w - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }
}
