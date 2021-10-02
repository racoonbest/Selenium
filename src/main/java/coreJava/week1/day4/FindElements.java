package coreJava.week1.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/books?orderby=10&viewmode=list");

        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(1);
        addToCart1.click();
    }
}
