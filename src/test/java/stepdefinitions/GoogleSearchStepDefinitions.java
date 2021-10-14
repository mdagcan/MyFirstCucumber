package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utulities.Driver;

import java.util.Locale;

public class GoogleSearchStepDefinitions {
    GooglePage googlePage;
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user search for iphone")
    public void user_search_for_iphone() {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        String pageTitle = Driver.getDriver().getTitle().toLowerCase(Locale.ROOT);
        Assert.assertTrue(pageTitle.contains("iphone"));
    }

    @When("user search for teapot")
    public void user_search_for_teapot() {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("teapot"+Keys.ENTER);
    }

    @Then("verify the result has teapot")
    public void verify_the_result_has_teapot() {
        String pageTitle = Driver.getDriver().getTitle().toLowerCase(Locale.ROOT);
        Assert.assertTrue(pageTitle.contains("teapot"));
    }

    @When("user search for flower")
    public void user_search_for_flower() {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("flower"+Keys.ENTER);
    }

    @Then("verify the result has flower")
    public void verify_the_result_has_flower() {
        String pageTitle = Driver.getDriver().getTitle().toLowerCase(Locale.ROOT);
        Assert.assertTrue(pageTitle.contains("flower"));
    }

    @When("user search for BMW")
    public void user_search_for_BMW() {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("BMW"+Keys.ENTER);
    }

    @Then("verify the result has BMW")
    public void verify_the_result_has_BMW() {
        String pageTitle = Driver.getDriver().getTitle().toLowerCase(Locale.ROOT);
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.contains("bmw"));
    }
}
