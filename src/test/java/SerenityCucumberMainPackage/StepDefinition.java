package SerenityCucumberMainPackage;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import org.junit.Assert;

import static java.lang.Boolean.TRUE;

/**
 * Created by dhinesh.dillum on 20/12/16.
 */
public class StepDefinition {

    @Given("^User opens BBC website$")
    public void user_opens_BBC_website() throws Throwable {
        System.out.println("given stmt");
        Assert.assertTrue(TRUE);
    }

    @When("^User clicks on BBC News$")
    public void user_clicks_on_BBC_News() throws Throwable {
        System.out.println("when stmt");
        Assert.assertTrue(false);
    }

    @Then("^the BBC News page is obtained$")
    public void the_BBC_News_page_is_obtained() throws Throwable {
        System.out.println("then stmt");
        Assert.assertTrue(TRUE);
    }
}
