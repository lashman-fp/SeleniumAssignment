package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Main {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        login();
    }

    public static void login() throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        ChromeDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://neverland.freshprints.com/dashboard/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.xpath("//input[@id='form-email']"));
        sendKeys(driver,email,10,"lashman@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='form-password']"));
        sendKeys(driver,password,10,"lashman@1234");

        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        clickOn(driver, login, 10);

        String path = "//a[starts-with(@href,'https://v4-qa.freshprints.com/dashboard/users?login=')]";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement users = driver.findElement(By.xpath(path));
        clickOn(driver, users, 10);
    }

    public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
        new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
        new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static Boolean isPresent(String path) {
        // Check if the element is present
        boolean isPresent = !driver.findElements(By.xpath(path)).isEmpty();

        if (isPresent) {
            System.out.println("The element is present on the page");
        } else {
            System.out.println("The element is not present on the page");
        }
        return isPresent;
    }

    public static WebDriver webDriver() {
        return driver;
    }
}