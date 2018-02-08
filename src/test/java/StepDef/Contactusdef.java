package StepDef;

import StepImplementations.Contactusimp;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contactusdef {

    Contactusimp cimp=new Contactusimp();


    @Given("^I am on the QAWorks Site$")
    public void i_am_on_the_QAWorks_Site() throws Throwable {
        cimp.i_am_on_the_QAWorks_Site();

    }


    @When("^I send the Data$")
    public void i_send_the_Data(DataTable dataTable) throws Throwable {

        cimp.i_send_the_Data(dataTable);

    }

    @Then("^i able to send message$")
    public void i_able_to_send_message() throws Throwable {
        cimp.i_able_to_send_message();

    }



}
