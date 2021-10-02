package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wishlist {

    WebDriver chrome;
    @Given("Customer is on DemoShop home page wishlist")
    public void customer_is_on_demo_shop_home_page_wishlist() {
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
    }
    @When("Customer adds item to wishlist")
    public void customer_adds_item_to_wishlist() {

    }
    @Then("Customer should see wishlist updated")
    public void customer_should_see_wishlist_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
