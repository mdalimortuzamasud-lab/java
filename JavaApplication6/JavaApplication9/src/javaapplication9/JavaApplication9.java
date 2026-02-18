
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        String name = s.next();
        
        
        String firstChar = name.substring(0,1).toUpperCase();
        String lastpart= name.substring(1).toLowerCase();
        
        String newName =firstChar + lastpart;
        System.out.println("newName");
    }
    
}
