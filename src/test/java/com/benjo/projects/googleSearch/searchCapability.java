package com.benjo.projects.googleSearch;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SearchSteps;

@RunWith(SerenityRunner.class)
public class searchCapability {

    @Managed
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Before
    public void openUrl () {
        searchSteps.when_I_open_Google_url();
    }

    @Test
    public void checkResultLink(){
        searchSteps.when_I_search_for("Selenium");
        searchSteps.then_the_about_Selenium_link_text_is_displayed();
    }

    @Test
    public void checkPeopleAlsoAsk(){
        searchSteps.when_I_search_for("what is selenium");
        searchSteps.then_the_People_also_ask_displayed();
    }
}
