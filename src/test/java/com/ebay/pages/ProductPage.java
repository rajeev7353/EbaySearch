package com.ebay.pages;

import com.ebay.utilities.BrowserUtils;
import com.ebay.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Element;
import javax.xml.xpath.XPath;
import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"s-item__wrapper clearfix\"]")
    public List<WebElement> productList;

    @FindBy(xpath = "//span[@class='s-item__dynamic s-item__freeXDays']")
    public List<WebElement> getPostagecost;

    @FindBy(xpath = "//*[@id=\"s0-30-7-5[0]\"]/div[2]/div[1]/div/ul/li[4]/a")
    public WebElement buyItNowTag;

    @FindBy(xpath = "//*[contains(text(),'bids')]")
    public List<WebElement> noOfBidsCounts;

    @FindBy(xpath = "//*[@id=\"x-refine__group__4\"]/ul/li[3]/div/a/div/span")
    public WebElement clickOnAuction;


    @FindBy(xpath = "//span[@class='s-item__shipping s-item__logisticsCost']")
    public List<WebElement> getfreePostageCost;

    @FindBy(xpath = "//*[contains(text(),'Best Match')]")
    public WebElement bestMatchButton;

    @FindBy(xpath = "//*[@id=\"s0-30-7-5[0]-35-1-content-menu\"]/li[5]/a/span")
    public WebElement selectLowerPrice;

    @FindBy(xpath = "//*[contains(text(),'Lowest price')]")
    public WebElement lowestPriceBtn;

    @FindBy(xpath = "//*[contains(text(),'Highest price')]")
    public WebElement highestPriceBtn;

    @FindBy(xpath = "//*[@id=\"s0-30-7-5[0]-35-1-content-menu\"]/li[4]/a/span")
    public WebElement selectHigestPrice;

    @FindBy(xpath = "//span[@class='s-item__price']")
    public List <WebElement> getPriceList;

    @FindBy(xpath = "//*[@class='pagination__item']")
    public List <WebElement> pageNumberCount;












}


