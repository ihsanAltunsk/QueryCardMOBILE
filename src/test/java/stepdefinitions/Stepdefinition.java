package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class Stepdefinition extends Base {

    //ihsan
    //US04
    @Given("User clicks on signUp button and displays the signUp page")
    public void user_clicks_on_sign_up_button_and_displays_the_sign_up_page() {
        clickAndVerify(queryCardPage.signUpButton);
        assertTrue(queryCardPage.signUp1.isDisplayed());
    }
    //US04
    @Given("User clicks on name box and enters a valid name.")
    public void user_clicks_on_name_box_and_enters_a_valid_name() {
        name = faker.name().fullName();
        clickAndSendKeys(queryCardPage.nameBox, name);
    }
    //US04
    @Given("User chooses -*Use email instead- and clicks on email box then enters a valid email.")
    public void user_chooses_and_clicks_on_email_box_then_enters_a_valid_email() {
        clickAndVerify(queryCardPage.useEmail);
        email = faker.internet().emailAddress();
        clickAndSendKeys(queryCardPage.emailBox2, email);
    }
    //US04
    @Given("User clicks on password box and enters a valid password.")
    public void user_clicks_on_password_box_and_enters_a_valid_password() {
        password = faker.internet().password(6,10,true,true, true);
        clickAndSendKeys(queryCardPage.passwordBox2, password);
    }
    //US04
    @Given("User clicks on signUp button and verifies that he-she registered.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_registered() throws InterruptedException {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
        Thread.sleep(500);
        assertTrue(queryCardPage.signText.isDisplayed());
    }
    //US04
    @Given("User clicks on signUp button and verifies that he-she did not registered.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_did_not_registered() {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
        assertTrue(queryCardPage.blankAlert.isDisplayed());
    }
    //US04
    @Given("User clicks on signUp button and verifies that he-she did not registered2.")
    public void user_clicks_on_sign_up_button_and_verifies_that_he_she_did_not_registered2() {
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.signUp2);
        assertTrue(queryCardPage.signUp2.isDisplayed());
    }
    //US04
    @Given("User clicks on phoneBox and enters an invalid phone number.")
    public void user_clicks_on_phone_box_and_enters_an_invalid_phone_number() {
        phoneNumber = "1234";
        clickAndSendKeys(queryCardPage.emailBox2, phoneNumber);
    }
    //US04
    @Given("User chooses -*Use email instead- and clicks on email box then enters an invalid email.")
    public void user_chooses_and_clicks_on_email_box_then_enters_an_invalid_email() {
        clickAndVerify(queryCardPage.useEmail);
        email = "wrongemail";
        clickAndSendKeys(queryCardPage.emailBox2, email);
    }
    //US04
    @Given("User clicks on password box and enters an invalid password.")
    public void user_clicks_on_password_box_and_enters_an_invalid_password() {
        password = faker.internet().password(1,4,false,false,false);
        clickAndSendKeys(queryCardPage.passwordBox2, password);
    }
    //US09-US21
    @Given("User clicks on the product and verifies that he-she navigated to the product page.")
    public void user_clicks_on_the_product_and_verifies_that_he_she_navigated_to_the_product_page() throws InterruptedException {
        Thread.sleep(3000);
        koordinatTiklamaMethodu(275,1300);
        assertTrue(queryCardPage.productHeader.isDisplayed());
    }
    //US09
    @Given("User displays product header and context.")
    public void user_displays_product_header_and_context() {
        assertTrue(queryCardPage.productDetails.isDisplayed());
        assertTrue(queryCardPage.productDetailsContext.isDisplayed());
    }
    //US09
    @Given("User displays the Product Videos title and product videos.")
    public void user_displays_the_product_videos_title_and_product_videos() {
        queryCardPage.videosButton.click();
        queryCardPage.videosTitle.isDisplayed();
        queryCardPage.reviewButton.click();
        queryCardPage.reviewTitle.isDisplayed();
        queryCardPage.shippingButton.click();
        queryCardPage.shippingTitle.isDisplayed();
    }
    //US09
    @Given("User displays the Review title and reviews of the product.")
    public void user_displays_the_review_title_and_reviews_of_the_product() {
        queryCardPage.reviewButton.click();
        queryCardPage.reviewTitle.isDisplayed();
    }
    //US09
    @Given("User displays the Shipping&Return heading and the shipping and return conditions.")
    public void user_displays_the_shipping_return_heading_and_the_shipping_and_return_conditions() {
        queryCardPage.shippingButton.click();
        queryCardPage.shippingTitle.isDisplayed();
    }
    //US15
    @Given("User navigates to Order History and views an order history detail.")
    public void user_navigates_to_order_history_and_views_an_order_history_detail() throws InterruptedException {
        koordinatTiklamaMethodu(500,500);
        Thread.sleep(5000);
    }
    //US15
    @Given("User displays the receipt.")
    public void user_displays_the_receipt() throws InterruptedException {
        scrollDown(500,1);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.downloadReceipt);
        Thread.sleep(5000);
    }
    //US15
    @Given("User cancels the order and verifies that the order is canceled.")
    public void user_cancels_the_order() {
        clickAndVerify(queryCardPage.cancelOrder);
        scrollUp(500,1);
        assertTrue(queryCardPage.canceledOrder.isDisplayed());
    }
    //US21
    @Given("User adds the product to the cart and displays the cart.")
    public void user_adds_the_product_to_the_cart_and_displays_the_cart() throws InterruptedException {
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.size);
        scrollDown(1000,1);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.addToCartButton);
        Thread.sleep(5000);
        koordinatTiklamaMethodu(980,1685);
        Thread.sleep(2000);
    }
    //US21
    @Given("User proceeds to checkout.")
    public void user_proceeds_to_checkout() throws InterruptedException {
        clickAndVerify(queryCardPage.proceedToCheckout);
        Thread.sleep(2000);
        koordinatTiklamaMethodu(470,602);
        scrollDown(500,1);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.savePay);
        Thread.sleep(2000);
    }
    //US21
    @Given("User selects stripe payment method and enters the credentials")
    public void user_selects_stripe_payment_method_and_enters_the_credentials() throws InterruptedException {
        clickAndVerify(queryCardPage.stripe);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.confirmOrderButton);
        Thread.sleep(5000);
        card_number = 4242424242424242L;
        cc = 1234;
        cvc = 567;
        zip = 34000;
        Thread.sleep(1000);
        clickAndSendKeys(queryCardPage.nameBox, Long.toString(card_number));
        Thread.sleep(1000);
        actions.
                sendKeys(Integer.toString(cc)).
                sendKeys(Integer.toString(cvc)).
                sendKeys(Integer.toString(zip)).
                perform();
        Thread.sleep(4000);
        clickAndVerify(queryCardPage.confirm);
        Thread.sleep(8000);
        clickAndVerify(queryCardPage.goToOrder);
        Thread.sleep(4000);
    }

