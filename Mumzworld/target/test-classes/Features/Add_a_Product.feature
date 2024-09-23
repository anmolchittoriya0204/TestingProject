Feature: To Verify the add product and register a customer
  As a User, I want to add a product and register a new customer

  @sanity
  Scenario: Add a product and register a new customer
    Given I am on the mumzworld website
    When I search for the product
    And I add the product to the bag
    And I view the cart
    And I increase the quantity to 5
    And I click on the proceed to checkout
    Then I register a new user
