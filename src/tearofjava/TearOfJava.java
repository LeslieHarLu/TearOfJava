package tearofjava;

import java.util.Scanner;

/**
 *
 * @author Lye Blue *°•●☆*
 */
public class TearOfJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc;
        int j;
        int n;
        int i;
        char c;

        sc = new Scanner(System.in);
        n = 25;
        i = 1;
        c = '|';

        while (i <= n) {

            j = 1;

            while (j++ <= n - i) {

                System.out.print(" ");

            }
            j = 1;

            while (j++ <= i * 2 - 1) {

                System.out.print(c);

            }

            System.out.println();

            i++;

        }
        i = n - 1;

        while (i > 0) {

            j = 1;

            while (j++ <= n - i) {

                System.out.print(" ");

            }
            j = 1;

            while (j++ <= i * 2 - 1) {

                System.out.print(c);

            }

            System.out.println();

            i--;
        }
    }

}
