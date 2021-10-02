package coreJava.week1.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/141-inch-laptop");

        WebElement reviewLink = chrome.findElement(By.partialLinkText("review(s)"));
        System.out.println(reviewLink.isEnabled());

        chrome.findElement(By.id("add-to-cart-button-31")).click();
        chrome.findElement(By.partialLinkText("Shopping cart")).click();

        WebElement checkout = chrome.findElement(By.id("checkout"));


        WebElement terms = chrome.findElement(By.id("termsofservice"));
        System.out.println(terms.isSelected());
        terms.click();
        System.out.println(terms.isSelected());
    }


}
