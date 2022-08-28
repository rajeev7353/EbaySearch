package com.ebay.pages;



import com.ebay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    public WebElement signInLink;

    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    public WebElement searchInputBox;

    @FindBy(xpath = "//*[@id=\"gh-btn\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1")
    public WebElement searchResult;







    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(searchInputBox));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


