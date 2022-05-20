package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.ValidationUtilities.validateURL;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();

        WebElement singUp = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement input = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));


        singUp.click();
        validateURL(driver,"https://comfyelite.com/contact-us" );
        Thread.sleep(1000);

        System.out.println("Checked box validation "+(input.isSelected()?"PASSED":"FAILED"));

        singUp.click();
        Thread.sleep(1000);
        System.out.println("Checked box validation "+(!input.isSelected()?"PASSED":"FAILED"));

        Driver.quitDriver();
    }
}
