package coreJava.week1.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");

        // Radio
        WebElement excellent = chrome.findElement(By.id("pollanswers-1"));
        excellent.click();


        // Checkbox
        WebElement terms = chrome.findElement(By.id("termsofservice"));
        terms.click();


    }
}
