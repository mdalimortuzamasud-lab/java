package javaapplication34;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilePath {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\masud.txt");
        
//        try {
//            PrintWriter pw = new PrintWriter(file);
//            pw.write("hello pk\n");
//            pw.write("Bdrul");
//            pw.println("hasam");
//           
//             for(int i=1;i<=100;i++){
//             
//                pw.println(i);
//             
//             }
//         
  
        try {
            Scanner s =new Scanner(file);
            
            while (s.hasNext()) {
                 System.out.println(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePath.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              
              
              
              
              
//       
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FilePath.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
}
