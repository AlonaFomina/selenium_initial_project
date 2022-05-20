package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.ValidationUtilities.validateURL;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();
        validateURL(driver,"https://comfyelite.com/contact-us" );

        WebElement contactUsHead = driver.findElement(By.xpath("//h2/span[@data-ux='Element']"));
        WebElement sendUsAMessage = driver.findElement(By.xpath("//h4[@data-ux='HeadingMinor']"));

        System.out.println("Validation of Contact Us " + (contactUsHead.isDisplayed()?"PASSED":"FALSE"));
        System.out.println("Validation Send Us Message " + (sendUsAMessage.isDisplayed()?"PASSED":"FALSE"));


        Driver.quitDriver();
    }
}
