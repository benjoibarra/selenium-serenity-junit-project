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
    public void when_I_open_Google_url(){
        googleSearchPage.open();
        googleSearchPage.getDriver().manage().window().setSize(new Dimension(1440, 900));
    }

    @Step
    public void when_I_search_for(String searchterm){
        googleSearchPage.searchFor(searchterm);
    }

    @Step
    public void then_the_about_Selenium_link_text_is_displayed(){
        searchResultsPage.assertAboutSeleniumLinkIsPresent();
    }

    @Step
    public void then_the_People_also_ask_displayed(){
        searchResultsPage.assertPeopleAlsoAskIsPresent();
    }
}
