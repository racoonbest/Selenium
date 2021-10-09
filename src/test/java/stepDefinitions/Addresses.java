package stepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetup.chrome;

public class Addresses {
    @When("Customer click to addresses")
    public void customer_click_to_addresses() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(By.partialLinkText("Addresses")).click();
    }
    @Then("verify customer is on My account - Addresses")
    public void verify_customer_is_on_my_account_addresses() throws InterruptedException {
        Thread.sleep(2000);
        String title = chrome.findElement(By.cssSelector(".page-title h1:nth-child(1)")).getText();
        assertEquals("My account - Addresses",title);

    }
    @Then("Verify customer name is John Smith")
    public void verify_customer_name_is_john_smith() throws InterruptedException {
        Thread.sleep(2000);
        String verifyName = chrome.findElement(By.cssSelector(".info li:nth-child(1)")).getText();
        assertEquals("John Smith",verifyName);
    }


}
