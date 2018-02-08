package Pageobjects;

import Utilities.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactus extends CommonFunctions {


    @FindBy(name = "your-name")
    public WebElement name;

    @FindBy(name = "your-email")
    public WebElement email ;

    @FindBy(name = "your-company")
    public WebElement company;


    @FindBy(name = "your-message")
    public WebElement message;

    @FindBy(id = "contact-us-send")
    public WebElement send;

    @FindBy(className = "wpcf7-response-output wpcf7-display-none fusion-alert wpcf7-mail-sent-ng")
    public WebElement Actualresult;



    public Contactus(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
