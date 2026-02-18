
package testvahiclef;

public class Vahicle {
    
    int spreed;
    double regularPrice;
    String color;

    public Vahicle() {
    }

    public Vahicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    
    
    double getSalePrice(){
    return regularPrice;
    }
}
