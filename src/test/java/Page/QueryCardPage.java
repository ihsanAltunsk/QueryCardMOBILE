package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class QueryCardPage {
   public QueryCardPage(){
       PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    public WebElement queryCardLogoElement;
    @AndroidFindBy (xpath = "(//android.widget.ImageView[1])[2]")
    public WebElement searchBoxElement;
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

}
