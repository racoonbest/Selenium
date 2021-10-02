package coreJava.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebElements{

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome  = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/books");
        WebElement input = chrome.findElement(By.partialLinkText("Electronics"));
        input.click();

    }

}