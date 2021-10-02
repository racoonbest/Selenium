package coreJava.week1.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/141-inch-laptop");

        WebElement productSpec = chrome.findElement(By.cssSelector(".product-specs-box>.title"));
        System.out.println(productSpec.getText());
    }
}
