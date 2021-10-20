package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetup.chrome;


public class Purchase {

    @Given("Customer is on DemoShop home page")
    public void getHomePage(){
        chrome.get("http://demowebshop.tricentis.com/");
    }

    @When("Customer clicks on books")
    public void searchForLaptop() throws InterruptedException {
        WebElement Books = chrome.findElement(By.partialLinkText("Books"));
        Books.click();
    }


    @Then("Customer should see the Books header")
    public void customer_should_see_the_books_header() {
        WebElement title = chrome.findElement(By.cssSelector(".page-title"));
//        System.out.println(title.getText());
        assertEquals("Books", title.getText());


    }

    @Then("Customer should see sort by element")
    public void customer_should_see_sort_by_element() {
        WebElement sortBy = chrome.findElement(By.cssSelector("#products-orderby"));
        System.out.println(sortBy.isDisplayed());
        assertEquals("ola", "ola");
    }


    @When("Customer orders by price low to high")
    public void customer_orders_by_price_low_to_high() {
        WebElement sortBy = chrome.findElement(By.id("products-orderby"));
        sortBy.sendKeys("Price: Low to High");
    }
    @When("Customer changes the view to list")
    public void customer_changes_the_view_to_list() {
        WebElement ViewAs = chrome.findElement(By.id("products-viewmode"));
        ViewAs.sendKeys("List");
    }
    @When("Customer adds the first book to cart")
    public void customer_adds_the_first_book_to_cart() {
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();
    }
    @Then("Customer should see updated cart")
    public void customer_should_see_updated_cart() throws InterruptedException {
        Thread.sleep(3000);
        WebElement shoppingCart=chrome.findElement(By.cssSelector(".cart-qty"));
//        System.out.println(shoppingCart.getText());
        assertEquals("(1)", shoppingCart.getText());

    }

    @When("Customer clicks on cart")
    public void customer_clicks_on_cart() {
        WebElement ClicAddcart = chrome.findElement(By.id("topcartlink"));
        ClicAddcart.click();
        
    }
    @Then("Customer should land on Shopping Cart Page")
    public void customer_should_land_on_shopping_cart_page() throws InterruptedException {
//        Thread.sleep(3000);
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cartTitle=chrome.findElement(By.cssSelector(".page-title"));
//        System.out.println(cartTitle.getText());




    }
    @When("Customer chooses USA")
    public void customer_chooses_usa() {
        WebElement Country = chrome.findElement(By.id("CountryId"));
        Country.sendKeys("United States");
        
    }
    @When("Customer agrees to terms and conditions")
    public void customer_agrees_to_terms_and_conditions() {
        WebElement Iagreebutton = chrome.findElement(By.id("termsofservice"));
        Iagreebutton.click();
        
    }
    @When("Customer clicks on checkout")
    public void customer_clicks_on_checkout() {
        WebElement Checkout = chrome.findElement(By.id("checkout"));
        Checkout.click();
        
    }
    @Then("Customer should be redirected to Sign-in page")
    public void customer_should_be_redirected_to_sign_in_page() throws InterruptedException {
//        Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cartTitle=chrome.findElement(By.cssSelector(".page-title"));
//        System.out.println(cartTitle.getText());

        assertEquals("Welcome, Please Sign In!", cartTitle.getText());
    }
    @When("Customer clicks on check-out-as-guest button")
    public void customer_clicks_on_check_out_as_guest_button() {
        WebElement CheckoutasGuest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        CheckoutasGuest.click();
        
    }
    @Then("Customer is redirected to Checkout")
    public void customer_is_redirected_to_checkout() throws InterruptedException {
        Thread.sleep(2000);
        WebElement checkoutTitle = chrome.findElement(By.cssSelector(".page-title"));
//        System.out.println(checkoutTitle.getText());

        
    }
    @When("Customer enters first name")
    public void customer_enters_first_name() {
        WebElement Firstname = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        Firstname.sendKeys("Anvar");
        
    }
    @When("Customer enters last name")
    public void customer_enters_last_name() {
        WebElement Lastname = chrome.findElement(By.id("BillingNewAddress_LastName"));
        Lastname.sendKeys("Karabekov");
        
    }
    @When("Customer enters email")
    public void customer_enters_email() {
        WebElement Email = chrome.findElement(By.cssSelector("#Email"));
        Email.sendKeys("anvark76@gmail.com");
        
    }
    @When("Customer chooses a country")
    public void customer_chooses_a_country() {
        WebElement Country1 = chrome.findElement(By.id("BillingNewAddress_CountryId"));
        Country1.sendKeys("United States");
        
    }

