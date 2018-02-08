package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonFunctions {


    public static WebDriver driver;

    public void openBrowser()
    {
        System.setProperty("webdriver.gecko.driver",System.getProperty("/Users/karthik/Desktop/Selenium/geckodriver"));
        //System.setProperty("webdriver.chrome.driver",FilePaths.chromepath);
        driver=new FirefoxDriver();
    }
    public void closeBrowser()
    {
        driver.quit();
    }


    // Action commands:
    public void type(WebElement k, String value){
        k.sendKeys(value);
    }

    // click button, link, checkbox,radio,popup

    public static void click(WebElement element){
        element.click();
    }

    // clear data from edit field
    public static void clear(WebElement element){
        element.clear();
    }


    // Implicit wait:
    public static  void implicitwait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Explicit wait:
    public static void waitUntilElementVisible(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }



}
