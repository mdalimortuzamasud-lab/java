
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
//        System.out.println("enter radius");
        
        float radius = Scanner.nextFloat();
        float area;
        
        if(radius<=0){
            System.out.println("incorrect radius");
        }else{
          area = (float)(Math.PI * Math.pow(radius, 2));
          
            System.out.println("the area is "+ area);
        
    }
        
    }
    
}
