package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends PageObject {

    private WebDriver _driver = getDriver();

    @FindBy(css = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")
    WebElementFacade searchbox;

    public void searchFor(String _searchTerm) {
        searchbox.waitUntilVisible().sendKeys(_searchTerm + Keys.RETURN);
    }

}