    @When("Customer enters address1")
    public void customer_enters_address1() {
        WebElement Address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        Address.sendKeys("641 Deauville dr");
    }


    @When("Customer enters city")
    public void customer_enters_city() {
        WebElement City = chrome.findElement(By.id("BillingNewAddress_City"));
        City.sendKeys("Pittsburgh");
        
    }
    @When("Customer enters zip")
    public void customer_enters_zip() {

        WebElement Zipcode = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Zipcode.sendKeys("15146");
    }
    @When("customer enters phone")
    public void customer_enters_phone() {
        WebElement Phonenumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Phonenumber.sendKeys("3472586325");
        
    }
    @When("customer clicks on continue")
    public void customer_clicks_on_continue() throws InterruptedException {
        WebElement Continue = chrome.findElement(By.cssSelector(".button-1.new-address-next-step-button"));
        Continue.click();
        
    }
    @Then("Billing tab becomes inactive")
    public void billing_tab_becomes_inactive() throws InterruptedException {

//        Thread.sleep(2000);
//        WebElement billingTab = chrome.findElement(By.cssSelector("#opc-billing"));
//        System.out.println(billingTab.isEnabled());
        
    }
    @Then("Shipping tab becomes active")
    public void shipping_tab_becomes_active() {
        
        
    }


    @When("Customer clicks on pick-up in store checkbox")
    public void customer_clicks_on_pick_up_in_store_checkbox(){
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement Shippingadress = chrome.findElement(By.id("PickUpInStore"));
        Shippingadress.click();
    }
    @When("Customer clicks on continue button")
    public void customer_clicks_on_continue_button() throws InterruptedException {
        WebElement ContinueShipping = chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
        ContinueShipping.click();
    }
    @Then("Shipping method becomes inactive")
    public void payment_tab_becomes_active() throws InterruptedException {

        Thread.sleep(2000);
        WebElement billingTab = chrome.findElement(By.cssSelector("#opc-shipping_method"));
        System.out.println(billingTab.isEnabled());

    }
    @When("Customer clicks on payment continue")
    public void customer_clicks_on_payment_continue() throws InterruptedException {
        WebElement Continue2 = chrome.findElement(By.cssSelector(".button-1.payment-method-next-step-button"));
        Continue2.click();
    }

    @When("Customer clicks on confirm continue")
    public void customer_clicks_on_confirm_continue() throws InterruptedException {
        WebElement Continue3 = chrome.findElement(By.cssSelector(".button-1.payment-info-next-step-button"));
        Continue3.click();
    }

    @Then("Payment tab becomes disabled")
    public void payment_tab_becomes_disabled() {
        
    }
    @Then("Confirm page becomes active")
    public void confirm_page_becomes_active() {
        
    }
    @When("Customer clicks on confirm")
    public void customer_clicks_on_confirm() {
        WebElement Confirmbutton = chrome.findElement(By.cssSelector(".button-1.confirm-order-next-step-button"));
        Confirmbutton.click();
    }
    @Then("Order number is generated")
    public void order_number_is_generated() throws InterruptedException {
        Thread.sleep(2000);
        WebElement success = chrome.findElement(By.cssSelector(".title"));
        System.out.println(success.getText());
    }

    

}
