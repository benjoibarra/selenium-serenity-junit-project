package steps;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Dimension;
import pageobjects.GoogleSearchPage;
import pageobjects.SearchResultsPage;

public class SearchSteps extends ScenarioSteps {

    @ManagedPages
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Step
    public void openURL(){
        googleSearchPage.open();
        googleSearchPage.getDriver().manage().window().setSize(new Dimension(1440, 900));
    }

    @Step
    public void searchFor(String searchterm){
        googleSearchPage.searchFor(searchterm);
    }

    @Step
    public void assertSeleniumLinkPresent(){
        searchResultsPage.assertSeleniumPresent();
    }
}
