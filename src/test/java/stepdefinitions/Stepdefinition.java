package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import utilities.Driver;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class Stepdefinition extends Base {

    //İhsan
    @Given("User clicks on signUp button and displays the signUp page")
    public void user_clicks_on_sign_up_button_and_displays_the_sign_up_page() {
        clickAndVerify(queryCardPage.signUpButton);
        assertTrue(queryCardPage.signUp1.isDisplayed());
    }
    @Given("User clicks on name box and enters a valid name.")
    public void user_clicks_on_name_box_and_enters_a_valid_name() {
        name = faker.name().fullName();
        clickAndSendKeys(queryCardPage.nameBox, name);
    }
    @Given("User chooses -*Use email instead- and clicks on email box then enters a valid email.")
    public void user_chooses_and_clicks_on_email_box_then_enters_a_valid_email() {
        clickAndVerify(queryCardPage.useEmail);
        email = faker.internet().emailAddress();
        clickAndSendKeys(queryCardPage.emailBox2, email);
    }
    @Given("User clicks on password box and enters a valid password.")
    public void user_clicks_on_password_box_and_enters_a_valid_password() {
        password = faker.internet().password(6,10,true,true, true);
        System.out.println(password);
        clickAndSendKeys(queryCardPage.passwordBox2, password);
    }
    @Given("User clicks on signUp button and verifies that he-she registered.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_registered() throws InterruptedException {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
        Thread.sleep(500);
        assertTrue(queryCardPage.signText.isDisplayed());
    }
    @Given("User clicks on signUp button and verifies that he-she did not registered.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_did_not_registered() {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
        assertTrue(queryCardPage.blankAlert.isDisplayed());
    }
    @Given("User clicks on signUp button and verifies that he-she did not registered2.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_did_not_registered2() {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
        assertTrue(queryCardPage.signUp2.isDisplayed());
    }
    @Given("User clicks on phoneBox and enters an invalid phone number.")
    public void user_clicks_on_phone_box_and_enters_an_invalid_phone_number() {
        phoneNumber = "1234";
        clickAndSendKeys(queryCardPage.emailBox2, phoneNumber);
    }
    @Given("User chooses -*Use email instead- and clicks on email box then enters an invalid email.")
    public void user_chooses_and_clicks_on_email_box_then_enters_an_invalid_email() {
        clickAndVerify(queryCardPage.useEmail);
        email = "wrongemail";
        clickAndSendKeys(queryCardPage.emailBox2, email);
    }
    @Given("User clicks on password box and enters an invalid password.")
    public void user_clicks_on_password_box_and_enters_an_invalid_password() {
        password = faker.internet().password(1,4,false,false,false);
        clickAndSendKeys(queryCardPage.passwordBox2, password);
    }
    @Given("User clicks on the product and verifies that he-she navigated to the product page.")
    public void user_clicks_on_the_product_and_verifies_that_he_she_navigated_to_the_product_page() {
        koordinatTiklamaMethodu(275,1300);
        assertTrue(queryCardPage.productHeader.isDisplayed());
    }
    @Given("User displays product header and context.")
    public void user_displays_product_header_and_context() {
        assertTrue(queryCardPage.productDetails.isDisplayed());
        assertTrue(queryCardPage.productDetailsContext.isDisplayed());
    }
    @Given("User displays the Product Videos title and product videos.")
    public void user_displays_the_product_videos_title_and_product_videos() {
        queryCardPage.videosButton.click();
        queryCardPage.videosTitle.isDisplayed();
        queryCardPage.reviewButton.click();
        queryCardPage.reviewTitle.isDisplayed();
        queryCardPage.shippingButton.click();
        queryCardPage.shippingTitle.isDisplayed();
    }
    @Given("User displays the Review title and reviews of the product.")
    public void user_displays_the_review_title_and_reviews_of_the_product() {
        queryCardPage.reviewButton.click();
        queryCardPage.reviewTitle.isDisplayed();
    }
    @Given("User displays the Shipping&Return heading and the shipping and return conditions.")
    public void user_displays_the_shipping_return_heading_and_the_shipping_and_return_conditions() {
        queryCardPage.shippingButton.click();
        queryCardPage.shippingTitle.isDisplayed();
    }

    @Given("User navigates to Order History and views an order history detail.")
    public void user_navigates_to_order_history_and_views_an_order_history_detail() {
        clickAndVerify(queryCardPage.profileButton);
        clickAndVerify(queryCardPage.orderHistory);
        assertTrue(queryCardPage.orderHistory.isDisplayed());
        koordinatTiklamaMethodu(500,500);
        assertTrue(queryCardPage.orderHistoryPage.isDisplayed());
    }
    @Given("User displays the receipt.")
    public void user_displays_the_receipt() {
        scrollDown(500,1);
        clickAndVerify(queryCardPage.downloadReceipt);
        assertTrue(queryCardPage.receipt.isDisplayed());
    }
    @Given("User cancels the order and verifies that the order is canceled.")
    public void user_cancels_the_order() {
        clickAndVerify(queryCardPage.cancelOrder);
        scrollUp(500,1);
        assertTrue(queryCardPage.canceledOrder.isDisplayed());
    }
    @Given("User adds the product to the cart and displays the cart.")
    public void user_adds_the_product_to_the_cart_and_displays_the_cart() {
        clickAndVerify(queryCardPage.size);
        scrollDown(1000,1);
        clickAndVerify(queryCardPage.addToCartButton);
        koordinatTiklamaMethodu(980,1685);
    }
    @Given("User proceeds to checkout.")
    public void user_proceeds_to_checkout() {
        clickAndVerify(queryCardPage.proceedToCheckout);
        koordinatTiklamaMethodu(470,602);
        scrollDown(500,1);
        clickAndVerify(queryCardPage.savePay);
    }
    @Given("User selects stripe payment method and enters the credentials")
    public void user_selects_stripe_payment_method_and_enters_the_credentials() {
        assertTrue(queryCardPage.paymentMethod.isDisplayed());
        clickAndVerify(queryCardPage.stripe);
        clickAndVerify(queryCardPage.confirmOrderButton);
    }

//======================================================================================================================
    //Reyyan US12 TC01/02
    @Given("Verify that the Women's Category window is displayed on the homepage.")
    public void verify_that_the_women_s_category_window_is_displayed_on_the_homepage() {

    }

    @Given("Click on the Women's category window.")
    public void click_on_the_women_s_category_window() {

    }

    @Given("Click a product on the products page.")
    public void click_a_product_on_the_products_page() {

    }

    @Given("Verify that the product is displayed.")
    public void verify_that_the_product_is_displayed() {

    }
    @Given("Verify that the filtering icon {string} and {string} is visible and active.")
    public void verify_that_the_filtering_icon_and_is_visible_and_active(String string, String string2) {

    }

    @Given("Verify that a product's add to cart button is active on the products page.")
    public void verify_that_a_product_s_add_to_cart_button_is_active_on_the_products_page() {

    }
    //US13
    @Given("Verify that your profile icon is visible.")
    public void verify_that_your_profile_icon_is_visible() {

    }

    @Given("Verify that the Dashboard page is displayed.")
    public void verify_that_the_dashboard_page_is_displayed() {

    }

    @Given("Click the My Account button.")
    public void click_the_my_account_button() {

    }

    @Given("Verify that summary information boards are displayed.")
    public void verify_that_summary_information_boards_are_displayed() {

    }

    @Given("Verify that order History is displayed on the My account page")
    public void verify_that_order_history_is_displayed_on_the_my_account_page() {

    }
    //US17 TC01/02
    @Given("Verify that the Change Password button is visible on the Dashboard page.")
    public void verify_that_the_change_password_button_is_visible_on_the_dashboard_page() {

    }

    @Given("Click the Change Password button.")
    public void click_the_change_password_button() {

    }

    @Given("On the Change Password page, verify that the Old password, New password, Confirm password text boxes are visible.")
    public void on_the_change_password_page_verify_that_the_old_password_new_password_confirm_password_text_boxes_are_visible() {

    }

    @Given("On the Change Password page, click the Old password box.")
    public void on_the_change_password_page_click_the_old_password_box() {

    }

    @Given("Enter your current password in the Old password box.")
    public void enter_your_current_password_in_the_old_password_box() {

    }

    @Given("Enter the new password in the New password box.")
    public void enter_the_new_password_in_the_new_password_box() {

    }

    @Given("Enter the new password in the Confirm password box.")
    public void enter_the_new_password_in_the_confirm_password_box() {

    }

    @Given("Press the Save Changes button.")
    public void press_the_save_changes_button() {

    }

    @Given("Verify that the password has been updated.")
    public void verify_that_the_password_has_been_updated() {

    }
    @Given("Enter the invalid password in the Confirm password box.")
    public void enter_the_invalid_password_in_the_confirm_password_box() {

    }

    @Given("Verify that Password not matched text is visible.")
    public void verify_that_password_not_matched_text_is_visible() {

    }
//US24

    @Given("Verify that the cart icon is visible on the Home Page.")
    public void verify_that_the_cart_icon_is_visible_on_the_home_page() {

    }

    @Given("Click the cart icon.")
    public void click_the_cart_icon() {

    }

    @Given("Verify that added products are displayed.")
    public void verify_that_added_products_are_displayed() {

    }

    @Given("Verify that subtotal information is visible.")
    public void verify_that_subtotal_information_is_visible() {

    }

    @Given("Click the trash can icon to delete the Junior School Bag product.")
    public void click_the_trash_can_icon_to_delete_the_junior_school_bag_product() {

    }

    @Given("Click the Go to Shopping button as there are no items left in the cart.")
    public void click_the_go_to_shopping_button_as_there_are_no_items_left_in_the_cart() {

    }

    @Given("Click on one of the products on the home page.")
    public void click_on_one_of_the_products_on_the_home_page() {

    }

    @Given("Click the size icon.")
    public void click_the_size_icon() {

    }

    @Given("Click the Add to Cart button.")
    public void click_the_add_to_cart_button() {

    }

    @Given("Click the Cart icon to see the added product.")
    public void click_the_cart_icon_to_see_the_added_product() {

    }

    @Given("Click the address to send to in Shipping Address.")
    public void click_the_address_to_send_to_in_shipping_address() {

    }

    @Given("Click the Proceed to Checkout button.")
    public void click_the_proceed_to_checkout_button() {

    }

    @Given("Verify that the payment page is displayed.")
    public void verify_that_the_payment_page_is_displayed() {

    }


//======================================================================================================================
    //Azim



//======================================================================================================================
    //Senayda



//======================================================================================================================
    //Hümeyra



//======================================================================================================================
    //Murat


}
