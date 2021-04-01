package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLib {

    @FindBy(xpath ="//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input")
    private WebElement searchData;

    @FindBy(xpath="//*[@id=\"SearchBoxOld\"]/div/div/div[2]")
    private WebElement searchButton;

    @FindBy(xpath="//*[@id=\"categorySuggestionList\"]/div[1]/h1")
    private WebElement resultText;

    @FindBy(xpath="//*[@id=\"pagination\"]/ul/li[2]/a")
    private WebElement pageTwo;

    @FindBy(xpath="//*[@id=\"heartWrapper\"][@data-position=3]")
    private WebElement thirdElementHeart;

    @FindBy(xpath="//*[@id=\"myAccount\"]/div/div[2]/ul/li[5]/a")
    private WebElement myFavoriteButton;

    @FindBy(xpath="//*[@id=\"ProductBox-HBV00000QW67E-Title\"]")
    private WebElement myFavoriteProductName;

    @FindBy(xpath="//*[@id=\"a56f5fbe-499d-4cd3-a7ea-e027d19aab47\"]/div/div/ul/li[3]/div/a/div[2]/h3/div/p/span")
    private WebElement listProductName;

    @FindBy(xpath="//*[@id=\"ProductBox-HBV00000QW67E\"]/div[1]/div")
    private WebElement selectProduct;

    @FindBy(xpath="//*[@id=\"StickActionHeader-RemoveSelected\"]")
    private WebElement deleteSelect;

    @FindBy(xpath="//*[@id=\"DeleteConfirmationModal-ActionButton\"]")
    private WebElement deleteConfirm;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[3]/div[2]/div")
    private WebElement emptyPage;



    public WebElement getSearchData() {
        return searchData;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getResultText() {
        return resultText;
    }

    public WebElement getPageTwo() {
        return pageTwo;
    }

    public WebElement getThirdElementHeart() {
        return thirdElementHeart;
    }

    public WebElement getMyFavoriteButton() {
        return myFavoriteButton;
    }

    public WebElement getMyFavoriteProductName() {
        return myFavoriteProductName;
    }

    public WebElement getListProductName() {
        return listProductName;
    }

    public WebElement getSelectProduct() {
        return selectProduct;
    }

    public WebElement getDeleteSelect() {
        return deleteSelect;
    }

    public WebElement getDeleteConfirm() {
        return deleteConfirm;
    }

    public WebElement getEmptyPage() {
        return emptyPage;
    }
}
