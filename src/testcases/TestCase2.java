package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import static utils.ValidationUtilities.*;

public class TestCase2   {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();
        validateURL(driver,"https://comfyelite.com/contact-us" );

        WebElement comfyeLogo = driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        WebElement headerLogo = driver.findElement(By.xpath("//h2[@data-ux='Tagline']"));
        WebElement faceBookLink = driver.findElement(By.xpath("(//a[@rel='noopener'])[1]"));
        WebElement instaLogo = driver.findElement(By.xpath("(//a[@rel='noopener'])[2]"));



        System.out.println(comfyeLogo.isDisplayed() ? "PASSED": "FAILED");
        System.out.println(headerLogo.isDisplayed() ? headerLogo.getText()+ "PASSED": headerLogo.getText()+"FAILED");
        System.out.println(faceBookLink.getAttribute("href").equals("https://www.facebook.com/103179127717601"));
        System.out.println(instaLogo.getAttribute("href").equals("https://www.instagram.com/comfyelite"));


        Driver.quitDriver();
    }
}
