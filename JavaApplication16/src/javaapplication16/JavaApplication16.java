
package javaapplication16;


import java.util.Arrays;
import java.util.Scanner;


public class JavaApplication16 {

    
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
        float avg =0;
        int size =numbers.length;
        int sum= 0;
        
        for(int item:numbers){
            sum+=item;
        }
     
        avg = sum / size;
        System.out.println("avarage number is"+avg);
    }
}
