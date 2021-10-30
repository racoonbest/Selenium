package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetup.chrome;

public class Amazon {
    @When("User is on amazon home page")
    public void user_is_on_amazon_home_page() {
       chrome.get("https://www.amazon.com/");
    }

    @When("Hover over the mouse to sign in frame")
    public void hover_over_the_mouse_to_sign_in_frame() {
        chrome.findElement(By.cssSelector("#nav-link-accountList"));
    }

    @Then("User should able to see hover over tob")
    public void user_should_able_to_see_hover_over_tob() {
       String verify=chrome.findElement(By.cssSelector("nav-link-accountList")).getText();
    }
}
