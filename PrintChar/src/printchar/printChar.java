
package printchar;


public class printChar  implements  Runnable{
    
    private char charToprint;
    private int times;
        

    public printChar() {
    }

    public printChar(char charToprint, int times) {
        this.charToprint = charToprint;
        this.times = times;
    }
    
    @Override
    public void run() {
       for(int i=0; i<times;i++){
           System.out.print(charToprint+" ");
           
       }
    }

 
    
    
    
    
    
    
}
