package coreJava.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome  = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");

        Select country = new Select(chrome.findElement(By.id("CountryId")));
        country.selectByVisibleText("United States");

    }
}
