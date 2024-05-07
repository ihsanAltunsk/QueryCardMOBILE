#Reporter : Reyyan Mert
#US Priority : HIGHEST

Feature: As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations
  Background:
    * User logs in "reyyanEmail".
  Scenario:
    * User clicks on the product and verifies that he-she navigated to the product page.
    * User adds the product to the cart and displays the cart.
    * Verify that subtotal information is visible.
    * Click on the trash icon to delete the product.
    * Since there are no items left in the cart, click the Go Shopping button.

  Scenario:
    * User clicks on the product and verifies that he-she navigated to the product page.
    * User adds the product to the cart and displays the cart.
    * User proceeds to checkout.

