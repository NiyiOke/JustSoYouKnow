package com.Jpmc.Step_definition;

import com.Jpmc.DriverInstance;
import com.Jpmc.verifyNewsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ResourceBundle;


public class verifyNewsTest extends DriverInstance {
    ResourceBundle config = ResourceBundle.getBundle("config");
    verifyNewsPage verifyNP = new verifyNewsPage(driver);

    @Given("^I navigate to the guardian news website$")
    public void i_navigate_to_the_guardian_news_website() throws Throwable {
        driver.get(config.getString("URL"));

    }

    @When("^I click on the news link from the menu$")
    public void i_click_on_the_news_link_from_the_menu() throws Throwable {

        verifyNP.clickCookie();
        verifyNP.clickNews();
    }

    @When("^I select the headlines news$")
    public void i_select_the_headlines_news() throws Throwable {
        verifyNP.clickHeadlineNews();

    }

    @Then("^I should be able to see the news page of that headline$")
    public void i_should_be_able_to_see_the_news_page_of_that_headline() throws Throwable {
        //verifyNP.closeGuardianSupport();
        System.out.println(verifyNP.getHeadline());
    }

    @Then("^I should be able to copy and save to file the headline of the news$")
    public void i_should_be_able_to_copy_and_save_to_file_the_headline_of_the_news() throws Throwable {
        verifyNP.saveTextToFile();
        driver.close();
    }

    @Given("^I navigate to google website$")
    public void i_navigate_to_google_website() throws Throwable {
        driver.get(config.getString("URL2"));

    }

    @When("^I search for the headline news from the guardian site$")
    public void i_search_for_the_headline_news_from_the_guardian_site() throws Throwable {
        verifyNP.enterGoogleText();

    }

    @Then("^I should see a list of other sources with similar news details$")
    public void i_should_see_a_list_of_other_sources_with_similar_news_details() throws Throwable {
        verifyNP.clickGoogleSearchBtn();
    }

    @Then("^I am able to confirm that the news article Fake or not$")
    public void i_am_able_to_confirm_that_the_news_article_Fake_or_not() throws Throwable {
        Assert.assertTrue(verifyNP.isResultCountAtLeast(5));
        System.out.println(verifyNP.isResultCountAtLeast(5));
        driver.close();
    }


}
