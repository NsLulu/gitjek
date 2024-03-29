package com.ludovic.douglas.steps;

import com.ludovic.douglas.managers.DriverManager;
import com.ludovic.douglas.ui.home.HomePage;
import com.ludovic.douglas.ui.home.HomePageLocator;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;


public class HomePageSteps {
    private static HomePage homePage = null;

    public HomePageSteps() {
    }

    @Before
    public void setUp() {
        homePage = HomePage.initializeHomePage("chrome");
    }
    @When("the user navigates to {string}")
    public void the_user_navigates_to_string(String url) {
//        initializeHomePage("edge");
        homePage.navigateTo(url);
    }

    @When("the user click on the {string} button on cookie consent")
    public void the_user_click_on_the_string_button_on_cookie_consent(String button) {
        homePage.handleCookieConsent(button);
    }

    @And("the user click on {string} tab on home page")
    public void the_user_click_on_string_tab_on_home_page(String button) {
        homePage.homePageTab(button);
    }

    @Then("the user should see the headline {string}")
    public void the_user_should_see_the_headline_string(String text) {
        homePage.verifyElement(text);
    }

    @And("clicks on the 'Parfum' link")
    public void clicks_on_the_Parfum_link() {
        homePage.clickParfumLink();
    }
}
