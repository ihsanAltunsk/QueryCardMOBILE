package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;

import static utilities.ReusableMethods.clickAndVerify;
import static utilities.ReusableMethods.signIn;

public class CommonStepdefinitions extends Base {
    @Given("User logs in {string}.")
    public void user_logs_in(String properties) throws InterruptedException {
        signIn(ConfigReader.getProperty(properties) , ConfigReader.getProperty("password"));
    }
    @Given("User clicks on profile button.")
    public void user_clicks_on_profile_button() {
        clickAndVerify(queryCardPage.profileButton);
    }
}
