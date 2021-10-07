package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepDefinitions.TestSuiteSetup.chrome;
import static stepDefinitions.TestSuiteSetup.wait;

public class TermsAndConditions {


    @Then("Customer should see error pop-up")
    public void customer_should_see_error_pop_up() {
         wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".ui-dialog")));
         String error = chrome.findElement(By.cssSelector(".ui-dialog")).getText();
        System.out.println(error);
    }
}
