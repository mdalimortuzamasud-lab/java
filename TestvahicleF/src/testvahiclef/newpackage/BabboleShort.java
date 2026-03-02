/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testvahiclef.newpackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BabboleShort {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter value");
              numbers[i] = input.nextInt();

            

        }
        
          for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }

            }
              System.out.println(Arrays.toString(numbers));
        }
    }
}
