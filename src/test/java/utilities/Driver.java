package utilities;

import hooks.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver extends Base {
    private Driver() {
    }

    public static AppiumDriver getAppiumDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options.setPlatformName("Android").setAutomationName("UiAutomator2");
                    options.setApp("src/test/java/Apps/querycart1.0.apk");
                    options.setAppPackage("com.inilabs.shopking");
                    options.setAppActivity("com.inilabs.shopking.MainActivity");
                    options.setUdid("emulator-5554");
                    options.setNoReset(false);
                    options.setNewCommandTimeout(Duration.ofMinutes(20));
                    try {
                        driver = new AndroidDriver(
                                new URL("http://0.0.0.0:4723"), options
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case "IOS":
                    options.setPlatformName("Ios").setAutomationName("XCUITest");
                    options.setApp("src/test/java/Apps/querycart1.0.app");
                    options.setAppPackage("com.inilabs.shopking");
                    options.setAppActivity("com.inilabs.shopking.MainActivity");
                    options.setUdid("emulator-5554");
                    options.setNoReset(false);
                    options.setNewCommandTimeout(Duration.ofMinutes(20));
                    try {
                        driver = new AndroidDriver(
                                new URL("http://0.0.0.0:4723"), options
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    throw new RuntimeException("Desteklenmeyen Platform");
            }
        }
        return driver;
    }
}
