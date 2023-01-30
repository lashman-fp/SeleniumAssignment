package org.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SearchByPhone {

    public static void main(String[] args) throws InterruptedException {
        Main login = new Main();

        login.login();

        WebDriver driver = Main.webDriver();

        WebElement name = driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Search by')]"));
        Main.sendKeys(driver,name,10,"987654321");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement search = driver.findElement(By.xpath("//div[starts-with(@class, 'search__close')]"));
        Main.clickOn(driver, search, 10);

    }
}



