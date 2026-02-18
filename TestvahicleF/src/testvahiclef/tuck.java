
package testvahiclef;


public class tuck extends Vahicle{
     int weight;

    public tuck(int weight) {
        this.weight = weight;
    }

    public tuck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
          if(weight > 2000){
           return regularPrice - (regularPrice * .10);
       } else {
           return regularPrice;
       }
    }
    
    
    
     
    
    
}
