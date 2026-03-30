
package Testmultitrading;

import Testmultitrading.newpackage.testmultitreding;


public class testmultitreading {
    public static void main(String[] args) {
        Runnable printA = new testmultitreding('A', 20);
        Runnable printB = new testmultitreding('B', 20);
        Runnable printc = new testmultitreding('c', 20);
        
        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(printc);
        
        
        t1.start();
        t2.start();
        t3.start();
        
     
        System.out.println("");
        
    }
}
