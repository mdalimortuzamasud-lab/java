
package maltidimantionarry;

import java.util.Arrays;

public class MaltidiMantionarry {

   
    public static void main(String[] args) {
       int numbers [][] = new int[3] [4];
       
       numbers[0][0] = 1;
       numbers[0][1] = 2;
       numbers[0][2] = 3;
       numbers[0][3] = 4;
       
       numbers[0][0] = 5;
       numbers[1][1] = 6;
       numbers[1][2] = 7;
       numbers[1][3] = 8;
      
       numbers[2][0] = 9;
       numbers[2][1] = 10;
       numbers[2][2] = 11;
       numbers[2][3] = 12;
         
       
        System.out.println(Arrays.deepToString(numbers));
        
        for(int[] item : numbers){//item =1,2,3,
            
        
        for(int single:item){
            System.out.print(single+"\t");
        }
        System.out.println("");
        }
    }
    
}
