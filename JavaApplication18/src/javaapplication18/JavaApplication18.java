package javaapplication18;

import java.util.Arrays;

public class JavaApplication18 {

    private static int[] masud;

    public static void main(String[] args) {

        int number[]={10,20,80,70,60,30,40,90};
        int[] newArray= sort(number);
        System.out.println(Arrays.toString(newArray));
      
    }

    public static int[] sort(int[] masud) {
        for (int i = 0; i < masud.length - 1; i++) {

            for (int j = 0; j < masud.length - 1 - i; j++) {
                if (masud[j] > masud[j + i]) {

                    //90,60,80,10,50
                    //60,90,80,10,50
                    int temp = masud[j]; //90
                    masud[j] = masud[j + 1];//60
                    masud[j + 1] = temp;//90

                }

            }

        }
        return masud;
    }

}
