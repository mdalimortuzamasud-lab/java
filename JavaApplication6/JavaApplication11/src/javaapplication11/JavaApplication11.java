
package javaapplication11;

import java.util.Scanner;


public class JavaApplication11 {

    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int randomNumber =(int) (Math.random()*10);
        
        System.out.println(randomNumber);
        int chance =3;
        boolean win =false;
        System.out.println("guess a number between 0-9");
        
        while (chance>=1){
            System.out.println("enter your guess(" + chance + "chances left):");
            int guessNumber =scanner.nextInt();
            
            if(guessNumber ==randomNumber){
                System.out.println("you win!");
                win =true;
                break;
            }else if(guessNumber>randomNumber){
                System.out.println("your guass number is too large.");
            }else if(guessNumber<randomNumber){
                System.out.println("your guess number is too small.");
            }
            chance--;
        }
        
        if(!win){
            System.out.println("batter luck next time!");
            }
        }
        
        
        
        
    }
    
}
