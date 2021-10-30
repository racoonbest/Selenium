package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.IOException;

public class TestSuiteSetup{

    public static WebDriver chrome;
    public static WebDriverWait wait;
    public static BufferedWriter writer;

    @Before()
    public void setupSuite() {
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
        chrome.manage().deleteAllCookies();
        wait = new WebDriverWait(chrome, 20);
    }

    @After()
    public void tearDown() throws IOException {
        chrome.quit();

        if(writer != null){
            writer.close();
        }
    }

}
