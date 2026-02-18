
package javaapplication8;

import java.util.Scanner;




public class JavaApplication8 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        
//        System.out.println("enter 1");
//        int nu1 = input.nextInt();
//                
//        System.out.println("enter 2");
//        int nu2 = input.nextInt();
//                
//        System.out.println("enter 1");
//       String op = input.next();
//        
//        if (op.equals("+")){
//        System.out.println(nu1+nu2);
//        
//        }else if (op.equals("-")){
//        System.out.println(nu1-nu2);
//        
//        }else if (op.equals("*")){
//        System.out.println(nu1*nu2);
//        
//        }else if (op.equals("/")){
//        System.out.println(nu1/nu2);
//        };
//        
       


  

        System.out.println("Enter first number:");
        int nu1 = input.nextInt();

        System.out.println("Enter second number:");
        int nu2 = input.nextInt();

        System.out.println("Enter operator (+, -, *, /):");
        String op = input.next();

        if (op.equals("+")) {
            System.out.println("Result: " + (nu1 + nu2));
        } else if (op.equals("-")) {
            System.out.println("Result: " + (nu1 - nu2));
        } else if (op.equals("*")) {
            System.out.println("Result: " + (nu1 * nu2));
        } else if (op.equals("/")) {
            
                System.out.println("Result: " + (nu1 / nu2));
          
    }
}

       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
                
           
          
//        System.out.println("enter your number");
//        
//        int number =input.nextInt();
//        
//        if (number%2==0){
//            System.out.println(" it is even");
//        }else{
//            System.out.println("it is odd");
//        }
    }
    
}
