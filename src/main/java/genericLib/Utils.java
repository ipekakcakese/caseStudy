package genericLib;

import java.util.concurrent.TimeUnit;

public class Utils {
    // waitForPageToLoad() method is used to implicitly wait for "generic" seconds
    public static void waitForPageToLoad(int second){
        Driver.driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }
}
