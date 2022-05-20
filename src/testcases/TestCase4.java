package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static utils.ValidationUtilities.validateURL;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();
        validateURL(driver,"https://comfyelite.com/contact-us" );

        WebElement comfyeLogo = driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        WebElement headerLogo = driver.findElement(By.xpath("//h2[@data-ux='Tagline']"));
        WebElement firstName= driver.findElement(By.xpath("(//div/input[@data-ux='InputFloatLabel'])[1]"));
        WebElement lastName= driver.findElement(By.xpath("(//div/input[@data-ux='InputFloatLabel'])[2]"));
        WebElement email = driver.findElement(By.xpath("(//div/input[@data-ux='InputFloatLabel'])[3]"));
        WebElement messageBox = driver.findElement(By.xpath("//div/textarea[@data-ux='InputTextArea']"));


        System.out.println("Validation of Comfy logo " + (comfyeLogo.isDisplayed() ? "PASSED": "FAILED"));
        System.out.println("Validation of header " + (headerLogo.isDisplayed() ? headerLogo.getText()+ "PASSED": headerLogo.getText()+"FAILED"));
        System.out.println("Validation of first name input " + (firstName.isDisplayed() && firstName.isEnabled()?"PASSED":"FAILED"));
        System.out.println("Validation of last name input "+(lastName.isDisplayed() && lastName.isEnabled()?"PASSED":"FAILED"));
        System.out.println("Validation of email input"+(email.isDisplayed() && email.isEnabled()?"PASSED":"FAILED"));
        System.out.println("Validation of message box "+(messageBox.isDisplayed() && messageBox.isEnabled()?"PASSED":"FAILED"));

        Driver.quitDriver();
    }
}
