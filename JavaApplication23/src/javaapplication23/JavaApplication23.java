
package javaapplication23;

import java.util.Arrays;
import java.util.Scanner;


public class JavaApplication23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter row size");
        int rowSize=s.nextInt();
        
        System.out.println("enter colum size");
        int colSize =s.nextInt();
        
        int numbers[][]=new int [rowSize][colSize];
        
        for(int row=0;row<numbers.length;row++){
            
            for(int col=0;col<numbers[row].length;col++){
                System.out.println("enter value for row" + (row+1)+ "col" +(col+1));
                int userInput =s.nextInt();
                numbers[row][col]=userInput;
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        
        
        
    }
    
}
