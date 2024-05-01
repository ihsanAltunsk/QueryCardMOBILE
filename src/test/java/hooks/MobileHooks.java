package hooks;

import io.cucumber.java.Before;

import static utilities.Driver.getAppiumDriver;

public class MobileHooks {
    @Before
    public void startUp() throws InterruptedException {
        Base.initialize();
        getAppiumDriver();
        Thread.sleep(4000);
    }
}
