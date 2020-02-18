package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends PageObject {

    private WebDriver _driver = null;

    @FindBy(linkText = "About Selenium")
    WebElementFacade aboutSeleniumLink;

    @FindBy(css = "#rso > div:nth-child(2) > div > div.kp-blk.cUnQKe.Wnoohf.OJXvsb > div > div.ifM9O > h2")
    WebElementFacade peopleAlsoAskLabel;

    public void assertAboutSeleniumLinkIsPresent(){
        Assert.assertTrue(aboutSeleniumLink.isDisplayed());
    }

    public void assertPeopleAlsoAskIsPresent(){
        Assert.assertTrue(peopleAlsoAskLabel.isDisplayed());
    }

}
