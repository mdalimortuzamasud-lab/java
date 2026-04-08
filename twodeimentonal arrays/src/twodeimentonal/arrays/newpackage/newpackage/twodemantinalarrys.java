/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodeimentonal.arrays.newpackage.newpackage;

import java.util.Arrays;

/**
 *
 * @author HP-PC
 */
public class twodemantinalarrys {
    public static void main(String[] args) {
        int [][]numbers={
            {5,4,3},
            {3,2,1},
            {8,9,45}
        
        };
        for (int[] item : numbers) {
            for (int i = 0; i < item.length-1; i++) {
                for (int j = 0; j < item.length-1-i; j++) {
                    if (item[j]>item[j+1]) {
                        int temp=item[j];
                        item[j]=item[j+1];
                        item[j+1]= temp;
                    }
                }
            }
        }
        for (int[] item : numbers) {
            System.out.println(Arrays.toString(item));
        }
    }
}
