package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetup.chrome;

public class Wishlist {


    @Given("Customer is on DemoShop home page wishlist")
    public void customer_is_on_demo_shop_home_page_wishlist() {
        chrome.get("http://demowebshop.tricentis.com/");
    }


    @When("Customer adds item to wishlist")
    public void customer_adds_item_to_wishlist() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector("#add-to-wishlist-button-22")).click();

    }
    @Then("Customer should see wishlist updated")
    public void customer_should_see_wishlist_updated() throws InterruptedException {
        Thread.sleep(2000);
        String wishlist=chrome.findElement(By.cssSelector(".wishlist-qty")).getText();
        assertEquals("(1)",wishlist);

    }
}
