package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.ValidationUtilities.validateURL;

public class TestCase6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        System.out.println("\nTest Case 1: Validate ComfyElite Contact Us Page heading section\n");

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();
        validateURL(driver,"https://comfyelite.com/contact-us" );

        WebElement sendButton = driver.findElement(By.xpath("//button[@tccltracking='click']"));


        Thread.sleep(3000);



        System.out.println("Validation SEND button "+(sendButton.isDisplayed() && sendButton.isEnabled()? "PASSED":"FAILED"));
        System.out.println(sendButton.getText());
        System.out.println("Validation SEND button text"+(sendButton.getText().equals("SEND")?"PASSED":"FAILED"));

        Driver.quitDriver();
    }
}
