package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class QueryCardPage {
   public QueryCardPage(){
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
    }

   //ihsan
   @AndroidFindBy (accessibility = "Sign In")
   public WebElement signInButton;
   @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Profile']")
   public WebElement profileButton;
   @AndroidFindBy(xpath = "//android.widget.EditText[1]")
   public WebElement emailBox;
   @AndroidFindBy(xpath = "//android.widget.EditText[2]")
   public WebElement passwordBox;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign In'])[2]")
   public WebElement signIn;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign In'])[1]")
   public WebElement signText;
   @AndroidFindBy(xpath = "//*[@content-desc='*Use Email Instead']")
   public WebElement useEmail;
   @AndroidFindBy(xpath = "//*[@content-desc='Sign Up']")
   public WebElement signUpButton;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[1]")
   public WebElement nameBox;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[2]")
   public WebElement emailBox2;
   @AndroidFindBy(xpath = "//*//android.widget.EditText[3]")
   public WebElement passwordBox2;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[1]")
   public WebElement signUp1;
   @AndroidFindBy(xpath = "(//*[@content-desc='Sign Up'])[2]")
   public WebElement signUp2;
   @AndroidFindBy(xpath = "//*[@content-desc='This field is required']")
   public WebElement blankAlert;
   @AndroidFindBy(xpath = "(//*[@index='1'])[3]")
   public WebElement productHeader;
   @AndroidFindBy(xpath = "//*[@content-desc='Product Details']")
   public WebElement productDetails;
   @AndroidFindBy(xpath = "//*[@index='10']")
   public WebElement productDetailsContext;
   @AndroidFindBy(xpath = "//*[@content-desc='Videos']")
   public WebElement videosButton;
   @AndroidFindBy(xpath = "//*[@content-desc='Product Videos']")
   public WebElement videosTitle;
   @AndroidFindBy(xpath = "//*[@content-desc='Review']")
   public WebElement reviewButton;
   @AndroidFindBy(xpath = "//*[@content-desc='Product Reviews']")
   public WebElement reviewTitle;
   @AndroidFindBy(xpath = "//*[@content-desc='Shipping & Return']")
   public WebElement shippingButton;
   @AndroidFindBy(xpath = "(//*[@content-desc='Shipping & Return'])[2]")
   public WebElement shippingTitle;
   @AndroidFindBy(xpath = "//*[@content-desc='Order History']")
   public WebElement orderHistory;
   @AndroidFindBy(xpath = " //*[@content-desc='Your Order status is as follows']")
   public WebElement orderHistoryPage;
   @AndroidFindBy(xpath = "//*[@content-desc='Download Receipt']")
   public WebElement downloadReceipt;
   @AndroidFindBy(xpath = "//(//*[@content-desc='QueryCart - Shop Smarter, Live Better'])[1]")
   public WebElement receipt;
   @AndroidFindBy(xpath = "//*[@content-desc='Cancel Order']")
   public WebElement cancelOrder;
   @AndroidFindBy(xpath = "//*[@content-desc='Order Canceled']")
   public WebElement canceledOrder;
   @AndroidFindBy(xpath = "//*[@content-desc='S']")
   public WebElement size;
   @AndroidFindBy(xpath = "//*[@content-desc='Add To Cart']")
   public WebElement addToCartButton;
   @AndroidFindBy(xpath = "//*[@content-desc='Proceed to Checkout']")
   public WebElement proceedToCheckout;
   @AndroidFindBy(xpath = "//*[@content-desc='Save & Pay']")
   public WebElement savePay;
   @AndroidFindBy(xpath = "//*[@content-desc='Select Payment Method']")
   public WebElement paymentMethod;
   @AndroidFindBy(xpath = "//*[@content-desc='Stripe']")
   public WebElement stripe;
   @AndroidFindBy(xpath = "//*[@content-desc='Confirm Order']")
   public WebElement confirmOrderButton;

   //===================================================================================================================
   //reyyan

   @AndroidFindBy(xpath = "//*[@content-desc='Women']")
   public WebElement womanButton;
   @AndroidFindBy(accessibility = "Casual Women Shoes")
   public WebElement womanShoes;
   @AndroidFindBy(accessibility= "White")
   public WebElement colorWhite;
   @AndroidFindBy(accessibility = "Quantity:")
   public WebElement quantity;
   @AndroidFindBy(accessibility = "My Account")
   public WebElement dashboard;
   @AndroidFindBy(accessibility = "Total Orders")
   public WebElement summaryInformation;

   //===================================================================================================================
   //senayda
   @AndroidFindBy (xpath = "(//android.view.View[1]/android.widget.ImageView[1])[1]")
   public WebElement homePageLogo;

   //===================================================================================================================
   //Azim
   @AndroidFindBy(xpath ="//android.view.View[@content-desc='Juniors']")
   public WebElement viewJuniors;
   @AndroidFindBy(xpath ="//android.widget.ScrollView")
   public WebElement JuniorsProduct;
   @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='Logout']")
   public WebElement logoutButton;

   //===================================================================================================================
   //hümeyra



   //===================================================================================================================
   //murat


}
