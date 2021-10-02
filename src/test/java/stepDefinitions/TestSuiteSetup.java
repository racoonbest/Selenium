package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSuiteSetup{

    public static WebDriver chrome;

//    @Before()
//    public void setupSuite() {
//        WebDriverManager.chromedriver().setup();
//        chrome = new ChromeDriver();
//        chrome.manage().deleteAllCookies();
//    }

    @After()
    public void tearDown() {
//        chrome.quit();
    }

}
