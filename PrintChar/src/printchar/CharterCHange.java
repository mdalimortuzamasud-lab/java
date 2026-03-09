
package printchar;


public class CharterCHange {

   
    public static void main(String[] args) {
       Runnable printA = new printChar('A', 20);
       Runnable printB = new printChar('B', 20);
       Runnable printC = new printChar('C', 20);
      
      Thread t1 =new Thread(printA);
      Thread t2 =new Thread(printB);
      Thread t3 =new Thread(printC);      
       
       
       t1.start();
       t2.start();
       t3.start();
       
       
       
    }
    
}