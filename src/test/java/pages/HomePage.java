package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


import static org.testng.Assert.assertEquals;


/**
 * #Summary:
 * #Author: Mykola Motyshyn
 * #Author's Email:
 * #Created: 16/07/2024 - 11:18
 * #Comments:
 */

@Getter
public class HomePage {
    SoftAssert softAssert = new SoftAssert();
    public static final String PAGE_IDENTIFIER = "Home Page";
    private WebDriver driver;
    private final By searchField = By.xpath("//input[@name='search_query']");
    private final By searchButton = By.xpath("//button[@id='search-icon-legacy']");
    private final By youtube = By.xpath("//a[@title='YouTube Home']");
    private final By videoTitles = By.xpath("//*[@id='video-title']");
    private final By videoTitle = By.xpath("//*[contains(text(),'Welcome to TestRail')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isDisplayed() {
        driver.findElement(searchButton).isDisplayed();
    }


    public void enterSearchValue(String value) {
        driver.findElement(searchField).sendKeys(value);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickYouTubeButton() {
        driver.findElement(youtube).click();
    }

    public void getTitles() {
        int titles = driver.findElements(videoTitles).toArray().length;
        assertEquals(titles, titles);
        softAssert.assertAll();
    }
}
