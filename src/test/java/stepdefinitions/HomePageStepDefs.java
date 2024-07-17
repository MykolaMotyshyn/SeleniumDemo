package stepdefinitions;

import Driver.DriverInit;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.HomePage;




/**
 * #Summary:
 * #Author: Mykola Motyshyn
 * #Author's Email:
 * #Created: 16/07/2024 - 11:00
 * #Comments:
 */
public class HomePageStepDefs {
    HomePage homePage = new HomePage(DriverInit.getInstance());

    @Given("user opens browser with web site address")
    public void userOpensBrowser(){
        DriverInit.getInstance();
    }

    @Then("user checks the search input field is displayed")
    public void userChecksSearchField(){
        homePage.isDisplayed();
    }

    @When("user enter {string} to search input field")
    public void userEntersValueToSearchField(String value){
        homePage.enterSearchValue(value);
        homePage.clickSearchButton();
    }

    @Then("user checks titles")
        public void userGatherAllVideoTitles(){
        homePage.getTitles();
    }

    @Then("user clicks main button")
        public void userClicksMainYouTubeButton(){
        homePage.clickYouTubeButton();
    }
}
