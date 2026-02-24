package rasult;

import java.util.Scanner;

public class Rasult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Rasult: ");
        int input = s.nextInt();

        if (input < 60) {
            System.out.println("Fail");
        }
        else if (input < 70) {
            System.out.println("B");
        }
        else if (input < 90) {
            System.out.println("A");
        }
        else if (input < 100) {
            System.out.println("A+");
        }
       
    }

}
