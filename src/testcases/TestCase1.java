package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));

        contactUs.click();

        WebElement comfyeLogo = driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        WebElement headerLogo = driver.findElement(By.xpath("//h2[@data-ux='Tagline']"));

        System.out.println("Comfy Elite Logo validation " + (comfyeLogo.isDisplayed() ? "PASSED": "FAILED"));
        System.out.println("Header 2 validation " + (headerLogo.isDisplayed() ? headerLogo.getText()+ "PASSED": headerLogo.getText()+"FAILED"));

        Driver.quitDriver();
    }
}
