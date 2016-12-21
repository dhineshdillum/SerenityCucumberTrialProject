package SerenityCucumberMainPackage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by dhinesh.dillum on 20/12/16.
 */
public class StepDefinition {


    @Given("^User opens BBC website$")
    public void user_opens_BBC_website() throws Throwable {
        System.out.println("given stmt");
    }

    @When("^User clicks on BBC News$")
    public void user_clicks_on_BBC_News() throws Throwable {
        System.out.println("when stmt");
    }

    @Then("^the BBC News page is obtained$")
    public void the_BBC_News_page_is_obtained() throws Throwable {
        System.out.println("then stmt");
    }
}
