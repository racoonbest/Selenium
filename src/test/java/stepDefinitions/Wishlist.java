package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetup.chrome;

public class Wishlist {


    @Given("Customer is on DemoShop home page wishlist")
    public void customer_is_on_demo_shop_home_page_wishlist() {
        chrome.get("http://demowebshop.tricentis.com/");
    }
    @When("Click on add to wishlist")
    public void click_on_add_to_wishlist() {
        chrome.findElement(By.cssSelector("#add-to-wishlist-button-22")).click();

    }
    @Then("wishlist cart should get updated \\({int}) to \\({int})")
    public void wishlist_cart_should_get_updated_to(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(2000);
        String wishlist=chrome.findElement(By.cssSelector(".wishlist-qty")).getText();
        assertEquals("(1)",wishlist);

    }
}
