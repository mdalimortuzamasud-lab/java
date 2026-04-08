/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodeimentonal.arrays.newpackage.newpackage.newpackage;

import java.util.Arrays;

/**
 *
 * @author HP-PC
 */
public class todemanmantionalarrays {
    public static void main(String[] args) {
        int[][]masud={
            {5,4,1},
            {2,1,3},
            {5,2,1}
        };
        for (int[] item : masud) {
            for (int i = 0; i < item.length-1; i++) {
                for (int j = 0; j < item.length-1-i; j++) {
                    if (item[j]>item[j+1]) {
                        int karim=item[j];
                        item[j]=item[j+1];
                        item[j+1]=karim;
                    }
                }
            }
        }
        for (int[] item : masud) {
            System.out.println(Arrays.toString(item));
        }
    }
    
}
