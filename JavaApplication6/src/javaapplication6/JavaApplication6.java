
 
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("Enter radius");
        
        float radius = sacnner.nextFloat();
        
        
        float areaofCircle;
        if(radius<=0){
            System.out.println("incorret radius");
        }else{
            areaofCircle= (float) (Math.PI*Math.pow(radius,:2));
            System.out.println("area of circle is"+areaofCircle);
        }
        
        
        
        
    }
    
    
}
