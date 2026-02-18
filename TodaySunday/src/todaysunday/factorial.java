package todaysunday;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter number");
//        int input = scanner.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= input; i++) {
//
//            factorial *= i;

            int factorial = 1;
            for (int i = 1; i <= 5; i++) {

                factorial *= i;
            }
            System.out.println("factorial of 5 is " + factorial);
        }
    
}