//======================================================================================================================
//Reyyan US12 TC01/02
    @Given("Verify that the Women's Category window is displayed and clicked on the home page.")
    public void verify_that_the_women_s_category_window_is_displayed_on_the_homepage() throws InterruptedException {
        Thread.sleep(3000);
        ekranKaydirmaMethodu(900,750,500,170,750,5);
        Thread.sleep(3000);
        clickAndVerify(queryCardPage.womanButton);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.search);
        Thread.sleep(2000);
        actions.sendKeys(queryCardPage.emailTextBox,"dress").perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(8000);
        clickAndVerify(queryCardPage.fav);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.fav2);
    }
    @Given("Click on a product on the Products page and verify that it is displayed")
    public void click_a_product_on_the_products_page() {
        clickAndVerify(queryCardPage.womanShoes);
    }
    @Given("Verify that the filtering icon Color and Quantity is visible and active.")
    public void verify_that_the_filtering_icon_and_is_visible_and_active() throws InterruptedException {
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.colorWhite);
        Thread.sleep(2000);
        ekranKaydirmaMethodu(504,1754,500,504,1332,1);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.quantity);
    }
    @Given("Verify that a product's add to cart button is active on the products page.")
    public void verify_that_a_product_s_add_to_cart_button_is_active_on_the_products_page() throws InterruptedException {
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.addToCartButton);
    }
    @Given("Inside the filter the Brand filters appear and verify that they are active.")
    public void ınside_the_filter_the_brand_filters_appear_and_verify_that_they_are_active() throws InterruptedException {
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.brands);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.brandConverse);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.xButonu);
        Thread.sleep(2000);
        assertTrue(queryCardPage.brandFoundText.isDisplayed());
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.converseFoundProduct);
        Thread.sleep(1000);
    }
    @Given("Inside the filter the Size filters appear and verify that they are active.")
    public void ınside_the_filter_the_size_filters_appear_and_verify_that_they_are_active() throws InterruptedException {
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.Size);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.sizeL);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.xButonu);
        Thread.sleep(2000);
        assertTrue(queryCardPage.SizeFoundText.isDisplayed());
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.lSizeFoundProduct);
        Thread.sleep(1000);

    }
    @Given("Inside the filter the Color filters appear and verify that they are active.")
    public void ınside_the_filter_the_color_filters_appear_and_verify_that_they_are_active() throws InterruptedException {
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.color);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.colorBlack);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.xButonu);
        Thread.sleep(2000);
        assertTrue(queryCardPage.colorFoundText.isDisplayed());
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.blackFoundProduct);
        Thread.sleep(1000);
    }
    @Given("Inside the filter the ShortBy filters appear and verify that they are active.")
    public void ınside_the_filter_the_short_by_filters_appear_and_verify_that_they_are_active() throws InterruptedException {
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.sortBy);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.sortByLow);
        Thread.sleep(2000);
        assertTrue(queryCardPage.shortbyFoundText.isDisplayed());
    }

    //US13
    @Given("Verify that summary information boards are displayed.")
    public void verify_that_summary_information_boards_are_displayed() {
        assertTrue(queryCardPage.summaryInformation.isDisplayed());
    }
    @Given("Verify that order History is displayed on the My account page")
    public void verify_that_order_history_is_displayed_on_the_my_account_page() {
        assertTrue(queryCardPage.orderHistory.isDisplayed());
    }

    //US17 TC01/02
    @Given("On the Control Panel page, verify that the Change Password button appears and is clickable.")
    public void verify_that_the_change_password_button_is_visible_on_the_dashboard_page() {
        clickAndVerify(queryCardPage.changePassword);
    }
    @Given("Enter your current {string} in the old password box, {string} in the New password box, and {string} in the Confirm password box.")
    public void enter_your_current_in_the_old_password_box_in_the_new_password_box_and_in_the_confirm_password_box(String password, String newpassword1, String newpassword2) {
        clickAndSendKeys(queryCardPage.oldPasswordBox,password);
        clickAndSendKeys(queryCardPage.newPasswordBox,newpassword1);
        clickAndSendKeys(queryCardPage.confirmPasswordBox,newpassword2);
        koordinatTiklamaMethodu(227,1853);
        clickAndVerify(queryCardPage.saveChanges);
    }
    @Given("Verify that the password has been updated.")
    public void verify_that_the_password_has_been_updated() {
        assertTrue(queryCardPage.passwordChangeVerify.isDisplayed());
    }
    @Given("Verify that Password not matched text is visible.")
    public void verify_that_password_not_matched_text_is_visible() {
        assertTrue(queryCardPage.notMatchedText.isDisplayed());
    }

    //US24
    @Given("Verify that subtotal information is visible.")
    public void verify_that_subtotal_information_is_visible() {
        assertTrue(queryCardPage.subtotalVerify.isDisplayed());
    }
    @Given("Click on the trash icon to delete the product.")
    public void click_on_the_trash_icon_to_delete_the_product() {
        clickAndVerify(queryCardPage.productDelete);
    }
    @Given("Since there are no items left in the cart, click the Go Shopping button.")
    public void since_there_are_no_items_left_in_the_cart_click_the_go_shopping_button() {
        clickAndVerify(queryCardPage.goToShopping);
    }

    //======================================================================================================================
    //Azim
    //US11-TC01
    @Given("Verify that the Juniors Category window is displayed on the homepage.")
    public void verify_that_the_juniors_category_window_is_displayed_on_the_homepage() {
        ekranKaydirmaMethodu(900,750, 500, 450,750,16);
        clickAndVerify(queryCardPage.viewJuniors);
    }
    @Given("Verify that the Juniors product is displayed.")
    public void verify_that_the_juniors_product_is_displayed() {
        queryCardPage.JuniorsProduct.isDisplayed();
    }

    //US11-TC03
    @Given("Verify that a product's add to favorites list the products page.")
    public void verify_that_a_product_s_add_to_favorites_list_the_products_page() {

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

    //US16-TC01
    @Given("Click on the product selected for processing.")
    public void click_on_the_product_selected_for_processing() throws InterruptedException {
        Thread.sleep(1000);
        clickAndVerify(queryCardPage.hompageBayankıyafetiElementi);
        Thread.sleep(2000);
        koordinatTiklamaMethodu(84,1622);//Size
        scrollDown(1000,1);
        queryCardPage.addToCartElementi.click();
        koordinatTiklamaMethodu(977,1685);
        queryCardPage.proceedToCheckoutButton.click();
        Thread.sleep(2000);
    }
    @Given("It is verified that the Shipping Information is displayed.")
    public void ıt_is_verified_that_the_shipping_ınformation_is_displayed() {
     queryCardPage.shippingInformationText.isDisplayed();
    }
    @Given("Verify that the delivery button is displayed and active.")
    public void verify_that_the_delivery_button_is_displayed_and_active() {
    clickAndVerify(queryCardPage.deliveryButton);
    }
    @Given("Verify that the pickUp button is displayed and active.")
    public void verify_that_the_pick_up_button_is_displayed_and_active() {
        clickAndVerify(queryCardPage.pickUpButton);
    }
    @Given("It is verified that the order summary is displayed.")
    public void ıt_is_verified_that_the_order_summary_is_displayed() {
    queryCardPage.orderSummaryText.isDisplayed();
    }
    @Given("Verify that the save and pay button is displayed and active.")
    public void verify_that_the_save_and_pay_button_is_displayed_and_active() {
        clickAndVerify(queryCardPage.saveAndPayButton);
    }

    //US16-TC02
    @Given("Shipping address information is verified to be displayed.")
    public void shipping_address_information_is_verified_to_be_displayed() {

    }
    @Given("Click the Delivery button.")
    public void click_the_delivery_button() {
        clickAndVerify(queryCardPage.deliveryButton);
    }
    @Given("It is verified that the shipping address information can be updated.")
    public void ıt_is_verified_that_the_shipping_address_information_can_be_updated() throws InterruptedException {
        koordinatTiklamaMethodu(763,380);
        koordinatTiklamaMethodu(891,424);
        name = faker.name().fullName();
        clickAndSendKeys(queryCardPage.updateFulnameBoxe,name);
        koordinatTiklamaMethodu(292,1699);//Update adres button
        Thread.sleep(2000);
        assertTrue(queryCardPage.shoppingCart.isDisplayed());
    }
    @Given("Shipping verifies that new address information can be added.")
    public void shipping_verifies_that_new_address_information_can_be_added() throws InterruptedException {
        koordinatTiklamaMethodu(946,380);
        Thread.sleep(1000);
        name = faker.name().fullName();
        Thread.sleep(1000);
        clickAndSendKeys( queryCardPage.addAdresFulnameBoxe,name);
        email=faker.internet().emailAddress();
        clickAndSendKeys( queryCardPage.addAdresemailBoxe,email);
        Thread.sleep(2000);
        Select phone=new Select(queryCardPage.addAdresPhoneBoxe);
        phone.selectByIndex(+297);
        Thread.sleep(1000);
        phoneNumber=faker.phoneNumber().phoneNumber();
        clickAndSendKeys(queryCardPage.addAdresPhoneBoxe,phoneNumber);
        Thread.sleep(1000);
        Select addAdresContry=new Select(queryCardPage.addAdresContryBoxe);
        addAdresContry.selectByValue("Turkey");
        Thread.sleep(1000);
        Select addAdresState=new Select(queryCardPage.addAdresStateBoxe);
        addAdresState.selectByValue("Kocaeli Province");
        Thread.sleep(1000);
        Select addAdresCity=new Select(queryCardPage.addAdresCityBoxe);
        addAdresCity.selectByValue("Gebze");
        Thread.sleep(1000);
        zipCode=faker.address().zipCode();
        clickAndSendKeys( queryCardPage.addAdresZipKodeBoxe,zipCode);
        Thread.sleep(1000);
        streetAddress=faker.address().streetAddress();
        clickAndSendKeys( queryCardPage.addAdresStreedAdresBoxe,streetAddress);
        clickAndVerify(queryCardPage.addAdresButton);
        Thread.sleep(1000);
        assertTrue(queryCardPage.addNewAdresVerificationText.isDisplayed());
    }

    //US19-TC01
    @Given("Logout link is displayed in Dashboard sidebar and it is verified to be active.")
    public void logout_link_is_displayed_in_dashboard_sidebar_and_it_is_verified_to_be_active() throws InterruptedException {
        Thread.sleep(2000);
        koordinatTiklamaMethodu(186,1589);
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.logoutprofileButton);
        Thread.sleep(2000);
    }
    @Given("The logout link is clicked and it is verified that you can successfully log out of the site.")
    public void the_logout_link_is_clicked_and_it_is_verified_that_you_can_successfully_log_out_of_the_site() throws InterruptedException {
        assertTrue(queryCardPage.singInToSeeYourInfoText.isDisplayed());
    }

    //US23-TC01
    @Given("Click on the Wish List icon and verify that it is active.")
    public void click_on_the_wish_list_icon_and_verify_that_it_is_active() throws InterruptedException {
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.homePageWishlistButton);
        Thread.sleep(8000);
    }
    @Given("Verify that the categories icon is displayed.")
    public void verify_that_the_categories_icon_is_displayed() {
        queryCardPage.homePageCategoryButton.isDisplayed();
    }
    @Given("Click on the categories icon and verify that it is active.")
    public void click_on_the_categories_icon_and_verify_that_it_is_active() {
        clickAndVerify(queryCardPage.homePageCategoryButton);
    }

    //US23-TC02
    @Given("Click on the main page category icon.")
    public void click_on_the_main_page_category_icon() {
        queryCardPage.homePageCategoryButton.click();
    }
    @Given("Click on the men category product.")
    public void click_on_the_men_category_product() throws InterruptedException {
       Thread.sleep(100);
        clickAndVerify(queryCardPage.menButton);
    }
    @Given("Verify that the Product Wish List icon is displayed and active.")
    public void verify_that_the_product_wish_list_icon_is_displayed_and_active() {
        clickAndVerify(queryCardPage.corapFavoriButton);
        driver.navigate().back();
        clickAndVerify(queryCardPage.homePageWishlistButton);
        queryCardPage.corapFavoriButton.isDisplayed();

    }
    @Given("The selected product is added to the favorite list.")
    public void the_selected_product_is_added_to_the_favorite_list() {
        assertTrue(queryCardPage.wislistProductsFoundText.isDisplayed());
    }
    @Given("The products added on the Wishlist page are displayed.")
    public void the_products_added_on_the_wishlist_page_are_displayed() {
        koordinatTiklamaMethodu(449,405);
        assertTrue(queryCardPage.wislistProductsFoundText.isDisplayed());
    }
    @Given("The product added to the Wish List page is verified as deleted.")
    public void the_product_added_to_the_wish_list_page_is_verified_as_deleted() {
    assertTrue(queryCardPage.wislistProductsFoundText.isDisplayed());
    }

