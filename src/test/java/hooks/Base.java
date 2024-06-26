package hooks;

import Page.QueryCardPage;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public abstract class Base {
    public static String email, password, name, phoneNumber, country,
                         state, city, zipCode, streetAddress;
    public static int cc, cvc,zip;
    public static long card_number;
    public static Random random;
    public static Faker faker;
    public static UiAutomator2Options options;
    public static AppiumDriver driver;
    public static QueryCardPage queryCardPage;
    public static Actions actions;

    public static void initialize(){
        faker = new Faker();
        random = new Random();
        options = new UiAutomator2Options();
        queryCardPage = new QueryCardPage();
        actions = new Actions(driver);
    }
}