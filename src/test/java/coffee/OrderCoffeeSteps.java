package coffee;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderCoffeeSteps {

    Customer cathy = new Customer();
    Barista barry = new Barista();
    String cathysOrder;

    @Given("^Cathy is (\\d+) meters from the coffee shop$") // regex that allows in
    public void cathy_is_n_meters_from_the_coffee_shop(Integer distanceInMeters) {
        cathy.setDistanceFromShop(distanceInMeters);
    }

    @When("^Cathy orders a (.*)$")
    public void cathy_orders_a_(String order) {
        cathysOrder = order;
        cathy.placesOrderFor(cathysOrder);
    }

    @Then("^Barry should receive the order$")
    public void barry_should_receive_the_order() {

        assertThat(barry.getsPendingOrders(), hasItem(cathysOrder));
    }

    @Then("^Barry should know that the coffee is Urgent$")
    public void barry_should_know_that_the_coffee_is_urgent() {

        assertThat(barry.getsUrgentOrders(), hasItem(cathysOrder));
    }
}