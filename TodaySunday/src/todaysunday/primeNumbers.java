/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todaysunday;

import java.util.Scanner;

/**
 *
 * @author HP-PC
 */
public class primeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int count=0;
        
        for (int i = 1; i <=input; i++) {
            if (input%i==0) {
                count++;
            }
        }
        if (count<=2) {
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
        
    }
}
