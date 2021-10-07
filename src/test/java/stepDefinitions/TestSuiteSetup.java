package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSuiteSetup{

    public static WebDriver chrome;
    public static WebDriverWait wait;

    @Before()
    public void setupSuite() {
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
        chrome.manage().deleteAllCookies();
        wait = new WebDriverWait(chrome, 20);
    }

    @After()
    public void tearDown() {
//        chrome.quit();
    }

}
