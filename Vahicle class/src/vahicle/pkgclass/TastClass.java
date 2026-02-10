
package vahicle.pkgclass;


public class TastClass {

   
    public static void main(String[] args) {
       
    Truck s =new Truck();
    
    s.weight = 2500;
    s.regularPrice = 100;
    System.out.println(s.getSalePrice());
}
