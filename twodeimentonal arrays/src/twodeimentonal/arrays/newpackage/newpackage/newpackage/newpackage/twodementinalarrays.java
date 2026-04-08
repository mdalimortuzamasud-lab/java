/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodeimentonal.arrays.newpackage.newpackage.newpackage.newpackage;

import java.util.Arrays;

/**
 *
 * @author HP-PC
 */
public class twodementinalarrays {
    public static void main(String[] args) {
        int[][]M={
            {45,7,12},
            {12,8,56},
            {23,56,12}
        };
        for (int[] times : M) {
            for (int p = 0; p < times.length-1; p++) {
                for (int n = 0; n < times.length-1-p; n++) {
                    if (times[n]>times[n+1]) {
                        int Q=times[n];
                        times[n]=times[n+1];
                        times[n+1]=Q;
                    }
                }
            }
        }
        for (int[] times : M) {
            System.out.println(Arrays.toString(times));
        }
    }
}
