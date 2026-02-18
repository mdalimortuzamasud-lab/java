
package searchinginarrays;


public class SearchingInArrays {

    
    public static void main(String[] args) {
        int numbers[]={50,60,70,80,25,90,30,45,67,89};
        int search=40;
        int finalResult=linearserch(numbers, search);
        System.out.println(finalResult);
    }
    public static int linearserch (int [] array ,int saerchNumber){
        
        int result =-1;
        for (int index =0 ;index <array.length;index++){
            if( array[index] == saerchNumber){
               
                result = index;
                break;
            }
          
            
        }
     return  result;
    }
    
}
