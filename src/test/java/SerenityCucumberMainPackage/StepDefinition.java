package SerenityCucumberMainPackage;



import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.GooglePage;
import pageobjects.SearchResultsPage;

import static java.lang.Boolean.TRUE;

/**
 * Created by dhinesh.dillum on 20/12/16.
 */
public class StepDefinition {
   // @Managed(driver="chrome", uniqueSession = true)
  //  @Managed WebDriver driver;

    GooglePage googlePage;
    SearchResultsPage searchResultsPage;

    @Given("^User opens BBC website$")
    public void user_opens_BBC_website() throws Throwable {
        System.out.println("given stmt");
        Assert.assertTrue(TRUE);

        googlePage.open();
        searchResultsPage =googlePage.searchFor("BBC");
        Assert.assertTrue(googlePage.getTitle().equals("BBC - Google Search"));

        searchResultsPage.searchFor("webdriver issues");

        //System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        //driver = new FirefoxDriver();
//        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("http://www.bbc.co.uk");

    }

    @When("^User clicks on BBC News$")
    public void user_clicks_on_BBC_News() throws Throwable {
        System.out.println("when stmt");
        Assert.assertTrue(TRUE);
//        Assert.assertTrue(driver.getTitle().contains("BBC"));
        //driver.findElement(By.xpath(".//*[@id='orb-search-q']")).clear();
//        driver.findElement(By.partialLinkText("TV")).click();
    }

    @Then("^the BBC News page is obtained$")
    public void the_BBC_News_page_is_obtained() throws Throwable {
        System.out.println("then stmt");
        Assert.assertTrue(TRUE);
//        Assert.assertTrue(driver.getTitle().contains("TV"));
        System.out.println("Pass");
    }

    @After
    public void tearDown(){
//        driver.quit();


    }
}
