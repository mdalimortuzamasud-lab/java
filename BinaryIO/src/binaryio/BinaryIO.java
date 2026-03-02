package binaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryIO {

    public static void main(String[] args) {
       

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\khan.dat");
            for(int i = 0; i < 10; i++){
                fos.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\khan.dat");
            
            int a;
            while((a = fis.read()) != -1){
                System.out.println(a);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
