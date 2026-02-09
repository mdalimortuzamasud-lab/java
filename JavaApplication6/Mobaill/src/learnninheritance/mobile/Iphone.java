
package learnninheritance.mobile;

public class Iphone extends Mobile{
    
    private String facecall;
    private String imassage;
    private String os;

    public Iphone() {
    }

    public Iphone(String facecall, String imassage, String os) {
        this.facecall = facecall;
        this.imassage = imassage;
        this.os = os;
    }

    public Iphone(String facecall, String imassage, String os, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.facecall = facecall;
        this.imassage = imassage;
        this.os = os;
    }

    public String getFacecall() {
        return facecall;
    }

    public void setFacecall(String facecall) {
        this.facecall = facecall;
    }

    public String getImassage() {
        return imassage;
    }

    public void setImassage(String imassage) {
        this.imassage = imassage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Iphone{" + "facecall=" + facecall + ", imassage=" + imassage + ", os=" + os + '}';
    }

    
    
    
    
}