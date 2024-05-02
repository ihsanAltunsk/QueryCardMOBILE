package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import utilities.ReusableMethods;

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
        clickAndSendKeys(queryCardPage.passwordBox2, password);
    }
    @Given("User clicks on signUp button and verifies that he-she registered.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_registered() throws InterruptedException {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
    }

//======================================================================================================================
    //Reyyan US12 TC01/02
    @Given("Verify that the Women's Category window is displayed and clicked on the home page.")
    public void verify_that_the_women_s_category_window_is_displayed_on_the_homepage() throws InterruptedException {
        ekranKaydirmaMethodu(900,750,500,170,750,5);
        clickAndVerify(queryCardPage.womanButton);
    }

    @Given("Click on a product on the Products page and verify that it is displayed")
    public void click_a_product_on_the_products_page() throws InterruptedException {
        koordinatTiklamaMethodu(300, 560);
        assertTrue(queryCardPage.womanShoes.isDisplayed());

    }

    @Given("Verify that the filtering icon {string} and {string} is visible and active.")
    public void verify_that_the_filtering_icon_and_is_visible_and_active(String string, String string2) {
        ekranKaydirmaMethodu(553,1745,500,595,1093,1);
        clickAndVerify(queryCardPage.colorWhite);
        assertTrue(queryCardPage.quantity.isDisplayed());
        koordinatTiklamaMethodu(293,982);

    }

    @Given("Verify that a product's add to cart button is active on the products page.")
    public void verify_that_a_product_s_add_to_cart_button_is_active_on_the_products_page() {
        clickAndVerify(queryCardPage.addToCart);

    }
    //US13

    @Given("Click the My Account button.")
    public void click_the_my_account_button() {
        koordinatTiklamaMethodu(274,756);
    }

    @Given("Verify that summary information boards are displayed.")
    public void verify_that_summary_information_boards_are_displayed() {
        assertTrue(queryCardPage.summaryInformation.isDisplayed());
    }

    @Given("Verify that order History is displayed on the My account page")
    public void verify_that_order_history_is_displayed_on_the_my_account_page() {
        assertTrue(queryCardPage.orderHistory.isDisplayed());
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
//US11-TC01
@Given("Verify that the Juniors Category window is displayed on the homepage.")
public void verify_that_the_juniors_category_window_is_displayed_on_the_homepage() {
    ekranKaydirmaMethodu(900,750, 500, 450,750,16);
    clickAndVerify(queryCardPage.viewJuniors);
}
    @Given("Click on the Juniors category window.")
    public void click_on_the_juniors_category_window() {

        koordinatTiklamaMethodu(468,760);
    }
    @Given("Click a Juniors product on the products page.")
    public void click_a_juniors_product_on_the_products_page() {
        koordinatTiklamaMethodu(234,566);
    }
    @Given("Verify that the Juniors product is displayed.")
    public void verify_that_the_juniors_product_is_displayed() {
        queryCardPage.JuniorsProduct.isDisplayed();
    }
//US11-TC03
   @Given("Click a Juniors favori button on the products page.")
   public void click_a_juniors_favori_button_on_the_products_page() {
    koordinatTiklamaMethodu(449,405);
    }
    @Given("Verify that a product's add to favorites list the products page.")
    public void verify_that_a_product_s_add_to_favorites_list_the_products_page() {

    }
    @Given("Click on the filter icon in the Juniors category window.")
    public void click_on_the_filter_icon_in_the_juniors_category_window() {
        koordinatTiklamaMethodu(1008,281);
    }
    @Given("Click on Sort By,Price Lov to High on the products page.")
    public void click_on_sort_by_price_lov_to_high_on_the_products_page() {
        koordinatTiklamaMethodu(146,278);
        koordinatTiklamaMethodu(102,581);
        koordinatTiklamaMethodu(252,599);
        koordinatTiklamaMethodu(255,600);
        driver.navigate().back();
        scrollDown(200,1);
        koordinatTiklamaMethodu(230,1403);
    }
    @Given("Verify that products are filtered by price from cheap to expensive.")
    public void verify_that_products_are_filtered_by_price_from_cheap_to_expensive() {

    }
    //US19-TC01
    @Given("Logout link is displayed in Dashboard sidebar and it is verified to be active.")
    public void logout_link_is_displayed_in_dashboard_sidebar_and_it_is_verified_to_be_active() {
        queryCardPage.logoutButton.isDisplayed();
        queryCardPage.logoutButton.click();

    }
    @Given("The logout link is clicked and it is verified that you can successfully log out of the site.")
    public void the_logout_link_is_clicked_and_it_is_verified_that_you_can_successfully_log_out_of_the_site() {

    }


//======================================================================================================================
    //Senayda US01 =============================================================

    @Given("User verifies the site's logo on the Home Page.")
    public void user_verifies_the_site_s_logo_on_the_home_page() {
       assertTrue(queryCardPage.homePageLogo.isDisplayed());
    }

    // US02 ===================================================================
    @Given("User clicks and verifies the Home button")
    public void user_clicks_and_verifies_the_home_button() {
        koordinatTiklamaMethodu(106,1724);
    }

    @Given("User clicks and verifies the Category button")
    public void user_clicks_and_verifies_the_category_button() {
        koordinatTiklamaMethodu(325,1695);
    }

    @Given("User clicks and verifies the Cart button")
    public void user_clicks_and_verifies_the_cart_button() {
    koordinatTiklamaMethodu(541,1651);
    }

    @Given("User clicks and verifies the Profile button")
    public void user_clicks_and_verifies_the_profile_button() {
    koordinatTiklamaMethodu(975,1728);
    }

    @Given("User sees the site logo at the top left of the page and clicking on it refreshes the homepage")
    public void user_sees_the_site_logo_at_the_top_left_of_the_page_and_clicking_on_it_refreshes_the_homepage() {
    koordinatTiklamaMethodu(201,117);
    }

    @Given("User displays the Search Text Box and performs a search")
    public void user_displays_the_search_text_box_and_performs_a_search() {
    koordinatTiklamaMethodu(1005,117);
    }

//======================================================================================================================
    //Hümeyra



//======================================================================================================================
    //Murat


}
