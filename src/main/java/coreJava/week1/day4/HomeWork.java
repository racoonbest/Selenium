package coreJava.week1.day4;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
        WebElement books=chrome.findElement(By.partialLinkText("Books"));
        books.click();
        Select sortBy=new Select(chrome.findElement(By.id("products-orderby")));
        sortBy.selectByVisibleText("Price: Low to High");
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();
        WebElement shoppingCart=chrome.findElement(By.partialLinkText("Shopping cart"));
        shoppingCart.click();
        WebElement agrement=chrome.findElement(By.id("termsofservice"));
        agrement.click();
        WebElement checkOut=chrome.findElement(By.id("checkout"));
        checkOut.click();
        WebElement checkOutAsGuest=chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        checkOutAsGuest.click();
        WebElement firstName=chrome.findElement(By.id("BillingNewAddress_FirstName"));
        firstName.sendKeys("John");
        WebElement lastName=chrome.findElement(By.id("BillingNewAddress_LastName"));
        lastName.sendKeys("Jones");
        WebElement email=chrome.findElement(By.id("BillingNewAddress_Email"));
        email.sendKeys("John123@gmail.com");
        Select country=new Select(chrome.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("United States");
        //   Select state=new Select(chrome.findElement(By.id("BillingNewAddress.StateProvinceId")));
        //   state.deselectByValue("4");
        WebElement city=chrome.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Brookly");
        WebElement address=chrome.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("123 nowhere");
        WebElement zipcode=chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipcode.sendKeys("11230");
        WebElement phoneNumber=chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("1234567890");
        WebElement selectBillingAddress =chrome.findElement(By.cssSelector("#billing-buttons-container .button-1.new-address-next-step-button"));
        selectBillingAddress.click();
        // WebElement pickUpStore =chrome.findElement(By.xpath("//*[@id=\"checkout-shipping-load\"]/div/div[2]"));
        //  pickUpStore.click();
        Thread.sleep(2000);
        WebElement shippingAddress=chrome.findElement(By.cssSelector("#PickUpInStore"));
        shippingAddress.click();
        Thread.sleep(2000);
        WebElement continueButton = chrome.findElement(By.cssSelector("#shipping-buttons-container .button-1"));
        continueButton.click();
    }
}
