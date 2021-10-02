package coreJava.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        // 1. Open browser with url
        WebDriverManager.chromedriver().setup();//setting a driver
        WebDriver chrome = new ChromeDriver(); // selenium | object from ChromeDriver classes
        chrome.get("http://www.google.com/"); // open specific web page

        //2. Find search bar
        WebElement searchBar = chrome.findElement(By.name("q")); // find web-element and give a name
        searchBar.sendKeys("luxury cars"); // use web-element to type a text


        //3. click search button
        WebElement submitButton = chrome.findElement(By.id("btnK")); // find web-element and give a name
        submitButton.click(); // use web-element to click a button






    }
}
