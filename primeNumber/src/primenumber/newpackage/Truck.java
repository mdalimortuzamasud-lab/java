
package primenumber.newpackage;


public class Truck extends vahicle{
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int regularprice) {
        super(regularprice);
        this.weight = weight;
    }

   

    @Override
    public double getsaleprice() {
        if (weight>2000) {
            return regularprice-(regularprice*.10);
        }
        return regularprice;
    }

    
}
