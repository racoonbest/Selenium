package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

import static org.junit.Assert.assertEquals;

public class LogIn {

    WebDriver chrome;

    @Given("Customer is on DemoShop home page login")
    public void customer_is_on_demo_shop_home_page_login() {
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
    }
    @When("Customer clicks on log in")
    public void customer_clicks_on_log_in() {
        chrome.findElement(By.cssSelector("a.ico-login")).click();
    }
    @Then("Customer should land on sign in page")
    public void customer_should_land_on_sign_in_page() {
        String title = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Welcome, Please Sign In!", title);
    }
    @When("Customer enters an email")
    public void customer_enters_an_email() {
        chrome.findElement(By.cssSelector("#Email")).sendKeys("123412341234@gmail.com");
    }
    @When("Customer enters valid password")
    public void customer_enters_valid_password() {
        chrome.findElement(By.cssSelector("#Password")).sendKeys("123412341234");
    }
    @When("Customer click on remember me")
    public void customer_click_on_remember_me() {
        chrome.findElement(By.cssSelector("#RememberMe")).click();
    }
    @When("Customer click on log in")
    public void customer_click_on_log_in() {
        chrome.findElement(By.cssSelector(".button-1.login-button")).click();
    }
    @Then("Customer should see log out")
    public void customer_should_see_log_out() {
        String xyz = chrome.findElement(By.cssSelector(".ico-logout")).getText();
        assertEquals("Log out", xyz);
    }


}
