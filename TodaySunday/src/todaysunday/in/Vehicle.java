
package todaysunday.in;


public class Vehicle {
    int speed ;
    int regularPrice;
    String color;

    public Vehicle() {
    }
    
    

    public Vehicle(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice(){
        return regularPrice;
    }
}
