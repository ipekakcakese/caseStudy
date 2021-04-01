import bussinessLib.LoginLogoutLib;
import genericLib.Driver;
import genericLib.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageFactory.HomePageLib;
import pageFactory.LoginPageLib;

public class MyFavoriteTest {
    LoginPageLib loginPageObj = PageFactory.initElements(Driver.driver, LoginPageLib.class);
    HomePageLib homePageObj = PageFactory.initElements(Driver.driver,HomePageLib.class);
    @Before
    public void beforeTest () {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Users\\ipeka\\Desktop\\demo-SELENIUM\\selenium-webdriver-exam\\chromedriver.exe");
        Driver.driver.get(loginPageObj.getURL());
        Driver.driver.manage().window().maximize();
        Utils.waitForPageToLoad(30);
        LoginLogoutLib.LoginToApp("lupenyttix-6926@yopmail.com", "Ia123456");
        Utils.waitForPageToLoad(30);
    }

    @Test
    public  void myFavorite () {
          homePageObj.getSearchData().click();
          homePageObj.getSearchData().sendKeys("Samsung");
          homePageObj.getSearchButton().click();
          Utils.waitForPageToLoad(20);
          String productText = homePageObj.getResultText().getText();
          if(productText.equals("Samsung")){
              homePageObj.getPageTwo().click();
              Utils.waitForPageToLoad(30);
              homePageObj.getThirdElementHeart().click();
              String listProductName = homePageObj.getListProductName().getText();
              homePageObj.getMyFavoriteButton().click();
              Utils.waitForPageToLoad(20);
              String myFavoriteProductName = homePageObj.getMyFavoriteProductName().getText();
              if(listProductName.equals(myFavoriteProductName)){
                    homePageObj.getSelectProduct().click();
                    homePageObj.getDeleteSelect().click();
                    Utils.waitForPageToLoad(5);
                    homePageObj.getDeleteConfirm().click();
                    Utils.waitForPageToLoad(5);
                    Assert.assertTrue(homePageObj.getEmptyPage().getClass().equals("empty-page"));
              }

          }else{
              Assert.fail("Arama sonucu bulunamadı!");
          }

    }

    @After
    public void afterTest(){
        Utils.waitForPageToLoad(45);
        Driver.driver.quit();
    }
}
