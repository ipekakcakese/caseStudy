package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLib {

    @FindBy(xpath="//*[@id=\"txtUserName\"]")
    private WebElement emailAddress;

    @FindBy(xpath="//*[@id=\"txtPassword\"]")
    private WebElement password;

    @FindBy(xpath="//*[@id=\"btnLogin\"]")
    private WebElement loginButton;

    private String URL = "https://www.hepsiburada.com/uyelik/giris";



    public WebElement getEmailAddress() {
        return emailAddress;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public String getURL() {
        return URL;
    }
}
