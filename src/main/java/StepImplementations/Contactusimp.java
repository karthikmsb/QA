package StepImplementations;
import cucumber.api.DataTable;
import Pageobjects.Contactus;
import Utilities.CommonFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import java.util.List;

public class Contactusimp extends CommonFunctions {

    Contactus Con=new Contactus(driver);



    public void i_am_on_the_QAWorks_Site() throws Throwable {

        implicitwait(30);
        driver.get("http://www.qaworks.com/contact-us/");


    }



    public void i_send_the_Data(DataTable dataTable) throws Throwable {
        List<List<String>> data=dataTable.raw();

        Con.name.sendKeys(data.get(1).get(1));
        Con.email.sendKeys(data.get(2).get(1));
        Con.company.sendKeys(data.get(3).get(1));
        Con.message.sendKeys(data.get(4).get(1));

        Con.send.click();
    }

    @Then("^i able to send message$")
    public void i_able_to_send_message() throws Throwable {

        String actualResult=Con.Actualresult.getText();
        String Expectedresult="Message Sent";

        Assert.assertEquals(actualResult,Expectedresult);
    }





}
