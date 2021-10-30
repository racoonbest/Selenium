package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.TestSuiteSetup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetup.chrome;

public class OrderStatus {

    @When("Customer click to orders")
    public void customer_click_to_orders() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.partialLinkText("Orders")).click();
    }

    @Then("verify customer is on My account-order page")
    public void verify_customer_is_on_my_account_order_page() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String verify=chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Orders",verify);

    }
    @Then("Customer should see order number")
    public void customer_should_see_order_number() {
        String title=chrome.findElement(By.cssSelector(".info li:nth-child(1)")).getText();
        assertEquals("Order status: Pending",title);

    }
    @When("customer picks all the order numbers")
    public void customer_picks_all_the_order_numbers() {
        List<WebElement> numberOfOrder=chrome.findElements(By.cssSelector(".center-2 .title"));
        for(int i = 0; i < numberOfOrder.size(); i++) {

            System.out.println(numberOfOrder.get(i).getText());
        }


    }

    @When("Customer picks all the order numbers")
    public void customer_picks_all_the_order_numbers() {
        List<WebElement> verify = chrome.findElements(By.cssSelector(".center-2 .title"));
        //verify.get(1).getText();
        System.out.println(verify.get(1).getText());






    }
}
