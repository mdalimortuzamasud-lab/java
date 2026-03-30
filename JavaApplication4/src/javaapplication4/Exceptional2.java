
package javaapplication4;


public class Exceptional2 {
    public static void main(String[] args) {
        try {
            int result=10/0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
