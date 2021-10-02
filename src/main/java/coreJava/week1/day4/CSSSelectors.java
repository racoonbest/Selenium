package coreJava.week1.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSSSelectors {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.amazon.com/");


        List<WebElement> buttons = chrome.findElements(By.cssSelector("input"));

        System.out.println(buttons.size());

    }
}
