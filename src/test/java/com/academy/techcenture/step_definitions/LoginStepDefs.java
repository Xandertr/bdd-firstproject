package com.academy.techcenture.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    @Given("user is launches the browser")
    public void user_is_launches_the_browser() {
        System.out.println("Launching Chrome");
    }
    @Given("user nagivates to the login page")
    public void user_nagivates_to_the_login_page() {
        System.out.println("User is navigated to the login page");
    }
    @Given("user enters {string} in username input box")
    public void user_enters_in_username_input_box(String username) {
        System.out.println("Entering the "+username+" to the login page");
    }
    @Given("user enters {string} in password input box")
    public void user_enters_in_password_input_box(String password) {
        System.out.println("Entering the "+password+" to the login page ");
    }
    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("clicking on login button");
    }
    @Then("user should be nagivated to the orders page")
    public void user_should_be_nagivated_to_the_orders_page() {
        System.out.println("navigating to the orders page");
    }
}
