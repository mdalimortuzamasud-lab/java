
package testvehicle;


public class Truck extends vehicle{
    int Weight;

    public Truck(int Weight) {
        this.Weight = Weight;
    }

    public Truck(int Weight, double regularPrice) {
        super(regularPrice);
        this.Weight = Weight;
    }

    
 

    
    @Override
    double getSalePrice() {
       if(Weight>2000){
      return regularPrice-(regularPrice*.10);
      
    }else{
    return regularPrice;
     }

    
    
    } 
    
}
