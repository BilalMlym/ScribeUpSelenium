package scribeup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {

    WebDriver driver;

    @BeforeTest
    public void BeforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void HeaderButton() {
        driver.get("https://www.scribeup.io/");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        WebElement AboutButton = driver
                .findElement(By.xpath("//div[@class='header-display-desktop']//a[normalize-space()='About']"));
        WebElement RiskFreeTrialsButton = driver.findElement(
                By.xpath("//div[@class='header-display-desktop']//a[normalize-space()='Risk-Free Trials']"));
        WebElement ArticlesButton = driver
                .findElement(By.xpath("//div[@class='header-display-desktop']//a[normalize-space()='Articles']"));
        WebElement FAQButton = driver.findElement(By.xpath(
                "//div[@class='header-display-desktop']//div[@class='header-title-nav-wrapper']//div[@class='header-nav']//div[@class='header-nav-wrapper']//nav[@class='header-nav-list']//div[@class='header-nav-item header-nav-item--collection']//a[@href='/faqs']"));
        WebElement MyAccountButton = driver
                .findElement(By.xpath("//div[@class='header-display-desktop']//a[normalize-space()='My Account']"));

        AboutButton.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        driver.navigate().back();
        RiskFreeTrialsButton.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        driver.navigate().back();
        ArticlesButton.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        driver.navigate().back();
        FAQButton.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        driver.navigate().back();
        MyAccountButton.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", "");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        driver.quit();
    }

}
