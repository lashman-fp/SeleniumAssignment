package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.SeleniumAssignment.Main.driver;

public class Impersonate {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        String searchx = "//input[starts-with(@placeholder, 'Search by')]";

        String scrollx = "//datatable-row-wrapper[1]/datatable-body-row";

        String iconx = "//datatable-row-wrapper[1]/datatable-body-row/div[@id='block']/div/div[starts-with(@class,'ft')]";

        Actions actions = new Actions(driver);

        isPresent(searchx);
        WebElement search = driver.findElement(By.xpath(searchx));
        Main.sendKeys(driver,search,10,"6382666524");

        isPresent(scrollx);
        WebElement scroll = driver.findElement(By.xpath(scrollx));
        actions.moveToElement(scroll).build().perform();

        isPresent(iconx);
        WebElement imp = driver.findElement(By.xpath(iconx));
        actions.moveToElement(imp).click().build().perform();

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