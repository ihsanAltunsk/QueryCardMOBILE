#Reporter : Azim Kaya
#US Priority : MEDIUM
  Feature: As a user, I would like to be able to see the categories and products of the Juniors menu on the home page.

Scenario:Juniors category window should be displayed in the main page body. Test that products on Juniors category page can be added to cart.
  * Verify that the Juniors Category window is displayed on the homepage.
  * Click on the Juniors category window.
  * Click a Juniors product on the products page.
  * Verify that the Juniors product is displayed.

Scenario:Test that products on Juniors category page can be added to cart.
  * Verify that the Juniors Category window is displayed on the homepage.
  * Click on the filter icon in the Juniors category window.
  * Click on Sort By,Price Lov to High on the products page.
  * Verify that products are filtered by price from cheap to expensive.

Scenario:Adding products from Juniors category page to the favorites list
  * Verify that the Juniors Category window is displayed on the homepage.
  * Click a Juniors favori button on the products page.
  * Verify that a product's add to favorites list the products page.