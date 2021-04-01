package bussinessLib;

import genericLib.Driver;
import genericLib.Utils;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageFactory.LoginPageLib;

public class LoginLogoutLib {
    public static void LoginToApp(String emailAddress, String password){

        try {
            LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);

            loginPageObj.getEmailAddress().clear();
            loginPageObj.getEmailAddress().sendKeys(emailAddress);
            loginPageObj.getPassword().clear();
            loginPageObj.getPassword().sendKeys(password);
            Utils.waitForPageToLoad(30);
            loginPageObj.getLoginButton().click();

        } catch (Exception e) {
            Assert.fail(e.toString());
        }

    }

}
