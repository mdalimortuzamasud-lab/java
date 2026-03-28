/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testmultitrading.newpackage;

public class testmultitreding implements Runnable{
     private char  charToPrint;
     private  int  times;

    public testmultitreding() {
    }

    public testmultitreding(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for(int i= 0;i<times;i++){
            System.out.println(charToPrint+" ");
        }
    }
     
    
    
}
