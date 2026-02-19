package testvehicle.newpackage;

import java.util.Scanner;

public class integer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your integer number");
        int Input = scanner.nextInt();
        int sum = 0;
        while (Input > 0) {
            sum += Input;
            System.out.println("enter integer number");
            Input = scanner.nextInt();
        }

        scanner.close();
        System.out.println("sum is " + sum);
    }

}
