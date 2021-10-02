package coreJava.week1.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.amazon.com/");


        //dropdown
        Select categories = new Select(chrome.findElement(By.id("searchDropdownBox")));
        categories.selectByVisibleText("Amazon Fresh");

    }
}
