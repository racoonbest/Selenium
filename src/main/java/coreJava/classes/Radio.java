package coreJava.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver chrome  = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");

        WebElement excellent = chrome.findElement(By.id("pollanswers-1"));
        excellent.click();
        System.out.println(excellent.isDisplayed());
        System.out.println(excellent.isEnabled());
        System.out.println(excellent.isSelected());


    }
}
