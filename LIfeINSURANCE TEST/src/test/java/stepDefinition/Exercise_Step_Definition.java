package stepDefinition;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Exercise;
import utulitis.Driver;

public class Exercise_Step_Definition {
	Driver driver = new Driver();
	Exercise exercise = new Exercise();
	@Given("User get that url {string}")
	public void user_get_that_url(String string) {
	  Driver.getDriver().get(string);
		
	}

	@When("User see screen as successfully open")
	public void user_see_screen_as_successfully_open() {
		assertEquals( exercise.value1.isDisplayed(), "true");
		
	}

	@Then("user should see there are five values")
	public void user_should_see_there_are_five_values() {
		assertEquals( exercise.value1.isDisplayed(), "true");
		assertEquals( exercise.value2.isDisplayed(), "true");
		assertEquals( exercise.value3.isDisplayed(), "true");
		assertEquals( exercise.value4.isDisplayed(), "true");
		assertEquals( exercise.value5.isDisplayed(), "true");
		
		
	}
	
	@Then("user should see values are more than {int}")
	public void user_should_see_values_are_more_than(Integer int1) {
	    int value1 = Integer.parseInt(exercise.value1_money.getText().toString().substring(1));
	    int value2 = Integer.parseInt(exercise.value2_money.getText().toString().substring(1));
	    int value3 = Integer.parseInt(exercise.value3_money.getText().toString().substring(1));
	    int value4 = Integer.parseInt(exercise.value4_money.getText().toString().substring(1));
	    int value5 = Integer.parseInt(exercise.value5_money.getText().toString().substring(1));
	    
	    assertEquals( value1>int1, "true");
		assertEquals( value2>int1, "true");
		assertEquals( value3>int1, "true");
		assertEquals( value4>int1, "true");
		assertEquals( value5>int1, "true");
	}
	
	@Then("user should see total balance equal to sum of values")
	public void user_should_see_total_balance_equal_to_sum_of_values() {
		int value1 = Integer.parseInt(exercise.value1_money.getText().toString().substring(1));
	    int value2 = Integer.parseInt(exercise.value2_money.getText().toString().substring(1));
	    int value3 = Integer.parseInt(exercise.value3_money.getText().toString().substring(1));
	    int value4 = Integer.parseInt(exercise.value4_money.getText().toString().substring(1));
	    int value5 = Integer.parseInt(exercise.value5_money.getText().toString().substring(1));
	    long totalBalance = (long) Integer.parseInt(exercise.totalBalance_Value.getText().toString().substring(1));
	    long total = (value1+value2+value3+value4+value5);
	    assertEquals( totalBalance, total);
	    
	}
	
	@Then("user should see all value is in correct currencies")
	public void user_should_see_all_value_is_in_correct_currencies() {
		String value1 = exercise.value1_money.getText().toString().substring(1);
		String value2 = exercise.value2_money.getText().toString().substring(1);
		String value3 = exercise.value3_money.getText().toString().substring(1);
		String value4 = exercise.value4_money.getText().toString().substring(1);
		String value5 = exercise.value5_money.getText().toString().substring(1);
		assertEquals( value1, "122,365.24");
		assertEquals( value2, "599.00");
		assertEquals( value3, "850,139.99");
		assertEquals( value4, "23,329.50");
		assertEquals( value5, "566.27");
	}
}
