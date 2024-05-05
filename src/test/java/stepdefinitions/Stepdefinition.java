package stepdefinitions;

import hooks.Base;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class Stepdefinition extends Base {

    //ihsan
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
        clickAndVerify(queryCardPage.addToCartButton);
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
        scrollDown(5,1);
        Thread.sleep(2000);
        koordinatTiklamaMethodu(84,1622);//Size
        Thread.sleep(4000);
        queryCardPage.addToCartElementi.click();
        Thread.sleep(3000);
        clickAndVerify(queryCardPage.cartİcon);
        queryCardPage.proceedToCheckoutButton.click();
        Thread.sleep(3000);
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

    }

    @Given("Shipping address information is updated.")
    public void shipping_address_information_is_updated() {

    }

    @Given("Shipping  yeni adres bilgileri eklenir.")
    public void shipping_yeni_adres_bilgileri_eklenir() {

    }

    //US19-TC01
    @Given("Logout link is displayed in Dashboard sidebar and it is verified to be active.")
    public void logout_link_is_displayed_in_dashboard_sidebar_and_it_is_verified_to_be_active() {
        clickAndVerify(queryCardPage.logoutButton);
    }
    @Given("The logout link is clicked and it is verified that you can successfully log out of the site.")
    public void the_logout_link_is_clicked_and_it_is_verified_that_you_can_successfully_log_out_of_the_site() {

    }
    //US23-TC01
    @Given("Verify that the Wishlist icon is displayed.")
    public void verify_that_the_wishlist_icon_is_displayed() {
        queryCardPage.homePageWishlistButton.isDisplayed();
    }
    @Given("Click on the Wish List icon and verify that it is active.")
    public void click_on_the_wish_list_icon_and_verify_that_it_is_active() {
        clickAndVerify(queryCardPage.homePageWishlistButton);
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
       queryCardPage.menButton.sendKeys(Keys.ENTER);
    }
    @Given("Verify that the Product Wish List icon is displayed and active.")
    public void verify_that_the_product_wish_list_icon_is_displayed_and_active() {
        clickAndVerify(queryCardPage.corapFavoriButton);
        queryCardPage.corapFavoriButton.isDisplayed();

    }
    @Given("The selected product is added to the favorite list.")
    public void the_selected_product_is_added_to_the_favorite_list() {
        koordinatTiklamaMethodu(449,405);
        //driver.navigate().back();
    }
    @Given("The products added on the Wishlist page are displayed.")
    public void the_products_added_on_the_wishlist_page_are_displayed() {

    }
//======================================================================================================================
    //Senayda US01 =============================================================
    @Given("User verifies the site's logo on the Home Page.")
    public void user_verifies_the_site_s_logo_on_the_home_page() {
       assertTrue(queryCardPage.homePageLogo.isDisplayed());
    }
// US03
    @Given("User verifies products and product features on the homepage")
    public void user_verifies_products_and_product_features_on_the_homepage() {
        assertTrue(queryCardPage.mostPopularLabel.isDisplayed());
        koordinatTiklamaMethodu(278,1063);
   }
    @Given("User confirms that the size-color and quantity features of the selected product are selectable")
    public void user_confirms_that_the_size_color_and_quantity_features_of_the_selected_product_are_selectable() {
    scrollDown(500,1);
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

//======================================================================================================================
    //Murat



}
