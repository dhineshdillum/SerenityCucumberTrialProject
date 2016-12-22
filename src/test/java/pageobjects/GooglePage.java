package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@DefaultUrl("http://www.google.com")
public class GooglePage extends PageObject {

    @FindBy(name="q")
    WebElement search;

    public SearchResultsPage searchFor(String keywords) {
        search.clear();
        search.sendKeys(keywords, Keys.ENTER);
        waitFor(titleContains("Google Search"));
        return new SearchResultsPage();
    }

}
