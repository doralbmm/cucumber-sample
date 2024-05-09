package com.glue;

import com.sample.Hello;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by duongnapham on 3/2/15.
 */
public class HelloWord {
    private static Hello hello;
    private static String hi;

    @Given("^I have a hello app with \"(.*?)\"$")
    public void i_have_a_hello_app_with(String greeting) {
        System.out.println(greeting);
        hello = new Hello(greeting);
    }

    @When("^I ask it to say hi$")
    public void i_ask_it_to_say_hi() {
        hi = hello.sayHi();
    }

    @Then("^it should answer with \"(.*?)\"$")
    public void it_should_answer_with(String expectedHi) {
        assertEquals(expectedHi, hi);
    }

}
