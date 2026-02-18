package todaysunday;

import java.util.Scanner;

public class TodaySunday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter integer number");

        int input = scanner.nextInt();
        int sum = 0;

        while (input >= 0) {
            sum += input;
            System.out.println("enter integer number");
            input = scanner.nextInt();
        }
        scanner.close();
        System.out.println("sum is" + sum);
    }

}
