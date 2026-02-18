
package todaysunday.in;


public class Truck extends Vehicle{
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
       if(weight > 2000){
           return regularPrice - (regularPrice * .10);
       } else {
           return regularPrice;
       }
    }
    
    
    

   
    

   
   
    
    
    
}
