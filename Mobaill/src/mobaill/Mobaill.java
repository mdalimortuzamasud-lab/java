
package mobaill;

import learnninheritance.mobile.Android;


public class Mobaill {

    
    public static void main(String[] args) {
        Android android =new Android();
        
        android.setBrowser("Chrome");
        android.setOs("Android");
        android.setCalculator("math");
        android.setPlayStore("yes");
        
        android.setCall("yes");
        android.setCamera("Multipule");
        android.setGallery("google photo");
        android.setMessage("yes");
        android.setGames("free fire");
        
        
        System.out.println(android);
    }
    
}
