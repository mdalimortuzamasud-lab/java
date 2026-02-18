
package javaapplication17;


import java.util.Arrays;
import java.util.Scanner;


public class JavaApplication17 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("how many do u want to campare");
        int n=s.nextInt();
        int numbers[]=new int[n];
        
        System.out.println("begining of loop" + Arrays.toString(numbers));
        for(int index =0; index<n;index++){          

            
            System.out.println("enter ur" + (index + 1) +" number");
           int userInput =s.nextInt();
           numbers[index] =userInput;
                   
            findMaxNumber(numbers);
        }
        System.out.println("ending of loof " + Arrays.toString(numbers));
    }
    public static void findMaxNumber(int[] numbers){
        int avarge =0;
        
        for(int item:numbers){
            if(item>=max){
                max=item;
            }
        }
        System.out.println("max number is"+max);
    }
}

