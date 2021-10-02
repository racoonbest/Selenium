package coreJava.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Day2Task {
    public static void main(String[] args) {

        //start code here
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com/");
        WebElement bar = chrome.findElement(By.name("q"));
        bar.sendKeys("ali");
        bar.submit();
        WebElement link = chrome.findElement(By.partialLinkText("Watch Muhammad Ali | Full Documentary"));
        link.click();
    }
}
