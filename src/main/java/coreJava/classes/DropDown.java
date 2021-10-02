package coreJava.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome  = new ChromeDriver();
        chrome.get("https://www.amazon.com/");

        Select categories = new Select(chrome.findElement(By.id("searchDropdownBox")));
        System.out.println(categories.getOptions().size());
        categories.selectByValue("search-alias=audible");
        categories.selectByVisibleText("Alexa Skills");
        System.out.println(categories.isMultiple());



    }
}
