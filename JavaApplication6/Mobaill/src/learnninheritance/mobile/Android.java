
package learnninheritance.mobile;


public class Android extends Mobile{
    private String playStore;
    private String browser;
    private String calculator;
    private String os;

    public Android() {
    }

    public Android(String playStore, String browser, String calculator, String os) {
        this.playStore = playStore;
        this.browser = browser;
        this.calculator = calculator;
        this.os = os;
    }

    public Android(String playStore, String browser, String calculator, String os, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.playStore = playStore;
        this.browser = browser;
        this.calculator = calculator;
        this.os = os;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getCalculator() {
        return calculator;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Android{" + "playStore=" + playStore + ", browser=" + browser + ", calculator=" + calculator + ", os=" + os + '}';
    }
    
    
    
    
    
}