//======================================================================================================================
    //Senayda US01 =============================================================
    @Given("User verifies the site's logo on the Home Page.")
    public void user_verifies_the_site_s_logo_on_the_home_page() {
       assertTrue(queryCardPage.homePageLogo.isDisplayed());
    }

    // US03
    @Given("User verifies products and product features on the homepage")
    public void user_verifies_products_and_product_features_on_the_homepage() throws InterruptedException {
        assertTrue(queryCardPage.mostPopularLabel.isDisplayed());
        koordinatTiklamaMethodu(300,1300);
        Thread.sleep(3000);
    }
    @Given("User confirms that the size-color and quantity features of the selected product are selectable")
    public void user_confirms_that_the_size_color_and_quantity_features_of_the_selected_product_are_selectable() {
    scrollDown(1500,1);
    clickAndVerify(queryCardPage.sizeS);
    clickAndVerify(queryCardPage.quantityNumber);
    }
    @Given("User clicks on Add to Card button on the product detail page")
    public void user_clicks_on_add_to_card_button_on_the_product_detail_page() {
        clickAndVerify(queryCardPage.addToCartButton);
    }
    @Given("User verifies that the price, quantity, and subtotal information of the product added to the cart is visible")
    public void user_verifies_that_the_price_quantity_and_subtotal_information_of_the_product_added_to_the_cart_is_visible() {
        assertTrue(queryCardPage.shoppingCart.isDisplayed());
        assertFalse(queryCardPage.signInButton.isDisplayed());
    }

    // US14
    @Given("User clicks and verifies Address button.")
    public void user_clicks_and_verifies_address_button() {
        clickAndVerify(queryCardPage.addressButton);
    }
    @Given("User should be able to view, edit, delete addresses registered on the Adress page.")
    public void user_should_be_able_to_view_edit_delete_addresses_registered_on_the_adress_page() {
        koordinatTiklamaMethodu(891,424);
        driver.navigate().back();
        koordinatTiklamaMethodu(975,427);
        koordinatTiklamaMethodu(307,1125);
    }
    @Given("User verifies Add New Address button and clicks.")
    public void user_verifies_add_new_address_button_and_clicks() {
        clickAndVerify(queryCardPage.addNewAddressButton);
    }
    @Given("User adds new address information.")
    public void user_adds_new_address_information() {
    name=faker.name().fullName();
    clickAndSendKeys(queryCardPage.nameBox,name);

    email=faker.internet().emailAddress();
    clickAndSendKeys(queryCardPage.emailBox2,email);

    phoneNumber=faker.phoneNumber().phoneNumber();
    clickAndSendKeys(queryCardPage.passwordBox2,phoneNumber);

    country=faker.country().currencyCode();
    clickAndSendKeys(queryCardPage.countryBox,country);

    state=faker.address().state();
    clickAndSendKeys(queryCardPage.stateBox,state);

    city=faker.address().city();
    clickAndSendKeys(queryCardPage.cityBox,city);

    zipCode=faker.address().zipCode();
    clickAndSendKeys(queryCardPage.zipCodeBox,zipCode);

    streetAddress=faker.address().streetAddress();
    clickAndSendKeys(queryCardPage.streetAddressBox,streetAddress);
    koordinatTiklamaMethodu(340,1695);
    }

    // US20
    @Given("User clicks on SignIn button and displays the SignIn page")
    public void user_clicks_on_sign_in_button_and_displays_the_sign_in_page() {
       clickAndVerify(queryCardPage.signInButton);
    }
    @Given("User verifies Forgot Password button and clicks.")
    public void user_verifies_forgot_password_button_and_clicks() {
    clickAndVerify(queryCardPage.useEmailInsteadButton);
    clickAndVerify(queryCardPage.forgotPasswordButton);
    }
    @Given("User verifies Back to SignIn button and clicks.")
    public void user_verifies_back_to_sign_in_button_and_clicks() {
        assertTrue(queryCardPage.backToSignInButton.isDisplayed());
    }
    @Given("User verifies Email button and clicks.")
    public void user_verifies_email_button_and_clicks() {
    clickAndVerify(queryCardPage.emailTextBox);
    clickAndSendKeys(queryCardPage.emailTextBox,"senaydaakkaya@querycart.com");
    }
    @Given("User verifies Get OTP button and clicks.")
    public void user_verifies_get_otp_button_and_clicks() {
        clickAndVerify(queryCardPage.getOTPButton);
    }
    @Given("User sees new Password text box on the Reset Password page and clicks.")
    public void user_sees_new_password_text_box_on_the_reset_password_page_and_clicks() {
        clickAndSendKeys(queryCardPage.newPasswordTextBox,"Query.2905");
    }
    @Given("User sees Confirm Password text box on the Reset Password page and clicks.")
    public void user_sees_confirm_password_text_box_on_the_reset_password_page_and_clicks() {
        clickAndSendKeys(queryCardPage.confirmPasswordTextBox,"Query.2905");
    }
    @Given("User verifies Submit button and clicks.")
    public void user_verifies_submit_button_and_clicks() {
        clickAndVerify(queryCardPage.submitButton);
    }

    //======================================================================================================================
    //Hümeyra
    @Given("Verify that most popular title is visible")
    public void verify_that_most_popular_title_is_visible() {
        assertTrue(queryCardPage.mostPopularLabel.isDisplayed());
    }
    @Given("User displays see All icon and clicks on it")
    public void user_displays_see_all_icon_and_clicks_on_it() {
       clickAndVerify(queryCardPage.seeAllIcon);
    }
    @Given("User displays current product lists under most popular title")
    public void user_displays_current_product_lists_under_most_popular_title() throws InterruptedException {
        Thread.sleep(3);
        assertTrue(queryCardPage.floralPrintMidiDress.isDisplayed());
        assertTrue(queryCardPage.classicCottonTshirt.isDisplayed());
    }
    @Given("Verify that user navigates to back")
    public void verify_that_user_navigates_to_back() {
       assertTrue(queryCardPage.homePageLogo.isDisplayed());
    }
    @Given("User displays men category window and clicks on it")
    public void user_displays_men_category_window_and_clicks_on_it() {
        clickAndVerify(queryCardPage.manCategoryWindow);
    }
    @Given("User chooses adidas3-stripes cushioned crew sock product")
    public void user_chooses_adidas3_stripes_cushioned_crew_sock_product() throws InterruptedException {
        Thread.sleep(4);
        koordinatTiklamaMethodu(275,672);
        Thread.sleep(3);
    }
    @Given("Verify that chosen product is visible")
    public void verify_that_chosen_product_is_visible() {
       assertTrue(queryCardPage.adidas3StripesProduct.isDisplayed());
    }
    @Given("User chooses black color")
    public void user_chooses_black_color() {
        queryCardPage.blackColor.click();
    }
    @Given("User clicks on Add to Card button")
    public void user_clicks_on_add_to_card_button() throws InterruptedException {
       ekranKaydirmaMethodu(547,1490,2,554,1300,1);
       Thread.sleep(3);
       clickAndVerify(queryCardPage.addToCartButton);
       Thread.sleep(3);
    }
    @Given("Verfy that user added product to add to cart")
    public void verfy_that_user_added_product_to_add_to_cart() {
        assertTrue(queryCardPage.successAlert.isDisplayed());
    }
    @Given("User displays filter icon and clicks on it")
    public void user_displays_filter_icon_and_clicks_on_it() {
      koordinatTiklamaMethodu(1010,279);
    }
    @Given("User displays sort by,clicks on it and chooses price high to low")
    public void user_displays_sort_by_clicks_on_it_and_chooses_price_high_to_low() {
       clickAndVerify(queryCardPage.sortBy);
       clickAndVerify(queryCardPage.priceHighToLow);
    }
    @Given("User clicks on filter icon")
    public void user_clicks_on_filter_icon() {
        clickAndVerify(queryCardPage.filterIcon);
    }
    @Given("User displays brand,clicks on it and chooses urban casuals")
    public void user_displays_brand_clicks_on_it_and_chooses_urban_casuals() {
        clickAndVerify(queryCardPage.brands);
        clickAndVerify(queryCardPage.urbanCasuals);
    }
    @Given("User displays size,clicks on it and chooses S")
    public void user_displays_size_clicks_on_it_and_chooses_s() {
       clickAndVerify(queryCardPage.size);
       clickAndVerify(queryCardPage.Ssize);
    }
    @Given("User displays color,clicks on it and chooses black")
    public void user_displays_color_clicks_on_it_and_chooses_black() {
        clickAndVerify(queryCardPage.color);
        scrollDown(2000,1);
        koordinatTiklamaMethodu(69,1575);
    }
    @Given("Verify that a product is visible")
    public void verify_that_a_product_is_visible() {
        assertTrue(queryCardPage.productFound.isDisplayed());
    }
    @Given("User displays edit profile link and clicks on it")
    public void user_displays_edit_profile_link_and_clicks_on_it() {
       clickAndVerify(queryCardPage.editProfile);
    }
    @Given("User displays full name box,clicks and sends {string}")
    public void user_displays_full_name_box_clicks_and_sends(String newFullName) {
    clickAndSendKeys(queryCardPage.fullNameBox,newFullName);
    }
    @Given("User displays email box,clicks and send {string}")
    public void user_displays_email_box_clicks_and_send(String newEmail) {
       clickAndSendKeys(queryCardPage.emailBox2,newEmail);
    }
    @Given("User displays phone box,clicks and send {string}")
    public void user_displays_phone_box_clicks_and_send(String newPhone) {
        clickAndSendKeys(queryCardPage.phoneBox,newPhone);
        scrollDown(2000,1);
    }
    @Given("User displays save change button and clicks on it")
    public void user_displays_save_change_button_and_clicks_on_it() {
        clickAndVerify(queryCardPage.saveChanges);
    }
    @Given("Verify that all changes are saved")
    public void verify_that_all_changes_are_saved() {
        assertTrue(queryCardPage.updatedName.isDisplayed());
    }
    @Given("User displays order history pages and clicks on it")
    public void user_displays_order_history_pages_and_clicks_on_it() {
        clickAndVerify(queryCardPage.orderHistory);
    }
    @Given("User clicks on action button")
    public void user_clicks_on_action_button() {
        koordinatTiklamaMethodu(936,430);
        scrollDown(500,1);
    }
    @Given("User displays return request button and clicks on it")
    public void user_displays_return_request_button_and_clicks_on_it() {
       clickAndVerify(queryCardPage.returnRequestButton);
    }
    @Given("User chooses her product")
    public void user_chooses_her_product() {
       clickAndVerify(queryCardPage.productRadioButton);
    }
    @Given("User clicks on return reason and chooses other")
    public void user_clicks_on_return_reason_and_chooses_other() {
        clickAndVerify(queryCardPage.returnReasonBox);
        clickAndVerify(queryCardPage.other);
    }
    @Given("User clicks on return note and enter {string}")
    public void user_clicks_on_return_note_and_enter_it_is_too_small(String returnNote) {
        clickAndSendKeys(queryCardPage.returnNote,returnNote);
        scrollDown(2000,1);
    }
    @Given("User displays request return and clicks on it")
    public void user_displays_request_return_and_clicks_on_it() {
    clickAndVerify(queryCardPage.requestReturnButton);
    }
    @Given("Verify that the return process has been started")
    public void verify_that_the_return_process_has_been_started() {
        assertTrue(queryCardPage.returnProcess.isDisplayed());
    }
    @Given("User clicks on signIn button")
    public void user_clicks_on_sign_ın_button() {
    clickAndVerify(queryCardPage.signIn);
    }
    @Given("User chooses -*Use email instead- and clicks on email box then enters a valid email {string}")
    public void user_chooses_use_email_instead_and_clicks_on_email_box_then_enters_a_valid_email(String humeyraEmail) {
        clickAndVerify(queryCardPage.useEmail);
        clickAndVerify(queryCardPage.emailBox);
        clickAndSendKeys(queryCardPage.emailBox,humeyraEmail);
    }
    @Given("User displays password box,clicks on it and enter a valid {string}")
    public void user_displays_password_box_clicks_on_it_and_enter_a_valid(String password) {
        clickAndVerify(queryCardPage.passwordBox);
        queryCardPage.passwordBox.sendKeys(password);
    }
    @Given("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        clickAndVerify(queryCardPage.signIn);
    }
    @Given("User displays forgot password link and clicks on it")
    public void user_displays_forgot_password_link_and_clicks_on_it() {
       clickAndVerify(queryCardPage.forgotPassword);
    }
    @Given("Verify that user can access the forgot password page from the login page")
    public void verify_that_user_can_access_the_forgot_password_page_from_the_login_page() {
        assertTrue(queryCardPage.forgotPasswordLabel.isDisplayed());
    }
    @Given("User clicks on Add to Wishlist button")
    public void user_clicks_on_add_to_wishlist_button() {
        clickAndVerify(queryCardPage.addToWishList);
    }
    @Given("Verfy that user added product to add to Wishlist")
    public void verfy_that_user_added_product_to_add_to_wishlist() {
        assertTrue(queryCardPage.signText.isDisplayed());
    }
    @Given("User clicks on category button")
    public void user_clicks_on_category_button() {
        clickAndVerify(queryCardPage.homePageCategoryButton);
    }
    @Given("User displays men title and clicks on it")
    public void user_displays_men_title_and_clicks_on_it() {
        clickAndVerify(queryCardPage.menButton);
    }
    @Given("User displays women title and clicks on it")
    public void user_displays_women_title_and_clicks_on_it() {
        clickAndVerify(queryCardPage.womanButton);
    }
    @Given("User displays jumıor title and clicks on it")
    public void user_displays_jumıor_title_and_clicks_on_it() {
        clickAndVerify(queryCardPage.viewJuniors);
    }

    @Given("Click on he Wish List icon and verify that it is active.")
    public void click_on_the_ish_list_icon_and_verify_that_it_is_active() throws InterruptedException {
        Thread.sleep(2000);
        clickAndVerify(queryCardPage.homePageWishlistButton);
        Thread.sleep(8000);
    }
    @Given("Verify that the catgories icon is displayed.")
    public void verify_that_te_categories_icon_is_displayed() {
        queryCardPage.homePageCategoryButton.isDisplayed();
    }
    @Given("Click on the categores icon and verify that it is active.")
    public void click_on_the_catgories_icon_and_verify_that_it_is_active() {
        clickAndVerify(queryCardPage.homePageCategoryButton);
    }

    //US23-TC02
    @Given("Click on the main age category icon.")
    public void click_on_the_min_page_category_icon() {
        queryCardPage.homePageCategoryButton.click();
    }
    @Given("Click on the men categoy product.")
    public void click_on_the_mn_category_product() throws InterruptedException {
        Thread.sleep(100);
        clickAndVerify(queryCardPage.menButton);
    }
    @Given("Verify that the Prodct Wish List icon is displayed and active.")
    public void verify_that_the_poduct_wish_list_icon_is_displayed_and_active() {
        clickAndVerify(queryCardPage.corapFavoriButton);
        driver.navigate().back();
        clickAndVerify(queryCardPage.homePageWishlistButton);
        queryCardPage.corapFavoriButton.isDisplayed();

    }
}
