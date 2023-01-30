package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.SeleniumAssignment.Main.driver;

public class Deactivate {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        String searchx = "//input[starts-with(@placeholder, 'Search by')]";

        String scrollx = "//datatable-row-wrapper[1]/datatable-body-row";

        String iconx = "//datatable-row-wrapper/datatable-body-row/div[@id='block']/div/i[starts-with(@class,'ft-user-x')]";

        Actions actions = new Actions(driver);

        isPresent(searchx);
        WebElement search = driver.findElement(By.xpath(searchx));
        Main.sendKeys(driver,search,10,"6382666524");

        Thread.sleep(10000);

        isPresent(scrollx);
        WebElement scroll = driver.findElement(By.xpath(scrollx));
        actions.moveToElement(scroll).build().perform();

        Thread.sleep(5000);

        isPresent(iconx);
        WebElement de = driver.findElement(By.xpath(iconx));
        Main.clickOn(driver,de,10);

        isPresent("//button[contains(text(),'Deactivate')]");
        WebElement confirm = driver.findElement(By.xpath("//button[contains(text(),'Deactivate')]"));
        Main.clickOn(driver,confirm,10);

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
}