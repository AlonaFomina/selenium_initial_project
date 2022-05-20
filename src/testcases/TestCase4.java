package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

import static utils.ValidationUtilities.validateURL;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();
        validateURL(driver, "https://comfyelite.com/contact-us");

        WebElement comfyeLogo = driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        WebElement headerLogo = driver.findElement(By.xpath("//h2[@data-ux='Tagline']"));


        List<WebElement> input = driver.findElements(By.xpath("//input[@data-ux='InputFloatLabel']"));
        List<WebElement> inputLabel = driver.findElements(By.xpath("//label[@data-ux='InputFloatLabelLabel']"));
        String[] expectedLabel = {"First Name*", "Last Name*", "Email*"};
        String[] expectedKey = {"John", "Doe", "johndoe@gmail.com"};

        WebElement messageBox = driver.findElement(By.xpath("//textarea[@data-ux='InputTextArea']"));

        for (int i = 0; i < inputLabel.size(); i++) {
            input.get(i).sendKeys(expectedKey[i]);
            System.out.println("Validation of " + expectedLabel[i].substring(0, expectedLabel[i].length() - 1) + " " +
                    (input.get(i).isDisplayed() && input.get(i).isEnabled()
                            && input.get(i).getAttribute("value").equals(expectedKey[i])
                            && inputLabel.get(i).getText().equals(expectedLabel[i])
                            ? "PASSED" : "FAILED"));

        }


        Driver.quitDriver();
    }
}
