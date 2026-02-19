package testvahiclef.newpackage;

import java.util.Arrays;
import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numbers[] = new int[5];

        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Enter  your number:");
            numbers[index] = s.nextInt();

//        }
//        System.out.println("all numbers:" + Arrays.toString(numbers));
//
//        int max = numbers[0];
//        int min = numbers[0];
//               //10,9,2,5,70
//        for (int index = 0; index < numbers.length; index++) {
//            if (numbers[index] > max) {
//                max = numbers[index];
//            }
//
//            if (numbers[index] < min) {
//                min = numbers[index];
//
//            }
//
//        }
        System.out.println("max" + max);
        System.out.println("min" + min);

    }

}
