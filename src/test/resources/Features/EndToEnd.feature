@EndToEnd
Feature: User buys a product.
  Scenario: User should buy a product.
    * User logs in "ihsanEmail".
    * Verify that the Women's Category window is displayed and clicked on the home page.
    * User navigates to back for 3 time.
    * Click on the Wish List icon and verify that it is active.
    * User clicks on 800,550.
    * User adds the product to the cart and displays the cart.
    * User proceeds to checkout.
    * User selects stripe payment method and enters the credentials
    * User navigates to Order History and views an order history detail.
    * User displays the receipt.
