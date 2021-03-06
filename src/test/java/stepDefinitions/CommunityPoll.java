package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;

import static stepDefinitions.TestSuiteSetup.chrome;

public class CommunityPoll {
    @When("Customer click to excellent")
    public void customer_click_to_excellent() {
      chrome.findElement(By.cssSelector("#pollanswers-1")).click();
    }

    @When("Customer click to vote")
    public void customer_click_to_vote() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("#vote-poll-1")).click();
      
    }

    @Then("Verify text:Only register Customer can vote")
    public void verify_text_only_register_customer_can_vote() throws InterruptedException {
        Thread.sleep(1000);
        String massage= chrome.findElement(By.cssSelector("#block-poll-vote-error-1")).getText();

        assertEquals("Only registered users can vote.",massage);
      
    }

}
