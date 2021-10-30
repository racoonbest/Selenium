package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    @Then("Verify customer all addresses")
    public void verify_customer_all_addresses() {
        List<WebElement> addresses=chrome.findElements(By.cssSelector(".info"));
        for(int i=0; i< addresses.size(); i++){
            System.out.println(addresses.get(i).getText());

        }


    }



}
